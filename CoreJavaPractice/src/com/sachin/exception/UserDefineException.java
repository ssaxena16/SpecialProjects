package com.sachin.exception;

public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {90,45,55,49,51};
		for(int i = 0; i<marks.length ; i++)
		{
			if(marks[i] < 50)
			{
				try {
					throw (new MyException("Marks are less than 50"));
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(""+marks[i]);
		}

	}

}


class MyException extends Exception
{
	MyException()
	{
		
	}
	MyException(String msg)
	{
		super(msg);
	}
}
