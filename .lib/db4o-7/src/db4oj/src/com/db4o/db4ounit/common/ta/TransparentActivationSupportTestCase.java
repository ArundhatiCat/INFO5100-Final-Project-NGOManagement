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
package com.db4o.db4ounit.common.ta;

import com.db4o.activation.*;
import com.db4o.events.*;
import com.db4o.ext.*;
import com.db4o.foundation.*;
import com.db4o.internal.activation.*;

import db4ounit.*;

public class TransparentActivationSupportTestCase extends TransparentActivationTestCaseBase {

	public static void main(String[] args) {
		new TransparentActivationSupportTestCase().runAll();
	}
	
	public void testActivationDepth() {
		Assert.isInstanceOf(TransparentActivationDepthProvider.class, stream().configImpl().activationDepthProvider());
	}
	
	public final class Item extends ActivatableImpl {
		public void update() {
			activate(ActivationPurpose.WRITE);
		}
	}
	
	public void testTransparentActivationDoesNotImplyTransparentUpdate() {
		final Item item = new Item();
		db().store(item);
		db().commit();
		
		item.update();
		final Collection4 updated = commitCapturingUpdatedObjects(db());
		Assert.areEqual(0, updated.size());
	}
	
	private Collection4 commitCapturingUpdatedObjects(
			final ExtObjectContainer container) {
		final Collection4 updated = new Collection4();
		eventRegistryFor(container).updated().addListener(new EventListener4() {
			public void onEvent(Event4 e, EventArgs args) {
				ObjectEventArgs objectArgs = (ObjectEventArgs)args;
				updated.add(objectArgs.object());
			}
		});
		container.commit();
		return updated;
	}
}
