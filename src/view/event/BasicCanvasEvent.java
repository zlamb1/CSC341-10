package view.event;

import view.ICanvas;

public class BasicCanvasEvent implements ICanvasEvent {
    protected ICanvas canvas;

    public BasicCanvasEvent(ICanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public ICanvas getCanvas() {
        return canvas;
    }
}
