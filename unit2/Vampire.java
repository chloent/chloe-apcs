public class Vampire
{
   
   
    public static void main(String[] args)
    {
      public static boolean Vampire(float hour, boolean awake)
      { 
		  if ((hour < 6 && hour > 22) && (awake == true))
		  {
			  return true; }
			else { 
			return false; 
		}
		public static void test Vampire(float hour, 
                                    boolean awake,
                                    boolean expected)
    {
		boolean result = Vampire(hour, awake); 
		System.out.println("hour"+hour+
		"awake"+awake+
		"expected"+expected);
    }
     public static void main(String[] args)
    {
        // unit tests
        testVampire(4, true, false);
      
    }
}   
     
    }
