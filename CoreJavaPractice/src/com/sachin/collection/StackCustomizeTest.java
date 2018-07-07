package com.sachin.collection;

import java.util.Arrays;

public class StackCustomizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizeStack<Integer> customStack = new CustomizeStack<Integer>();
		customStack.push(6);
		customStack.push(56);
		customStack.push(96);
		customStack.push(69);
		customStack.pop();
		System.out.println("TTTT "+customStack.peek());
		customStack.display();
		

	}

}

class CustomizeStack<E>
{
	int size = 0;
	Object[] elementData ;
	public static final int INITIAL_CAPACITY = 10;
	public CustomizeStack() {
		// TODO Auto-generated constructor stub
		elementData = new Object[INITIAL_CAPACITY];
	}
	public void push(E e)
	{
		ensureCapacity();
		elementData[size] = e;
		size++;
	}
	public void ensureCapacity()
	{
		if(size == elementData.length)
		{
			elementData = Arrays.copyOf(elementData, 2*INITIAL_CAPACITY);
		}
	}
	public Object pop()
	{
		if (size == 0 || size >= elementData.length)
		{
			return new NoSuchFieldException("No element");
		}
		else
		{
			Object objectInfo = elementData[size--];
			return objectInfo; 
			
		}
	}
	public E peek()
	{
		if (size == 0 || size >= elementData.length)
		{
			return (E) new NoSuchFieldException("No element");
		}
		else
		{
			Object objectInfo = elementData[0];
			return (E) objectInfo;
			
		}
	}
	public void display()
	{
		for(int i =0;i< size;i++)
		{
			System.out.println(" "+elementData[i]);
		}
	}
}
