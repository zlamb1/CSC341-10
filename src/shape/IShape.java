package shape;

import java.awt.*;

/**
 * @Pattern Composite
 */

public interface IShape {
    /**
     * Draws a shape at an arbitrary position;
     * @param g The graphics context.
     */
    void drawShape(final Graphics g);

    /**
     * Draws a shape at a given position.
     * @param x The x coordinate to draw at.
     * @param y The y coordinate to draw at.
     * @param g The graphics context.
     */
    void drawShape(int x, int y, final Graphics g);
}
