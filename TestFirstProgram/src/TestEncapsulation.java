class EncapsulationTest
{
	private int id;
	private String name;
	/*public EncapsulationTest(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id  = id;
		this.name = name;
	}*/
	public void setId(int id)
	{
		this.id  = id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void information()
	{
		System.out.println(""+id+" , "+name);
	}
}
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationTest entest = new EncapsulationTest();
		entest.setId(22);
		entest.setName("Akash");
		entest.information();

	}

}
