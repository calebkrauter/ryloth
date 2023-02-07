package src.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayCharacter extends JPanel{
    BufferedImage characterImage = ImageIO.read(new File("src/res/heartCharacter.jpg"));
    int myXCoordinate;
    int myYCoordinate;


    public DisplayCharacter(int xCoordinate, int yCoordinate) throws IOException {
        setX(xCoordinate);
        setY(yCoordinate);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
//        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0,0,40,40);
         g2D.drawImage(characterImage, getX(), getY(), 50,50,null);
    }

    public void setX(int xCoordinate) {
        myXCoordinate = xCoordinate;
    }

    public void setY(int yCoordinate) {
        myYCoordinate = yCoordinate;
    }

    public int getX() {
        return myXCoordinate;
    }

    public int getY() {
        return myYCoordinate;
    }
}
