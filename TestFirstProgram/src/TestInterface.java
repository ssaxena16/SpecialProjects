interface Test12
{
	int a= 8;
	public void testinterface();
	default void msg()
	{
		System.out.println("java 8 default method feature");
	}
	static int cube(int x)
	{
		return x*x*x;
	}
}
class TestIfc implements Test12
{
	public void testinterface()
	{
		System.out.println(""+a);
	}
	
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test12 test = new TestIfc();
		test.testinterface();
		test.msg();
		System.out.println("java 8 static method feature in interface ="+ Test12.cube(5));

}
}