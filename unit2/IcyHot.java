public class IcyHot
{ 
	public static boolean IcyHot(int temp1, int temp2) {
  
   if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))
   {
     return true;} 
    else{ 
      return false; 
    }
}
     public static void testIcyHot(int temp1, 
		int temp2, boolean expected) {
		boolean result = IcyHot(temp1, temp2); 
		
		System.out.println("temp1"+temp1+
		"temp2"+temp2+
		"expected"+expected+
		"result"+result);
	
        if (result == expected){
            System.out.println("YAY!");
        } else {
            System.out.println("Boohoo!");
        } 
     }

	public static void main(String[] args)
	{ 
		testIcyHot(101,20,false); 
		testIcyHot(-1,120,true); 
		testIcyHot(2,120,false);
		
} 
}



// icyHot 
// public boolean icyHot(int temp1, int temp2) {
  // if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))
  // {
   //  return true;} 
    
    //else{ 
      //return false; 
    //}
  //}
