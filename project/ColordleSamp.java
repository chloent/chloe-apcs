import processing.core.*;

public class ColordleSamp extends PApplet {

    // Game Variables
    int targetR, targetG, targetB;
    String[] guessInputs = {"", "", ""}; // Stores text for R, G, B inputs
    int activeField = 0;                 // 0 = R, 1 = G, 2 = B
    boolean gameOver = false;
    float matchPercentage = 0;
    
    // UI Layout Constants
    int boxWidth = 120;
    int boxHeight = 60;
    int boxY = 650;
    int[] boxX = {600, 800, 1000}; // X positions for R, G, B boxes

    public void settings() {
        size(1728, 1117);
    }

    public void setup() {
        startNewGame();
    }

    public void startNewGame() {
        // Generate a random target color
        targetR = (int) random(256);
        targetG = (int) random(256);
        targetB = (int) random(256);
        
        // Reset game state
        guessInputs[0] = "";
        guessInputs[1] = "";
        guessInputs[2] = "";
        activeField = 0;
        gameOver = false;
        matchPercentage = 0;
    }

    public void draw() {
        background(0); // Solid black background

        // 1. Draw UI Titles
        textAlign(CENTER, CENTER);
        fill(255);
        textSize(50);
        text("COLORDLE", width / 2, 80);
        
        textSize(24);
        text("Guess the RGB values (0-255). Press ENTER to submit. Press TAB to switch fields.", width / 2, 140);

        // 2. Display Target Color Box
        rectMode(CENTER);
        stroke(255);
        strokeWeight(4);
        fill(targetR, targetG, targetB);
        rect(width / 2, 350, 400, 250, 20); // The mystery color box

        // 3. Draw Input Fields for R, G, B
        String[] labels = {"Red (R)", "Green (G)", "Blue (B)"};
        for (int i = 0; i < 3; i++) {
            if (i == activeField && !gameOver) {
                stroke(255, 215, 0); // Gold border for active input
                strokeWeight(4);
            } else {
                stroke(200);
                strokeWeight(2);
            }
            
            fill(30);
            rect(boxX[i], boxY, boxWidth, boxHeight, 8);
            
            // Labels above fields
            fill(255);
            textSize(20);
            text(labels[i], boxX[i], boxY - 50);
            
            // User typed text inside fields
            textSize(28);
            text(guessInputs[i], boxX[i], boxY);
        }

        // 4. Game Over / Results Screen
        if (gameOver) {
            int userR = parseGuess(guessInputs[0]);
            int userG = parseGuess(guessInputs[1]);
            int userB = parseGuess(guessInputs[2]);

            // Draw user's guessed color comparison box
            fill(userR, userG, userB);
            stroke(255);
            rect(width / 2, 800, 200, 100, 10);
            
            fill(255);
            textSize(22);
		}
	}
