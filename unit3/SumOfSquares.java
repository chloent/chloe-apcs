public class SumOfSquares 
{ 
	public static int sumOfSquares(int num) {
	
			int n = 0; 
		for (int i=0; i<=num; i++)
		{  n+=i*i;
		} 

			return n;
		   }
	public static void testSumOfSquares(int n, int expected)
	{ 
		int result = sumOfSquares(n);
		System.out.println("n"+n+"expected"+expected+"result"+result); 
		
		if (result == expected)
		{ 
			System.out.println("YAYYY"); 
		} 
		else 
		{ 
			System.out.println("nooo"); 
		} 
	}
 
	public static void main(String[] args)
	{ 
		testSumOfSquares(1,1);
		testSumOfSquares(2,5);
		testSumOfSquares(3,14);
	}
}
