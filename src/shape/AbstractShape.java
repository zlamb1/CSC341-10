package shape;

import java.awt.*;

public abstract class AbstractShape implements IShape {
    protected int x, y;

    public AbstractShape() {
        this(0, 0);
    }

    public AbstractShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void randomizePosition(Dimension maxBounds) {
        x = (int) (Math.random() * maxBounds.getWidth());
        y = (int) (Math.random() * maxBounds.getHeight());
    }

    @Override
    public void drawShape(final Graphics g) {
        drawShape(x, y, g);
    }
}
