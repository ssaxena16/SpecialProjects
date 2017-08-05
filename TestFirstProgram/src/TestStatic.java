
class Calculation {
	public Calculation() {
		System.out.println("Constructor...");
	}

	static int cube(int x) {
		return (x * x * x);
	}

	static {
		System.out.println("Test a Static Block");
	}
	{
		System.out.println("Instance Block");
	}
}

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calculation = new Calculation();
		int result = Calculation.cube(5);
		System.out.println("" + result);

	}

}
