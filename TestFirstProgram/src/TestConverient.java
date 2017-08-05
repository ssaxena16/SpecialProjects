class A
{
	A getA()
	{
		return this;
	}
	public void display()
	{
		System.out.println("A");
	}
}
class B extends A
{
	B getA()
	{
		return this;
	}
	public void display()
	{
		System.out.println("B");
	}
}
public class TestConverient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A a = new A();
     a = new B();
     B b = (B)a.getA();
     b.display();
	}

}
