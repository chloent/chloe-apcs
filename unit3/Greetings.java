public class Greetings { 
	public static String greetings(String name)
	{ 
		return "Hello " + name + " How are you?"; 
	}
	public static void testgreetings(String str, String expected) {
		String result = greetings(str); 
		System.out.println("Word"+str+"Result"+result+"Expected"+expected);
		
		if (result.equals(expected)) {
			System.out.println("yippeee"); 
		} else {
			System.out.println("nooo"); 
		}
	}
	public static void main(String[] args) {
		testgreetings("Chloe", "Hello Chloe How are you?"); 
	} 
}
