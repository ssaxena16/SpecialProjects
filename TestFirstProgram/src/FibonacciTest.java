import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		while(n>0)
		{
			int a = recursiveFibonacci(n-1);
			list.add(a);
			n--;
		}
		System.out.println(""+list);

	}
	public static int recursiveFibonacci(int num)
	{
		if(num ==0 || num == 1)
		{
			return 1;
		}
		else
		{
			return recursiveFibonacci(num-1)+recursiveFibonacci(num-2);
		}
		
	}

}

