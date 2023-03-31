package com.mycompany.mavenproject1;

import java.awt.Dimension;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageView extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel label;
    private Random random;

    public ImageView() {
        super();
        this.setPreferredSize(new Dimension(200, 200));
        this.label = new JLabel();
        this.add(label);
        this.random = new Random();
    }

    public void setImageIcon(ImageIcon imageIcon) {
        Image image = imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        imageIcon.setImage(image);
        label.setIcon(imageIcon);

        int x = random.nextInt(getWidth() + 20);
        int y = random.nextInt(getHeight() + 20);
        label.setBounds(x, y, x, y);

        this.add(label);
        this.revalidate();
    }
}
