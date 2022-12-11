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
package com.db4o.internal;

import com.db4o.ext.*;


/**
 * @exclude
 */
public class LazyObjectReference implements ObjectInfo{
	
	private final Transaction _transaction;
	
	private final int _id;	
	
	public LazyObjectReference(Transaction transaction, int id){
		_transaction = transaction;
		_id = id;
	}

	public long getInternalID() {
		return _id;
	}

	public Object getObject() {
		synchronized(containerLock()){
			return reference().getObject();
		}
	}

	public Db4oUUID getUUID() {
		synchronized(containerLock()){
			return reference().getUUID();
		}
	}

	public long getVersion() {
		synchronized(containerLock()){
			return reference().getVersion();
		}
	}
	
	public ObjectReference reference() {
		final HardObjectReference hardRef = _transaction.container().getHardObjectReferenceById(_transaction, _id);
		return hardRef._reference;
	}
	
	private Object containerLock(){
		_transaction.container().checkClosed();
		return _transaction.container().lock();
	}

}
