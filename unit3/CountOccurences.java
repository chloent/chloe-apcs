public class CountOccurences 
{ 
	public static int countOccurrences(String str, String sub) 
	{ 
		int count =0; 
		
		for (int i=0; i<=str.length()-sub.length();i++)
		{ 
			if (str.substring(i,i+sub.length()).equals (sub))
			{ 
				count++; 
			}
		}
		return count; 
	}
	public static void testCountOccurrences(String str, String sub, int expected) 
	{ 
		int result = countOccurrences(str, sub); 
		System.out.println("Word"+str+"Substring"+sub+"result"+result+"expected"+expected);
		
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
		testCountOccurrences ("Mississippi","iss",2); 
		testCountOccurrences ("banananana","na",4); 
	}
}
