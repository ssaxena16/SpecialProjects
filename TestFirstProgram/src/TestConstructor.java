import javax.swing.border.EmptyBorder;

class Employee
{
	public int id;
	public String name;
	public String address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Constructor is using to intailze the value for is and name");
	}
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Employee (Employee e)
	{
		this.id = e.id;
		this.name = e.name;
		this.address= e.address;
	}
	
	public void informationAboutEmployee()
	{
		System.out.println("Employee id "+id +"Employee Name = "+name +" Employee Address is == "+address);;
	}
}
public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(101,"Raj");
		employee1.address = "Aryanagar";
		employee1.informationAboutEmployee();
		Employee employee2 = new Employee(employee1);
		employee2.informationAboutEmployee();
		//System.out.println("Id -- "+employee.id +" name "+employee.name);

	}

}
