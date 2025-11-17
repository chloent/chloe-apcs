import java.util.random;
public class MagicEightBall 
{ 
	private String[] responses = { "Yes", "No", "Maybe" };
	public MagicEightBall()
	{
	} 
	public String ask(String input) 
	{ 
		Random random = new Random();
		int randomReply=random.nextInt(5);;
		return replies[randomReply];
	}
}
