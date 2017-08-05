class ParentPoly
{
	int value=56;
	public void display()
	{
		System.out.println("Parent class for polymorphism");
	}
}
class ChildPoly extends ParentPoly
{
	int vlaue2 = 55;
	public void display()
	{
		System.out.println("Child class for polymorphism");
	}
}
public class TestRuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentPoly parentpoly = new ChildPoly();
		
            parentpoly.display();
            
	}

}
