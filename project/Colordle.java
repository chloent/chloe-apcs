import processing.core.*;
import java.util.*;
public class Colordle extends PApplet 
{
	PImage background; 
	PImage backgroundplay;
	PImage playbutton;
	int gameState;
	int playx = 600; 
	int playy = 350;
	// playButton playButton1;
	public Button playButton 
	public setup () 
		playButton = new Button (100, 100, 200, 200) 
	public draw () 
		playButton.display() 
	
	public void settings(){
        size(1728, 1117);
    }

	public void setup ()
	{
		gameState = 0;
		background = loadImage("apcsbackground.jpg");
		backgroundplay = loadImage("apcsbackground1.jpg"); 
		playbutton = loadImage("playbutton.png");
		backgroundplay.resize(width, height);
		background.resize(width, height);
		playbutton.resize(500,300);
	
	
}


public void draw ()
	{
	if (gameState == 0) {
		playButton(); 
	}
	else if (gameState == 1) {
		duringGame(); 
	}
}
public void duringGame ()
{ 
	background (0);
	image(background, 0, 0);
	
	
}


public static void main(String[] args)
	{
		PApplet.main("Colordle");
	}
	
}


	
		
