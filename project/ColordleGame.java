import processing.core.*;

public class ColordleGame extends PApplet {
    PImage bgImage; 

    public void settings() {
        size(1728, 1117);
    }

    public void setup() {
        bgImage = loadImage("apcsrealgamebg.jpg");
        bgImage.resize(width, height); 
    }

    public void draw() {
        background(bgImage);
    }

    public static void main(String[] args) {
        PApplet.main("ColordleGame");
    }
}
