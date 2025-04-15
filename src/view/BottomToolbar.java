package view;

import shape.CircleShape;
import view.event.BasicCanvasEvent;
import view.event.IEventHandler;
import view.prompt.PromptColor;

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
            Color selectedColor = PromptColor.promptColor(Frame.getInstance());
            if (selectedColor != null) {
                e.getCanvas().setBackground(selectedColor);
            }
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
