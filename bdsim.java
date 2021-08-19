package bdsim;

import java.awt.Color;

import javax.swing.*;

public class bdsim extends JFrame {
    public static void main(String[] args) {
         //make the frame/window 
         JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame window = new JFrame();
    window.setSize(1080, 608);
    window.setTitle("Blind and Deaf simulator Java edition");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.BLACK);
window.setVisible(true);

    }
}
