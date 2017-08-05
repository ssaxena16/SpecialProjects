class Employee1
{
	int id;
	String name;
	static String companyName ="HCL";
	static int count =0;
	public Employee1(int id, String name)
	{
		this.id= id;
		this.name = name;
	}
	int counter()
	{
		count++;
		return count;
	}
	public void empInformation()
	{
		System.out.println(""+counter()+" , "+id +" , "+ name +" , "+companyName);
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee1 employee = new Employee1(101,"Sachin");
      employee.empInformation();
      Employee1 employee1 = new Employee1(102,"Moiht");
      employee1.empInformation();
      Employee1 employee2 = new Employee1(103,"Harshit");
      employee2.empInformation();
	}

}
