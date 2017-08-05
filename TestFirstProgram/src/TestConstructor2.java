class Student1
{
	int id;
	String name;
	public Student1(int id)
	{
		this.id = id;
		
	}
	public Student1(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	public void display()
	{
		System.out.println(""+id +" , "+name);
	}
}
public class TestConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 Student1= new Student1(101);
        Student1.name = "Ajay Kumar";
        Student1.display();
        Student1 student = new Student1(202, "Akash");
        student.display();
	}

}
