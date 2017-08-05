
class ArrayTest
{
	public void arrayTest(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			arr[i]=i;
		}
		for(int i=0;i<5;i++)
		{
		System.out.println(""+arr[i]);
		}
		int testarr[] = new int[3];
		System.arraycopy(arr, 2, testarr, 0, 2);
		System.out.println(""+testarr.length);
		for(int i=0;i<testarr.length;i++)
		{
		System.out.println("jhj"+testarr[i]);
		}
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(""+name);
		ArrayTest at = new ArrayTest();
		at.arrayTest(arr);

	}

}
