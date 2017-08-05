class Parent1
{
	protected void test()
	{
		System.out.println("Testing in progress");
	}
}
class Child1 extends Parent1
{
	protected void test()
	{
		System.out.println("Test");
	}
}
public class TestAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 ch1 = new Child1();
		ch1.test();

	}

}
