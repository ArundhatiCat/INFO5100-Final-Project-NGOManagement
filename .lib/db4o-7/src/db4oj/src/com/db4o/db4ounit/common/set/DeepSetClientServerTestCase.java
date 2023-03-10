/* Copyright (C) 2004 - 2008  db4objects Inc.  http://www.db4o.com

This file is part of the db4o open source object database.

db4o is free software; you can redistribute it and/or modify it under
the terms of version 2 of the GNU General Public License as published
by the Free Software Foundation and as clarified by db4objects' GPL 
interpretation policy, available at
http://www.db4o.com/about/company/legalpolicies/gplinterpretation/
Alternatively you can write to db4objects, Inc., 1900 S Norfolk Street,
Suite 350, San Mateo, CA 94403, USA.

db4o is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. */
package com.db4o.db4ounit.common.set;

import com.db4o.ext.*;

import db4ounit.*;
import db4ounit.extensions.*;

public class DeepSetClientServerTestCase extends Db4oClientServerTestCase {
	
	public static void main(String[] args) {
		new DeepSetClientServerTestCase().runAll();
	}
	
	public static class Item {
		public Item child;
		public String name;
	}

	protected void store() {
		Item item = new Item();
		item.name = "1";
		item.child = new Item();
		item.child.name = "2";
		item.child.child = new Item();
		item.child.child.name = "3";
		store(item);
	}
	
	public void test() throws Exception {
		ExtObjectContainer oc1 = openNewClient();
		ExtObjectContainer oc2 = openNewClient();
		ExtObjectContainer oc3 = openNewClient();
		Item example = new Item();
		example.name = "1";
		try {
			Item item1 = (Item) oc1.queryByExample(example).next();
			Assert.areEqual("1", item1.name);
			Assert.areEqual("2", item1.child.name);
			Assert.areEqual("3", item1.child.child.name);

			Item item2 = (Item) oc2.queryByExample(example).next();
			Assert.areEqual("1", item2.name);
			Assert.areEqual("2", item2.child.name);
			Assert.areEqual("3", item2.child.child.name);

			item1.child.name = "12";
			item1.child.child.name = "13";
			oc1.store(item1, 2);
			oc1.commit();

			// check result
			Item item = (Item) oc1.queryByExample(example).next();
			Assert.areEqual("1", item.name);
			Assert.areEqual("12", item.child.name);
			Assert.areEqual("13", item.child.child.name);

			item = (Item) oc2.queryByExample(example).next();
			oc2.refresh(item, 3);
			Assert.areEqual("1", item.name);
			Assert.areEqual("12", item.child.name);
			Assert.areEqual("3", item.child.child.name);

			item = (Item) oc3.queryByExample(example).next();
			Assert.areEqual("1", item.name);
			Assert.areEqual("12", item.child.name);
			Assert.areEqual("3", item.child.child.name);
		} finally {
			oc1.close();
			oc2.close();
			oc3.close();
		}
	}

}
