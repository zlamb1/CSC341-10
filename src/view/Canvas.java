package view;

import shape.IShape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel implements ICanvas {
    protected List<IShape> shapes = new ArrayList<>();

    public Canvas() {
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        for (IShape shape : shapes) {
            shape.drawShape(g);
        }
    }

    @Override
    public JComponent getComponent() {
        return this;
    }

    @Override
    public void addShape(IShape shape) {
        shapes.add(shape);
        repaint();
    }

    @Override
    public boolean removeShape(IShape shape) {
        boolean removed = shapes.remove(shape);
        if (removed)
            repaint();
        return removed;
    }

    @Override
    public IShape removeLast() {
        if (!shapes.isEmpty()) {
            IShape shape = shapes.removeLast();
            repaint();
            return shape;
        }
        return null;
    }

    @Override
    public void clearShapes() {
        boolean empty = shapes.isEmpty();
        shapes.clear();
        if (!empty)
            repaint();
    }
}
