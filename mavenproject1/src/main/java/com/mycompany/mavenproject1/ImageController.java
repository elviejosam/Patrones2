/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class ImageController {
    private ImageModel model;
    private ImageView view;

    public ImageController(ImageModel model, ImageView view) {
        this.model = model;
        this.view = view;

        this.view.setImageIcon(this.model.getImageIcon());

        
    }

    class LoadImageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ImageIcon imageIcon = loadImage();
            model.setImageIcon(imageIcon);
            view.setImageIcon(imageIcon);
           
        }

        private ImageIcon loadImage() {
            // Código para cargar la imagen desde un archivo o una URL
            return new ImageIcon("C:\\Users\\golden\\Downloads\\perrito.jpg");
        }
    }
}