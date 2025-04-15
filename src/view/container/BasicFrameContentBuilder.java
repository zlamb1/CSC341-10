package view.container;

import view.ICanvas;

import javax.swing.*;

public class BasicFrameContentBuilder implements IFrameContentBuilder {
    protected ICanvas canvas;
    protected JComponent bottomToolbar;

    @Override
    public IFrameContentBuilder setCanvas(ICanvas canvas) {
        this.canvas = canvas;
        return this;
    }

    @Override
    public IFrameContentBuilder setBottomToolbar(JComponent bottomToolbar) {
        this.bottomToolbar = bottomToolbar;
        return this;
    }

    @Override
    public IFrameContent build() {
        return new FrameContent(canvas, bottomToolbar);
    }
}
