import java.util.Random; 
public class CoinFlip {
	public static void main(String[] args) {
		
		Random random = new Random (); 
		
		int outcome = random.nextInt(2); 
		
		if (outcome==0) { 
			System.out.println("Heads"); } 
			else {
			System.out.println("Tails"); 
		} 
	}
}
