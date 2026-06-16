public class PlayButton 

{
	
	public PlayButton (int playx,int playy,int width,int height,PImage background, PImage backgroundplay,PImage playbutton){
		this.playx=playx;
		this.playy=playy;
		this.width=width;
		this.height=height;
		this.background=background;
		this.backgroundplay=backgroundplay;
		this.playbutton=playbutton;
		
	}
		
	public void playButton ()
{
	
	background(0);
	image(backgroundplay, 0, 0);
	// image(playbutton, 600, 370);
	image(playbutton, playx, playy);
	if (playy >= 375) {
	playy -=1;
}
	else if (playy <=335){
	playy +=1;  
}
	
}
	
}
