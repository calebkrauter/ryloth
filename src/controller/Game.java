package src.controller;

import src.view.CharacterPanel;
import src.view.GameFrame;

import java.io.IOException;

public class Game implements Runnable{

    private CharacterPanel characterPanel;
    private GameFrame gameFrame;
    private Thread gameThread;
    private boolean running = true;
    private int frames = 0;
    private long lastCheck = 0;
    private final int FPS_SET = 120;

    public Game( ) throws IOException {
        characterPanel = new CharacterPanel();
        gameFrame = new GameFrame(characterPanel);
        characterPanel.requestFocus();
        startGameLoop();
    }

    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0 / FPS_SET; // TODO - What is the numerator representative of?
        long lastFrameTime = System.nanoTime(); // This frame time will become the time of the previous frame.
        long currentFrameTime; // Current frame time of current frame.
        while (running) {
            currentFrameTime = System.nanoTime(); // Update now to the current time of current frame.
            if (currentFrameTime - lastFrameTime >= timePerFrame) { // Make sure time between consecutive frames is >= timePerFrame for cconsistency. TODO update this comment
                characterPanel.repaint(); // Update/render character on screen
                lastFrameTime = currentFrameTime; // Update lastFrameTime
                fPSCounter();
                }
            }
        }

    private void fPSCounter() {
        frames++; // Count FPS
        //1000 because that is a second
        if (System.currentTimeMillis() - lastCheck >= 1000) { // TODO, define what this line does. What is lastCheck? 1000 is one second
            lastCheck = System.currentTimeMillis(); // update lastCheck
            System.out.println("FPS " + frames); // Output fps
            frames = 0; // TODO - Initalize fps to 0 so that it is limited?
            // TODO - does FPS counter actually cap the fps? Is this an accurate representation of the fps? Why and how?
        }
    }
}
