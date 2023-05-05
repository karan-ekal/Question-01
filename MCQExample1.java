package APril_12_revision;


public class MCQExample1 {

	static void disp(final int a,int b,final int[]c,int[]d)
	{
		b++;
		//a++; //final variable a cannot be modified 
		b=a;
		c[0]=20; // value can be modified
		//c=d;//address of final array cannot be modified
		d[0]++; // Incrementing value at d[0] 
		
	}
	public  static void main(String args[])
	{
		int a=0;
		final int b=1;
		
		int[] c={2};    
		                
		
		final int[]d={3};
		disp(a,b,c,d);
		
		System.out.println(d[0]);
	}
}

 
//a) b++;  b) a++;  c) b=a;  d) c[0]=20;  e) c=d; f)d[0]++;