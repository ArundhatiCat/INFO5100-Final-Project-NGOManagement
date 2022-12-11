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
package com.db4o.test;

import java.io.*;

import com.db4o.*;


public class ReadOnly implements Runnable{
	
	private static final String FILE = "readonly.yap";
	private static final int COUNT = 100;
	private static final String MY_STRING = "ReadOnly test instance ";
	
	public String myString;
	
	public static void main(String [] args){
		Db4o.configure().readOnly(true);
		new ReadOnly().spendSomeTime();
		Db4o.configure().readOnly(false);	
	}
	
	public void run(){
		setUp();
		test();
		Db4o.configure().readOnly(false);	
	}
	
	private void setUp(){
		new File(FILE).delete();
		ObjectContainer con = Db4o.openFile(FILE);
		for (int i = 0; i < COUNT; i++) {
			ReadOnly ro = new ReadOnly();
			ro.myString = MY_STRING + i;
			con.store(ro);
		}
		con.close();
	}
	
	private void test(){
		Db4o.configure().readOnly(true);
		checkCount();
		ObjectContainer con = Db4o.openFile(FILE);
		con.store(new ReadOnly());
		con.close();
		checkCount();
		try{
			/*
			Process pcs = Runtime.getRuntime().exec(new String[] {"javaw", "com.db4o.test.ReadOnly"}, null,  new File("D:\\db4o\\"));
			InputStream in = pcs.getInputStream();
			while(in.available() > 0){
				System.out.print(in.read());
			}
			*/
		}catch(Exception e){
		}
	}
	
	private void spendSomeTime(){
		Db4o.configure().readOnly(true);
		ObjectContainer con = Db4o.openFile(FILE);
		ObjectSet set = con.queryByExample(new ReadOnly());
		while(set.hasNext()){
			ReadOnly ro = (ReadOnly)set.next();
			if(ro.myString.equals(MY_STRING + "1")){
				System.out.println("O.K. " + ro.myString);
			}
			if(ro.myString.equals(MY_STRING + (COUNT - 1))){
				System.out.println("O.K. " + ro.myString);
			}
			synchronized(this){
				try{
					this.wait(50);
				}catch(Exception e){
				}
			}
		}
		con.close();
	}
	
	private void checkCount(){
		Db4o.configure().readOnly(true);
		ObjectContainer con = Db4o.openFile(FILE);
		int size = con.queryByExample(new ReadOnly()).size();
		if (size != COUNT){
			throw new RuntimeException("ReadOnly.test: unexpected number of objects:" + size);
		}
		con.close();
	}

}
