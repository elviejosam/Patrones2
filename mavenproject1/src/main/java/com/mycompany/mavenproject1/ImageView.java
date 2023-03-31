package com.mycompany.mavenproject1;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageView extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel label;

    public ImageView() {
        super();
        this.setPreferredSize(new Dimension(200, 200));
        this.label = new JLabel();
        this.add(label);
    }

    public void setImageIcon(ImageIcon imageIcon) {
        label.setIcon(imageIcon);
    }
}
