package view;

import view.container.IFrameContent;

import javax.swing.*;

/**
 * @Pattern Singleton
 * @Description Thread-safe, lazy-loaded implementation of singleton design pattern.
 */

public class Frame extends JFrame implements IFrame {
    private static volatile Frame instance;

    private final IFrameContent frameContent;

    private Frame(IFrameContent frameContent) {
        this.frameContent = frameContent;

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            setContentPane(frameContent.getComponent());
            SwingUtilities.updateComponentTreeUI(this);
            setSize(500, 500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        });
    }

    public static void createInstance(IFrameContent frameContent) {
        synchronized (Frame.class) {
            instance = new Frame(frameContent);
        }
    }

    public static Frame getInstance() {
        return instance;
    }

    @Override
    public ICanvas getCanvas() {
        return frameContent.getCanvas();
    }
}
