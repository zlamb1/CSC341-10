package view;

import shape.CircleShape;
import view.event.BasicCanvasEvent;
import view.event.IEventHandler;

import javax.swing.*;
import java.awt.*;

public class BottomToolbar extends JPanel {
    public BottomToolbar() {
        setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));

        add(createButton("Create", (e) -> {
            CircleShape circleShape = new CircleShape();
            circleShape.randomizePosition(e.getCanvasSize());
            e.getCanvas().addShape(circleShape);
        }));

        add(createButton("Change Background", (e) -> {
            e.getCanvas().setBackground(e.getCanvas().getBackground() == Color.WHITE ? Color.RED : Color.WHITE);
        }));

        add(createButton("Remove Last", (e) -> e.getCanvas().removeLast()));
        add(createButton("Clear", (e) -> e.getCanvas().clearShapes()));
    }

    JButton createButton(String text, IEventHandler eventHandler) {
        JButton button = new JButton(text);
        button.addActionListener((e) -> eventHandler.handleEvent(new BasicCanvasEvent(Frame.getInstance().getCanvas())));
        return button;
    }
}
