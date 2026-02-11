public class Scorekeeper
{ 
	private int score; 
	public Scorekeeper()
	{ 
		this.score=0;
	}
	public int getScore() 
	{ 
		return score; 
	} 
	public void scoreNormal() 
	{ 
		score=score+100;
	} 
	public void scoreBonus() 
	{ 
		score = score + 1000; 
	} 

	public static void main(String[] args) 
	{ 
		Scorekeeper ref = new Scorekeeper(); 
		ref.scoreNormal(); 
		System.out.println(ref.getScore()); 
		ref.scoreNormal(); 
		System.out.println(ref.getScore());
		ref.scoreBonus(); 
		System.out.println(ref.getScore());
	}
}

