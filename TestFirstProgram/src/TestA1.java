


class Animal
{public void tet()
{
	
}
int a=56;
}
class Dog extends Animal
{
	public void tet()
	{
		a=52;
		System.out.println(""+a);
	}
}
public class TestA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1= new Animal();
		Animal ani = new Dog();
		//ani.a=23;
		System.out.println(""+a1.a);
		ani.tet();

	}

}
