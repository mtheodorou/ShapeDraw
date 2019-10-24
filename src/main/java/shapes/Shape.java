package shapes;

import java.awt.*;

public class Shape {
    protected Point pos;
    protected Color col;

    public Shape(Point initPos, Color col) {
        pos=initPos;
        this.col=col;
    }

    public void draw(Graphics g) {
        g.setColor(col);
    }
}
