package shapes;
import actions.draw;

import java.awt.*;

public class Rectangle extends Shape implements draw{
    private int width;
    private int height;

    public Rectangle(Point initPos, Color col, int width,int height){
        super(initPos, col);
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
