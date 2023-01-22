package src.view;

import src.movement.MovementKeys;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class DisplayGui extends JFrame {

    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    public void DisplayGui() throws IOException {
        displayGameWindow();
    }

    public void displayGameWindow() throws IOException {
        JFrame gameWindow = new JFrame();
        DisplayCharacter displayCharacter = new DisplayCharacter();

        gameWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gameWindow.setLocation(SCREEN_SIZE.width / 2 - gameWindow.getWidth() / 2,
                SCREEN_SIZE.height / 2 - gameWindow.getHeight() / 2);
        gameWindow.setSize(850, 850);
        gameWindow.setMinimumSize(new Dimension(750, 750));
//        gameWindow.add(new Label("Hello world!"));
        gameWindow.add(displayCharacter);
        gameWindow.pack();
        gameWindow.setVisible(true);

    }


}
