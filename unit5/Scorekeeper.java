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
}
