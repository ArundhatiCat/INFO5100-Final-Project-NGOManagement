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
package com.db4o.test.legacy.soda.collections;

import java.util.*;

import com.db4o.query.*;
import com.db4o.test.legacy.soda.*;

public class STHashtableED implements STClass {
	
	public static transient SodaTest st;
	
	public static class ExtendHashtable extends Hashtable{
	}
	
	protected ExtendHashtable vec(Object[] objects){
		ExtendHashtable h = new ExtendHashtable();
		for (int i = 0; i < objects.length; i++) {
			h.put(objects[i], new Integer(i));
		}
		return h;
	}

	public Object[] store() {
		return new Object[] {
			vec(new Object[] { new Integer(6778), new Integer(6779)}), 
			vec(new Object[] { new Integer(6778), new Integer(6789)}),
			vec(new Object[] { "foo677", new STElement("bar677", "barbar677")}),
			vec(new Object[] { "foo6772", new STElement("bar677", "barbar2677")})
		};
	}
	
	public void testDefaultContainsInteger() {
		Query q = st.query();
		Object[] r = store();
		q.constrain(vec(new Object[] { new Integer(6778)}));
		st.expect(q, new Object[] { r[0], r[1] });
	}

	public void testDefaultContainsString() {
		Query q = st.query();
		Object[] r = store();
		q.constrain(vec(new Object[] { "foo677" }));
		st.expect(q, new Object[] { r[2] });
	}

	public void testDefaultContainsTwo() {
		Query q = st.query();
		Object[] r = store();
		q.constrain(vec(new Object[] { new Integer(6778), new Integer(6789)}));
		st.expect(q, new Object[] { r[1] });
	}

	public void testDefaultContainsObject() {
		Query q = st.query();
		Object[] r = store();
		q.constrain(vec(new Object[] { new STElement("bar677", null)}));
		st.expect(q, new Object[] { r[2], r[3] });
	}
	
}