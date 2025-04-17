package shape;

import java.awt.*;

public class CircleShape extends AbstractShape {
    protected int radius;

    public CircleShape() {
        this(10);
    }

    public CircleShape(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawShape(int x, int y, Graphics g) {
        paint.paint(g);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
