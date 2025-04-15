package view.container;

import view.ICanvas;
import view.ISwingComponent;

public interface IFrameContent extends ISwingComponent {
    ICanvas getCanvas();
}
