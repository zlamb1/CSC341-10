package shape;

import java.awt.*;

public abstract class ColoredAbstractShape extends AbstractShape {
    protected Color color;

    public ColoredAbstractShape() {
        this(Color.BLACK);
    }

    public ColoredAbstractShape(Color color) {
        this.color = color;
    }

    public ColoredAbstractShape(Color color, int x, int y) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
