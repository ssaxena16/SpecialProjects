
public class TestStringDic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tseabdabcklm";
		String max= "";
		String min = "";
		for(int i = 0;i<=str.length()-3;i=i+3)
		{
			String tempString = str.substring(i, 3+i);
			System.out.println(""+tempString);
			if("".equals(max) && "".equals(min))
			{
				max= tempString;
				min = tempString;
			  continue;
			}
			if(tempString.compareTo(max)>0)
			{
				max = tempString;
				
			}
			if(min.compareTo(tempString)>0)
			{
				min = tempString;
			}
			
			
		}
		System.out.println("Max == "+max +"  Min=== "+min);

	}

}
