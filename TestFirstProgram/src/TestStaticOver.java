class Testover
{
	public static void test()
	{
		System.out.println("Parent static method");
	}
}
class Testoverchild extends Testover
{
	public static void test()
	{
		System.out.println("Child static method");
	}
}


public class TestStaticOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testover.test();
		Testoverchild.test();
	}

}
