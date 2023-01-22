package src;

import src.view.DisplayGui;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static org.junit.jupiter.api.Assertions.*;

class DisplayGuiTest extends DisplayGui {

    DisplayGui displayGui = new DisplayGui();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void displayGui() {
    }

    // how to mock call a method and verify it works
//    0
//       information = new Information(publishing);
//11
//       Person person = ObjectCreator.getPerson();
//12
//       doNothing().when(publishing).publishInformation(person);
//13
//       information.sendInfoForPublishing(person);
//14
//       verify(publishing,times(1)).publishInformation(person);

    // TODO - should I be testing jframe functionality? If so how?
    @org.junit.jupiter.api.Test
    void gameWindowCloseOperation() {
    }

// From displaygui object
//    gameWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        gameWindow.setLocation(SCREEN_SIZE.width / 2 - gameWindow.getWidth() / 2,
//                SCREEN_SIZE.height / 2 - gameWindow.getHeight() / 2);
//        gameWindow.setSize(850, 850);
//        gameWindow.setMinimumSize(new Dimension(750, 750));
//        gameWindow.add(new Label("Hello world!"));
//        gameWindow.pack();
//        gameWindow.setVisible(true);
}