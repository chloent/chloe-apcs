import java.util.ArrayList;

public class ZName
{
    public static int zName(ArrayList<String> name)
    { 
        int n = 0; 
        
        for (String z : name)
        {
            if(z.substring(0, 1).equals("z") || z.substring(0, 1).equals("Z")){
                n += z.length();
            }
        }
        return n;
    }
    
    public static void testZName(ArrayList<String> name, int expected) {
        int result = zName(name); 
        System.out.println("name" + name + " expected" + expected);
        
        if (result == expected) { 
            System.out.println("yayyy"); 
        } 
        else { 
            System.out.println("nooo"); 
        } 
    }
    
    public static void main(String [] args)  
    {
        testZName(new ArrayList<String>(Arrays.asList("Zebra", "Chloe", "Ramya")), 5);
    } 
}
