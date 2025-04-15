package view.prompt;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

public class PromptColor {
    public static Color promptColor(JFrame frame) {
        return promptColor(frame, Color.WHITE);
    }

    public static Color promptColor(JFrame frame, Color defaultColor) {
        JDialog dialog = new JDialog(frame, "Choose Color", true);

        JPanel contentPane = new JPanel();

        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JColorChooser colorChooser = new JColorChooser();
        colorChooser.setColor(defaultColor);

        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        contentPane.add(colorChooser, gbc);

        AtomicReference<Color> selectedColor = new AtomicReference<>();

        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(e -> dialog.setVisible(false));

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.weighty = 0;

        contentPane.add(cancelBtn, gbc);

        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> {
            selectedColor.set(colorChooser.getColor());
            dialog.setVisible(false);
        });

        gbc.gridx = 1;

        contentPane.add(submitBtn, gbc);

        dialog.setContentPane(contentPane);

        dialog.pack();
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);

        return selectedColor.get();
    }
}
