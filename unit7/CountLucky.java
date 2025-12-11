public class CountLucky 
{ 
	public static int countLucky (int[] lucky) 
	{
		int n = 0;
		
		for (int x : lucky)
		{ 
			if(x%7 == 0 || x%10 ==7){
				n+=1;
			}
		}
		return n; 
	}
	public static void testCountLucky (int [] lucky, int expected) {
		
		int result = countLucky(lucky); 
		System.out.println("lucky"+lucky+"expected"+expected);
		
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
		int [] values = new int[4];
    values [0] = 7;
    values [1] = 21;
    values [2] = 147;
    values [3] = 99;
    testCountLucky(values,3);

   int [] values2 = new int[4];
    values2 [0] = 1;
    values2 [1] = 2;
    values2 [2] = 3;
    values2 [3] = 4;
    testCountLucky(values2,0);

   int [] values3 = new int[4];
    values3 [0] = 121;
    values3 [1] = 85;
    values3 [2] = 317;
    values3 [3] = 16;
    testCountLucky(values3,1);
	}
} 
