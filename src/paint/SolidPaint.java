package paint;

import java.awt.*;

public class SolidPaint implements IPaint {
    protected Color primaryColor;

    public SolidPaint(Color color) {
        primaryColor = color;
    }

    @Override
    public Color getColor() {
        return primaryColor;
    }

    @Override
    public void paint(final Graphics g) {
        g.setColor(getColor());
    }
}
