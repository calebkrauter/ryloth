package src.movement;

import src.view.CharacterPanel;
import src.view.GameFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

// https://youtu.be/6Tj6XYGWfko // for input
// TODO - consider using keybindings
// TODO - consider using JInput for controllers/better input latency potentially.

public class MovementKeys implements KeyListener {

    private CharacterPanel characterPanel;

    public MovementKeys(CharacterPanel characterPanel) {
        this.characterPanel = characterPanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("W");
                System.out.println("HEART nolonger broken ;)");

                characterPanel.setYDelta(-10);
                characterPanel.repaint();
                break;
            case KeyEvent.VK_A:
                System.out.println("A");
                System.out.println("HEART nolonger broken ;)");

                characterPanel.setXDelta(-10);
                characterPanel.repaint();
                break;
            case KeyEvent.VK_S:
                System.out.println("S");
                System.out.println("HEART nolonger broken ;)");

                characterPanel.setYDelta(10);
                characterPanel.repaint();
                break;
            case KeyEvent.VK_D:
                System.out.println("D");
                System.out.println("HEART nolonger broken ;)");

                characterPanel.setXDelta(10);
                characterPanel.repaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
