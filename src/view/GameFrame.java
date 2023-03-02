package src.view;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameFrame extends JFrame {

    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    public GameFrame(CharacterPanel characterPanel) throws IOException{
        displayGameWindow(characterPanel);

    }

    public void displayGameWindow(CharacterPanel characterPanel) throws IOException {
        JFrame gameWindow = new JFrame();

        gameWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gameWindow.setLocation(SCREEN_SIZE.width / 2 - gameWindow.getWidth() / 2,
                SCREEN_SIZE.height / 2 - gameWindow.getHeight() / 2);
        gameWindow.setSize(850, 850);
        gameWindow.setMinimumSize(new Dimension(750, 750));
        gameWindow.add(characterPanel);
        gameWindow.pack();
        gameWindow.setVisible(true);

    }


}
