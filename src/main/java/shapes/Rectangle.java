package shapes;

import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Point initPos, Color col, int width,int height){
        super(initPos, col);
        this.width=width;
        this.height=height;
    }

    public void draw(Graphics g)
    {
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
