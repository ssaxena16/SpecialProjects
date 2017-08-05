class Overload
{
	double sum;
	public void add(int a , int b)
	{
		sum = a+b;
		System.out.println("Sum with two args is "+sum);
	}
	public void addInteger(int a, int b, int c)
	{
		sum = a+b+c;
		System.out.println("Sum with three args is "+sum);
	}
	public void add(double a, double b)
	{
		sum = a+b;
		System.out.println("Sum with three args is "+sum);
	}
	public void add(long a, long b)
	{
		sum = a+b;
		System.out.println(""+sum);
	}
}

public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stubO
		Overload overload = new Overload();
		overload.add(5, 6);
		overload.add( 12345678910L, 12345678910L);
	}

}
