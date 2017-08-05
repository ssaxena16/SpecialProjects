class SBI
{
	int getIntrest()
	{
		return 7;
	}
}
class ICICI extends SBI
{
	int getIntrest()
	{
		return 8;
	}
}

class BOB extends SBI
{
	int getIntrest()
	{
		return 9;
	}
}

public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sbi = new SBI();
		sbi = new BOB();
		int intrest = sbi.getIntrest();
		System.out.println(""+intrest);
	}

}
