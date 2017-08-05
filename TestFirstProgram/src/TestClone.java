import java.lang.*;
class CloneTest implements Cloneable
{
	int id;
	String name ;
	public CloneTest(int id , String name)
	{
		this.id  = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException
	{
	   return super.clone();	
	}
	public void information()
	{
		System.out.println(""+id+" , "+name);
	}
}
public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 CloneTest cltest  = new CloneTest(22, "SKS");
	 cltest.information();
	 try
	 {
	 CloneTest cltest2 = (CloneTest)cltest.clone();
	 cltest2.information();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }

	}

}
