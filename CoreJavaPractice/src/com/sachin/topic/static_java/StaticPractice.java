package com.sachin.topic.static_java;

import com.sachin.topic.static_java.StaticExample.StaticInnerClass;

public class StaticPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.setCount(6);
		StaticExample staticExample = new StaticExample();
		System.out.println(staticExample.getCount());
		StaticExample.StaticInnerClass staticInnerClass = new StaticInnerClass();
		System.out.println(staticInnerClass.noCount());
		staticExample = StaticObject.getStaticExampleObject();
		System.out.println("" + staticExample.getCount());

	}

}

class StaticExample {
	static int count = 5;

	static {
		System.out.println("Static Block");
		System.out.println("Count is " + count);
	}

	public static void setCount(int b) {
		count = count + b;
	}

	public int getCount() {
		return count;
	}

	static class StaticInnerClass {
		public int noCount() {
			return count;
		}
	}
}

class StaticObject // util class which return a object
{
	static StaticExample staticExample;

	public static StaticExample getStaticExampleObject() {
		staticExample = new StaticExample();
		staticExample.setCount(9);
		return staticExample;
	}

}