public class Factorial 
{
	
    public static int factorial(int n) 
    {
		int count = 1;
      for (int i=1; i<=n; i++) 
      {
		  count *= i;
	  }
	  return count; 
  }
public static void testFactorial (int n, int expected)
{ 

		int result = factorial(n); 
		System.out.println("n"+n+"expected"+expected);
		
		if (result == expected) { 
			System.out.println("yayyy"); 
		} 
		else 
		{ 
			System.out.println("nooo"); 
		} 
	}
	public static void main(String[] args) 
	{ 
		testFactorial (5,120); 
		testFactorial (4,24); 
	}

}
		  
