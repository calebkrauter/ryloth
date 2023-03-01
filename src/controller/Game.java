package src.controller;

import src.view.CharacterPanel;
import src.view.GameFrame;

import java.io.IOException;

public class Game implements Runnable{

    private CharacterPanel characterPanel;
    private GameFrame gameFrame;
    private Thread gameThread;
    private boolean running = true;
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

        double timePerFrame = 1000000000.0 / FPS_SET;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        while (running) {
            now = System.nanoTime();
            if (now - lastFrame >= timePerFrame) {
                characterPanel.repaint();
                lastFrame = now;
                characterPanel.repaint();

            }
        }
    }
}
