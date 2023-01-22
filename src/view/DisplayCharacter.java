package src.view;

import javax.swing.*;
import java.awt.*;

public class DisplayCharacter extends JPanel{
    ImageIcon characterImage = new ImageIcon("src/res/heartCharacter.jpg");

    public DisplayCharacter() {

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D= (Graphics2D) g;
         g2D.drawImage(characterImage.getImage(),0, 0, 50,50,null);
    }
}
