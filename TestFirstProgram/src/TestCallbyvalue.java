class CallByValue
{
	int data = 50;
	public void data(CallByValue cl)
	{
	 cl.data=cl.data+100;	
	System.out.println(""+data);
	}
}
public class TestCallbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValue cl = new CallByValue();
		System.out.println("Before"+cl.data);
		cl.data(cl);
		System.out.println("After"+cl.data);
	}

}
