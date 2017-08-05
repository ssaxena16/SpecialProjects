class Parent
{
	int a ;
	int b;
	int test= 90;
	public Parent()
	{
		System.out.println("Parent onstructor");
	}
	public Parent(int a)
	{
		System.out.println("Parent onstructor  "+a);
	}
	public Parent(int a, int b)
	{
		this.a = a;
		this.b = b;
		
	}
	public void display()
	{
		System.out.println(""+a+"  , "+b);
	}
}

class Child extends Parent
{
	int c;
	public Child(int c)
	{
		super();
		System.out.println("Child onstructor");	
	}
	public Child(int a, int b, int c)
	{
		super(a, b);
		this.c =c;
	}
	public void display()
	{
		System.out.println(""+a+"  , "+b+"  , "+c);
		System.out.println(super.test);
	}
}
public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child(23);
		Parent parent1 = new Parent(69);
		Parent parent = new Parent(5, 6);
		parent = new Child(5, 6, 7);
		parent.display();

	}

}
