public class PlayButton 
{
	
	public PlayButton (){
		
	}
		
	public void playButton ()
{
	
	background(0);
	image(backgroundplay, 0, 0);
	// image(playbutton, 600, 370);
	image(playbutton, playx, playy);
	if (playy >= 375) 
	playy -=1;
	else if (playy <=335)
	playy +=1;  
	
}
	
}
