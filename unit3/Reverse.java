public class Reverse {
	public static String reverse(String str) 
	{ 
		String reversed =""; 
		for (int i = str.length(); i >=1; i--)
		{ 
			String letter = str.substring(i-1,i); 
			reversed += letter; 
		} 
		return reversed; 
	} 

	public static void testReverse(String str, String expected) 
	{ 
		String result = reverse(str); 
		System.out.println("Word:"+str+"result"+"result"+"expected"+expected); 
		
		
		if(result.equals(expected)) {
			System.out.println("yayyy!!!"); 
		} 
		else 
		{ 
			System.out.println("noo"); 
		} 
	}
		public static void main(String[] args)
		{ 
			testReverse("wooo", "ooow");
			testReverse("bleh", "helb"); 
			testReverse("ahhh", "hhha"); 
		}
	
}


	
