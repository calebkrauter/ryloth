package src.movement;

import src.view.CharacterPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
                characterPanel.setYDelta(-5);
                break;
            case KeyEvent.VK_A:
                characterPanel.setXDelta(-5);
                break;
            case KeyEvent.VK_S:
                characterPanel.setYDelta(5);
                break;
            case KeyEvent.VK_D:
                characterPanel.setXDelta(5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
