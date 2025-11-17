public class ScorekeeperTest
{ 
	public static void main(String[] args) 
	{ 
		ScoreKeeper ref = newScorekeeper(); 
		ref.scoreNormal(); 
		System.out.println(ref.getScore()); 
		ref.scoreNormal(); 
		System.out.println(ref.getScore());
	}
}
		
