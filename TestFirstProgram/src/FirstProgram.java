import java.util.*;
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i;
		for(i=0;i<=10;i++)
		{
		System.out.println("First Test Java Program");
		}
		System.out.println(""+i);*/

		/*byte a = 127;
		byte b= 1;
		byte c = (byte)(a+b);*/
		System.out.println("Enter a Number First");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		 //a++;
		byte c = (byte)a;
		System.out.println(a++);
		
	}

};
