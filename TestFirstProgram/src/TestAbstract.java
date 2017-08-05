interface Test
{
	public void test1();
	public void test2();
}
abstract class FirstAbstract implements Test 
{
	public abstract void firsTest();
	public void test1()
	{
		System.out.println("Test1 Method");
	}
}

class SecondTest1 extends FirstAbstract
{
	public void firsTest()
	{
		System.out.println("Abstract Test");
	}
	public void test2()
	{
		System.out.println("Test2 Method");
	}
}
public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstAbstract firsttest = new SecondTest1();
		firsttest.firsTest();
		firsttest.test2();
		FirstAbstract f1 = new FirstAbstract() {
			
			@Override
			public void test2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void firsTest() {
				// TODO Auto-generated method stub
				
			}
		};
		f1.test1();
	}

}
