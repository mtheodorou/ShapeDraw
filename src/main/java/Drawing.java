import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;
import actions.draw;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


public class Drawing extends Canvas{
    Point p=new Point(200,200);
    Point p2=new Point(400,400);
    Point p3=new Point(300,300);
    Color c1=new Color(0x992266);
    Color c2=new Color(0x64ff60);
    private Circle c=new Circle(p,c1,200);
    private shapes.Rectangle r=new Rectangle(p2,c1,300,200);
    private Square s=new Square(p3, c2, 200);
    private Frame f;
    private ArrayList<draw> Shapes = new ArrayList<draw>();

    public Drawing(){
        setupFrame();

        setupCanvas();
        Shapes.add(c);
        Shapes.add(r);
        Shapes.add(s);



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
        for (draw sh:Shapes){
            sh.draw(g);
        }
    }
}
