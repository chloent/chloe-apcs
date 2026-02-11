import java.util.Random;
public class Magic8Ball 
{ 
	public Magic8Ball()
	{
	} 
	public String ask(String input) 
	{ 
		//this.input = input;
		Random random = new Random();
		int randomNumber = random.nextInt(100);
	if(randomNumber <= 50){
		System.out.println("yes");
	}else{
		System.out.println("aw man");
}return input; 
}
	public static void main(String[] args) 
	{ 
		Magic8Ball ball = new Magic8Ball(); 
		System.out.println(ball.ask("Will I get into college")); 
		System.out.println(ball.ask("Will I get an A on my stats test")); 
	}
}
