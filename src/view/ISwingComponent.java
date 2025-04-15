package view;

import javax.swing.*;

public interface ISwingComponent {
    /**
     * Returns the underlying Swing component.
     * @return The swing component.
     */
    JComponent getComponent();
}
