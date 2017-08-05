class MyStudent
{
	int id;
	String name;
	String address;
	int fee;
	public MyStudent(int id, String name, String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	public MyStudent(int id, String name, String address, int fee)
	{
		this(id,name,address);
		this.fee = fee;
	}
	public void studentInformation()
	{
		System.out.println(""+id+" , "+name+ " , "+address+" , "+fee);
	}
	public void m()
	{
		this.studentInformation();;
	}
	public void n()
	{
		this.m();
	}
	MyStudent getMyStudent()
	{
		return this;
	}
}

public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyStudent mystudent = new MyStudent(101, "Akash", "Chandigarh",1200);
     MyStudent mystudent1 = new MyStudent(101, "amit", "Spn",12000);
     MyStudent mystudent2 = mystudent.getMyStudent();
     mystudent2.n();
    // mystudent.n();
     //mystudent1.n();
     
    // mystudent.studentInformation();
	}

}
