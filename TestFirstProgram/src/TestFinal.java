class User
{
	int id;
    String name;
    final String pan_no;
    public User(int id, String name , String pan_no)
    {
    	this.pan_no= pan_no;
    	this.id = id;
    	this.name = name;
    }
    public void userInformation()
    {
    	name = name+"_user";
    	System.out.println(""+id+" , "+name+" , "+pan_no);
    	
    }
    public final void testFinal()
    {
    	System.out.println("Test");
    }
}
class UserTest extends User
{
	public UserTest(int id, String name , String pan_no)
	{
	 super(id, name, pan_no);
	}
	
	
}
public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(101, "Mohit", "10254KKKL");
		user.userInformation();
		UserTest usertest = new UserTest(12, "SKSKSKS", "5642154klkll");
		usertest.testFinal();
	}

}
