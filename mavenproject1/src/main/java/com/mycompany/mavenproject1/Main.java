/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author golden
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("ImageViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageView imageView = new ImageView();
        frame.add(imageView);
        for (int i = 0; i < 200000; i++) {
            ImageModel model = new ImageModel(new ImageIcon("C:\\Users\\golden\\Downloads\\perrito.jpg"));
            ImageView view = new ImageView();
            ImageController controller = new ImageController(model, view);
        
        
        frame.add(view);
        frame.pack();
        frame.setVisible(true);
        }
        
        
        frame.pack();
        frame.setVisible(true);
    }
}
