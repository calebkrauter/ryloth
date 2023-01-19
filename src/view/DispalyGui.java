package src.view;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class DispalyGui {

    private final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public void DisplayGui() {

        GameWindow();
    }

    public void GameWindow() {
        JFrame gameWindow = new JFrame();
        gameWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gameWindow.setLocation(SCREEN_SIZE.width / 2 - gameWindow.getWidth() / 2,
                SCREEN_SIZE.height / 2 - gameWindow.getHeight() / 2);
        gameWindow.setSize(850, 850);
        gameWindow.setMinimumSize(new Dimension(750, 750));
        gameWindow.add(new Label("Hello world!"));
        gameWindow.pack();
        gameWindow.setVisible(true);

    }
}
