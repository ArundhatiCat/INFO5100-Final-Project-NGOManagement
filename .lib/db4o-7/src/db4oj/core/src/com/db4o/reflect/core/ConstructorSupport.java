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
package com.db4o.reflect.core;

import com.db4o.*;
import com.db4o.foundation.*;
import com.db4o.internal.*;
import com.db4o.reflect.*;

public class ConstructorSupport {
	
	
    public static ReflectConstructorSpec createConstructor(final ConstructorAwareReflectClass claxx, Class clazz, ReflectorConfiguration config, ReflectConstructor[] constructors){
        
        if (claxx == null) {
			return ReflectConstructorSpec.INVALID_CONSTRUCTOR; 
        }
        
        if (claxx.isAbstract() || claxx.isInterface()) {
        	return ReflectConstructorSpec.INVALID_CONSTRUCTOR;
        }

        if(! Platform4.callConstructor()){
    		boolean skipConstructor = !config.callConstructor(claxx);
            if(!claxx.isCollection()) {
            	ReflectConstructor serializableConstructor = skipConstructor(claxx, skipConstructor, config.testConstructors());
            	if(serializableConstructor != null){
            		return new ReflectConstructorSpec(serializableConstructor, null);
            	}
            }
        }

        if (!config.testConstructors()) {
        	return new ReflectConstructorSpec(new PlatformReflectConstructor(clazz), null);
        }

        if(ReflectPlatform.createInstance(clazz) != null) {
			return new ReflectConstructorSpec(new PlatformReflectConstructor(clazz), null);
		}

		Tree sortedConstructors = sortConstructorsByParamsCount(constructors);
		return findConstructor(claxx, sortedConstructors);
	}

	private static ReflectConstructorSpec findConstructor(final ReflectClass claxx,
			Tree sortedConstructors) {
		if (sortedConstructors == null) {
			return ReflectConstructorSpec.INVALID_CONSTRUCTOR;
		}
		
		Iterator4 iter = new TreeNodeIterator(sortedConstructors);
		while (iter.moveNext()) {
			Object obj = iter.current();
			ReflectConstructor constructor = (ReflectConstructor) ((TreeIntObject) obj)._object;
			ReflectClass[] paramTypes = constructor.getParameterTypes();
			Object[] params = new Object[paramTypes.length];
			for (int j = 0; j < params.length; j++) {
				params[j] = paramTypes[j].nullValue();
			}
			Object res = constructor.newInstance(params);
			if (res != null) {
				return new ReflectConstructorSpec(constructor, params);
			}
		}
		return ReflectConstructorSpec.INVALID_CONSTRUCTOR;
	}
	
	private static Tree sortConstructorsByParamsCount(final ReflectConstructor[] constructors) {
		Tree sortedConstructors = null;

		// sort constructors by parameter count
		for (int i = 0; i < constructors.length; i++) {
			int parameterCount = constructors[i].getParameterTypes().length;
			sortedConstructors = Tree.add(sortedConstructors,
					new TreeIntObject(i + constructors.length * parameterCount,
							constructors[i]));
		}
		return sortedConstructors;
	}
	
    public static ReflectConstructor skipConstructor(ConstructorAwareReflectClass claxx, boolean skipConstructor, boolean testConstructor) {
		if (!skipConstructor) {
			return null;
		}
		ReflectConstructor serializableConstructor = claxx.getSerializableConstructor();
		if (serializableConstructor == null) {
			return null;
		}
		if(!testConstructor || Deploy.csharp) {
			return serializableConstructor;
		}
		Object obj = serializableConstructor.newInstance((Object[]) null);
		if (obj != null) {
			return serializableConstructor;
		}
		return null;
	}


}
