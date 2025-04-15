package shape;

import java.awt.*;

/**
 * @Pattern Composite
 */

public interface IShape {
    /**
     * @return The x position of the shape.
     */
    int getX();

    /**
     * Sets the x position of the shape.
     * @param x The new x position.
     */
    void setX(int x);

    /**
     * @return The y position of the shape.
     */
    int getY();

    /**
     * Sets the y position of the shape.
     * @param y The new y position.
     */
    void setY(int y);

    /**
     * Randomizes the position of the shape.
     */
    void randomizePosition(Dimension maxBounds);

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
