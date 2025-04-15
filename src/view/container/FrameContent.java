package view.container;

import view.ICanvas;

import javax.swing.*;
import java.awt.*;

public class FrameContent extends JPanel implements IFrameContent {
    protected ICanvas canvas;
    protected JComponent bottomToolbar;

    public FrameContent(ICanvas canvas, JComponent bottomToolbar) {
        this.canvas = canvas;
        this.bottomToolbar = bottomToolbar;

        SwingUtilities.invokeLater(this::createLayout);
    }

    protected void createLayout() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        add(canvas.getComponent(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;

        add(bottomToolbar, gbc);
    }

    @Override
    public ICanvas getCanvas() {
        return canvas;
    }

    @Override
    public JComponent getComponent() {
        return this;
    }
}
