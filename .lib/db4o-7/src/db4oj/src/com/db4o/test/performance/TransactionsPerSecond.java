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
package com.db4o.test.performance;

import java.io.*;
import com.db4o.*;

public class TransactionsPerSecond {
    
    public static void main(String[] args) {
        new TransactionsPerSecond().run();
    }
    
    public static class Item{
        public int _int;
        public Item(){
        }
        public Item(int int_){
            _int = int_;
        }
    }
    
    private static final String FILE = "tps.db4o";
    
    private static final long TOTAL_COUNT = 5000;
    
    public void run(){
        
        // This switch will make a big difference:
        Db4o.configure().flushFileBuffers(false);
        
        new File(FILE).delete();
        
        ObjectContainer objectContainer = Db4o.openFile(FILE).ext();
        
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < TOTAL_COUNT; i++) {
            objectContainer.store(new Item(i));
            objectContainer.commit();
        }
        
        long stop = System.currentTimeMillis();
        long duration = stop - start;
        objectContainer.close();
        
        System.out.println("Time to store " + TOTAL_COUNT + " objects: " + duration + "ms");
        
        double seconds = ((double)duration) / ((double)1000); 
        double tps = TOTAL_COUNT / seconds;
        
        System.out.println("Transactions per second: " + tps);
    }

}
