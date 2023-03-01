package src.view;

import src.movement.MovementKeys;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CharacterPanel extends JPanel{
    BufferedImage characterImage = ImageIO.read(new File("src/res/heartCharacter.jpg"));
    private int xDelta = 0;
    private int yDelta = 0;
    private int frames = 0;
    private long lastCheck = 0;
    public CharacterPanel() throws IOException {
        addKeyListener(new MovementKeys(this));
//        System.out.println("Key listeners added new movement keys");

    }

    public void setXDelta(int xDelta) {
        this.xDelta += xDelta;
    }
    public void setYDelta(int yDelta) {
        this.yDelta += yDelta;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
         g2D.drawImage(characterImage, 100 + xDelta, 100 + yDelta, 50,50,null);

         frames++;
         //1000 because that is a second
         if (System.currentTimeMillis() - lastCheck >= 1000) {
             lastCheck = System.currentTimeMillis();
             System.out.println("FPS " + frames);
             frames = 0;
         }
    }

}
