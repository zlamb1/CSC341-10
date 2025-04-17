package shape;

import paint.IPaint;

import java.awt.*;

public class DoubleCircleShape extends AbstractShape {
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
    public void setPaint(IPaint paint) {
        super.setPaint(paint);
        firstCircle.setPaint(paint);
        secondCircle.setPaint(paint);
    }

    @Override
    public void drawShape(int x, int y, Graphics g) {
        firstCircle.drawShape(x - halfRadius, y, g);
        secondCircle.drawShape(x + halfRadius, y, g);
    }
}
