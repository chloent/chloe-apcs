public class Attention 
{ 
    public static boolean attention(String str)
    { 
        return str.startsWith("Hey, you!"); 
    }

    public static void testAttention(String str, boolean expected) {
        boolean result = attention(str);
        System.out.println("attention(" + str + ") result: " + result + " expected: " + expected);
        
        if (result == expected) {
            System.out.println("yippee"); 
        } else {
            System.out.println("noo"); 
        }
    }

    public static void main(String[] args)
    {
        testAttention("Hello I'm Chloe", false); 
        testAttention("Hey, you! Help me", true); 
        testAttention("Hello, everyone!", false);
    }
}
