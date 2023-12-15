import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Frame(){
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        panel.setBackground(Color.BLACK);
        add(panel);
        setVisible(true);
    }
}
