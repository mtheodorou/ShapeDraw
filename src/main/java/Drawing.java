import shapes.Circle;
import shapes.Rectangle;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Drawing extends Canvas{
    Point p=new Point(200,200);
    Point p2=new Point(400,400);
    Color cl=new Color(0x992266);
    Color c2=new Color(0x64ff60);
    private Circle c=new Circle(p,cl,200);
    private shapes.Rectangle r=new Rectangle(p2,c2,200,200);
    private Frame f;

    public Drawing(){
        setupFrame();

        setupCanvas();


    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(800, 800);
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(800, 800);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public void paint(Graphics g){
        c.draw(g);
        r.draw(g);
    }
}
