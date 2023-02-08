package src.controller;

import src.view.CharacterPanel;
import src.view.GameFrame;

import java.io.IOException;

public class Game {

    CharacterPanel characterPanel;
    GameFrame gameFrame;
    public Game( ) throws IOException {
        characterPanel = new CharacterPanel();
        gameFrame = new GameFrame(characterPanel);
        characterPanel.requestFocus();
    }

}
