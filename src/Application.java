package src;

import src.view.DisplayGui;

import java.io.IOException;


// TODO - figure out how to test main method and jframe/gui
// TODO - Make tests for image display
// TODO - Make image move on Jframe using keylisteners
// TODO - Make tests for image movement/key listeners

public class Application {
    public static void main(String[] args) throws IOException {
        DisplayGui DisplayGui = new DisplayGui();
        DisplayGui.displayGameWindow();
    }
}
