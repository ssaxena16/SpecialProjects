class First
{
	int number =50 ;
	public void firstTest()
	{
		System.out.println("FirstTest");
		
	}
}
class Second extends First
{
	int numbersecond = number + 9;
	public void secondTest()
	{
		System.out.println("Second Test");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Second second = new Second();
		second.secondTest();
		second.firstTest();
		System.out.println(""+ second.numbersecond);
	}

}
