import java.util.Random; 
public class DieRolling
{ 
	public static int rollDie() 
	{ 
		Random result = new Random(); 
		return result.nextInt(6) + 1;
	}
	public static void main(String[] args) 
	{ 
		for(int i = 0; i < 5; i++) 
		{ 
			System.out.println(rollDie()); 
		}
	}
}
