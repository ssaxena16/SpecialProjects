
public class SimpleRandom {

	private int max;
	private int last;

	// constructor that takes the max int
	public SimpleRandom(int max){
	    this.max = max;
	    last = (int) (System.currentTimeMillis() % max);
	}

	// Note that the result can not be bigger then 32749
	public int nextInt(int no){
		int result=0;
	    last = (last * 32719 + 3) % 32749;
	  //  System.out.println(""+(last%max));
	    if(no>(last%max))
	    {
	    	return (result = no -(last%max)+(no/2));
	    }
	    else
	    {
	    	result = no+(last%max)-((last%max)/2);
	    return result;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SimpleRandom rand = new SimpleRandom(10);
	    for (int i = 0; i < 25; i++) {
	    	int limit = 25*73/100;
	    	if(limit>i)
	    	{
	    	 //rand.nextInt(6);
	       System.out.print(" , "+rand.nextInt(6));
	    	}
	    	else
	    	{
	    		//rand.nextInt(1);
	    		//System.out.print(", "+rand.nextInt(1));
	    	}
	    }
	}

}
