package view;

import shape.IShape;

import java.awt.*;

public interface ICanvas extends ISwingComponent {
    /**
     * Gets the background color of the canvas.
     * @return The current background color.
     */
    Color getBackground();

    /**
     * Sets the background color of the canvas.
     * @param bgColor The new background color.
     */
    void setBackground(Color bgColor);

    /**
     * Adds a shape to the canvas.
     * @param shape The shape to be added.
     */
    void addShape(IShape shape);

    /**
     * Removes a given shape from the canvas.
     * @param shape The shape to be removed.
     * @return true if the shape was removed and false otherwise
     */
    boolean removeShape(IShape shape);

    /**
     * Removes the last added shape from the canvas.
     * @return The last shape added or null if there are no shapes remaining.
     */
    IShape removeLast();

    /**
     * Clears all shapes from the canvas.
     */
    void clearShapes();

    /**
     * Returns the bounds of the canvas.
     * @return The dimension representing the bounds of the canvas.
     */
    Dimension getSize();
}
