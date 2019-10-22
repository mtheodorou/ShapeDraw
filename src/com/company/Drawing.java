
import  java.awt.*;
import javax.swing.*;

public class Drawing extends Canvas {
    private Frame f;

    public Drawing(){
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    public void paint(Graphics g){

    }
}
