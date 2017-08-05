
public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 6;
		 Integer b = new Integer(6);
		 Integer c = new Integer(6);
		 
		 int test = 5;
		 Integer test1 = Integer.valueOf(test);
		 System.out.println(""+test1);
		 
		 Integer test2 = new Integer(8);
		 int test3 = test2.intValue();
		 System.out.println(""+test3);
   
		 if (b==c)
		 {
			 System.out.println("Pass");
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
	}

}
