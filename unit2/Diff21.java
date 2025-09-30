public class Diff21
{ 
	public static int Diff21(int n) {
		if (n<=21) {
   return 21 - n;
}
   else { 
     return(n-21)*2;
  }
}
  public static void testDiff21(int n, int expected) {
	int result = Diff21(n);
	System.out.println("n"+n+"expected"+expected+"result"+result); 
	
        if (result == expected) {
            System.out.println("YAY!");
        } else {
            System.out.println("Boohoo!"); 
			}
	}	
	public static void main(String[] args)
	{ 
		testDiff21(4, 16); 
		testDiff21(34,26); 
		testDiff21(21,0); 
}

}
// public int Diff21(int n) {
  // if (n<=21) {
  // return 21 - n;

// }
  // else{ 
    // return(n-21)*2;
 // }

// }
