package view.container;

import view.ICanvas;

import javax.swing.*;

/**
 * @Pattern Builder
 * @Description Provides a simpler way to build IFrameContent than via a constructor.
 */

public interface IFrameContentBuilder {
    IFrameContentBuilder setCanvas(ICanvas canvas);
    IFrameContentBuilder setBottomToolbar(JComponent bottomToolbar);

    IFrameContent build();
}
