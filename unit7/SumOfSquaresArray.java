public class SumOfSquaresArray 
{
	public static double sumOfSquaresArray (double[] squares)
	{
		double total = 0; 
		
		for (double t : squares)
		{
			total += t*t;
		}
		return total;
	}
	public static void testSumOfSquaresArray (double [] squares, double expected) {
		
		double result = sumOfSquaresArray(squares); 
		System.out.println("squares"+squares+"expected"+expected);
		
		if (result == expected) { 
			System.out.println("yayyy"); 
		} 
		else 
		{ 
			System.out.println("nooo"); 
		} 
	}
	public static void main(String [] args)
	{
		double [] values = new double[4];
    values [0] = 1.0;
    values [1] = 2.0;
    values [2] = 3.0;
    values [3] = 4.0;
    testSumOfSquaresArray(values,30.0);

   double [] values2 = new double[2];
    values2 [0] = 1.0;
    values2 [1] = 2.0;
   
    testSumOfSquaresArray(values2,5.0);

   double [] values3 = new double[3];
    values3 [0] = 2.0;
    values3 [1] = 1.0;
    values3 [2] = 5.0;
    testSumOfSquaresArray(values3,30.0);
	}

}
