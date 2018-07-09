package com.sachin.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapVSWeakHashMap {
	public static void main(String args[])
	{
		Demo demo = new Demo();
		//HashMap hm = new HashMap();
		WeakHashMap hm = new WeakHashMap<>();
		hm.put(demo, "DemoTest");
		demo = null;
		System.gc();
		System.out.println(""+hm);
		
	}

}

class Demo
{
	Demo()
	{
		
	}
 public String toString()
 {
	 return "demo";
 }
 
 @Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	 System.out.println("Object has been deleted");
	super.finalize();
}
}