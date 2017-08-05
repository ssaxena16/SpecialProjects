package com.sachin.innerclass;
interface TestInterface
{
	   int firstvar=45;
	 public void testInterface();
}
class Test2
{
	TestInterface testinterface = new TestInterface() {
		
		@Override
		public void testInterface() {
			// TODO Auto-generated method stub
		 //firstvar=200;
			System.out.println("Testing "+firstvar);
		}
	};
}
public class TestinnerAnonyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test2 test2 = new Test2();
     test2.testinterface.testInterface();
	}

}
