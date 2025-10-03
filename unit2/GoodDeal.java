public class GoodDeal
{
    public static boolean GoodDeal(double originalPrice, 
                                   double salePrice)
    {
        if (salePrice <= originalPrice*0.75) {
        return true; 
	}
	else { 
		return false; 
	}
    }

    public static void testGoodDeal(double originalPrice, 
                                    double salePrice,
                                    boolean expected)
    {
		boolean result = GoodDeal(originalPrice, salePrice); 
		System.out.println("originalPrice"+originalPrice+
		"salePrice"+salePrice+
		"expected"+expected);
    }

    public static void main(String[] args)
    {
        // unit tests
        testGoodDeal(100, 50, true);
        testGoodDeal(100, 80, false);
        testGoodDeal(100, 40, true); 
     
    }
}
