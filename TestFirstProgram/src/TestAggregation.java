class Address
{
	int houseNo;
	String street;
	String city;
	String state;
	public Address(int houseNo , String street, String city , String state)
	{
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.state = state;
		
		
	}
}
class EmployeeCmp
{
	int id;
	String name;
	Address address;
	
	public EmployeeCmp(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public void displayInformation()
	{
		System.out.println(""+id+" , "+name);
		System.out.println(""+address.houseNo +" , "+address.street + " , "+address.city+ " ,"+address.state);
	}
	
}
public class TestAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address(40, "Bhaisa Tibba", "Panchkula", "Haryana");
		EmployeeCmp empcmp = new EmployeeCmp(101,  "Sachin", address);
		empcmp.displayInformation();

	}

}
