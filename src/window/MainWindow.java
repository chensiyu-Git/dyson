package window;

import listener.WindowEvent;

import java.awt.*;

public class MainWindow {
    //简单的产物计算
    public static void main(String[] args) {
        Frame window = new Frame("dyson");
        window.setLocation(500,300);
        window.setSize(500,500);
        window.addWindowListener(WindowEvent.exit());

        window.setVisible(true);
    }
}
