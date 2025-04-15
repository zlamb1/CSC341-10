package shape;

import java.awt.*;

public class DoubleCircleShape extends ColoredAbstractShape {
    protected int radius, halfRadius;
    protected CircleShape firstCircle, secondCircle;

    public DoubleCircleShape() {
        this(20);
    }

    public DoubleCircleShape(int radius) {
        this.radius = radius;
        halfRadius = radius / 2;
        firstCircle = new CircleShape(halfRadius);
        secondCircle = new CircleShape(halfRadius);
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
        firstCircle.setColor(color);
        secondCircle.setColor(color);
    }

    @Override
    public void drawShape(int x, int y, Graphics g) {
        firstCircle.drawShape(x - halfRadius, y, g);
        secondCircle.drawShape(x + halfRadius, y, g);
    }
}
