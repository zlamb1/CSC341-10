package paint;

import java.awt.*;

/**
 * @Pattern Bridge
 * @Description Composed by shapes to avoid complicating the shape hierarchy.
 */

public interface IPaint {
    /**
     * @return The primary color of the paint.
     */
    Color getColor();

    /**
     * Sets up the graphics context for painting.
     * @param g The graphics context.
     */
    void paint(Graphics g);
}
