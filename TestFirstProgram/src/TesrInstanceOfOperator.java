interface printable
{
	
}
class A1 implements printable
{
	public void a()
	{
		System.out.println("a method for class A1");
	}
}
class B1 implements printable
{
	public void b()
	{
		System.out.println("b method for class B1");
	}
}

class C
{
	public void c(printable p)
	{
		if(p instanceof A1)
		{
			A1 a = (A1)p;
			a.a();
		}
		else if(p instanceof B1)
		{
			
			B1 b = (B1)p;
			b.b();
		}
	}
}
public class TesrInstanceOfOperator {

	public static void main(String[] args) {
		// TODO A1uto-generated method stub
		printable p = new B1();
		C c = new C();
		c.c(p);
		

	}

}
