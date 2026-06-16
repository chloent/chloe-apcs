import processing.core.*;

public class TestingButton extends PApplet {
    PImage background, backgroundplay, playbutton;
    int gameState = 0;
    PlayButton playButton1;

    public void settings() {
        size(1728, 1117);
    }

    public void setup() {
        // Load images first so they aren't null when passed to the object
        background = loadImage("apcsbackground.jpg");
        backgroundplay = loadImage("apcsbackground1.jpg");
        playbutton = loadImage("playbutton.png");
        
        backgroundplay.resize(width, height);
        background.resize(width, height);
        playbutton.resize(500, 300);

        // Match the variable name 'playButton1'
        playButton1 = new PlayButton(600, 350, playbutton, backgroundplay);
    }

    public void draw() {
        if (gameState == 0) {
            playButton1.update();
            playButton1.display();
        } else if (gameState == 1) {
            duringGame();
        }
    }

    public void duringGame() {
        image(background, 0, 0);
    }

    public void mousePressed() {
        // Simple click detection for the button
        if (gameState == 0 && playButton1.isOver()) {
            gameState = 1;
        }
    }

    // Inner Class: This allows the class to use image(), background(), etc.
    public class PlayButton {
        float x, y;
        PImage img, bg;
        float speed = 0.5f; // Control the bounce speed
        int direction = 1;  // 1 for down, -1 for up

        public PlayButton(float x, float y, PImage img, PImage bg) {
            this.x = x;
            this.y = y;
            this.img = img;
            this.bg = bg;
        }

        public void update() {
            // Move the button
            y += speed * direction;

            // Reverse direction if boundaries are hit
            if (y >= 375 || y <= 335) {
                direction *= -1;
            }
        }

        public void display() {
            image(bg, 0, 0);
            image(img, x, y);
        }

        public boolean isOver() {
            return mouseX > x && mouseX < x + img.width && mouseY > y && mouseY < y + img.height;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Colordle");
    }
}
