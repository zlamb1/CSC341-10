package view.event;

import view.ICanvas;

import java.awt.*;

public interface ICanvasEvent {
    ICanvas getCanvas();

    default Dimension getCanvasSize() {
        return getCanvas().getSize();
    }
}
