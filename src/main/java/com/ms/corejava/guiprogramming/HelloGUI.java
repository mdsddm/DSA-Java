package com.ms.corejava.guiprogramming;

import javax.swing.*;

public class HelloGUI extends JFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame("HelloWorld");
        JLabel l1 = new JLabel("Hello Swing");
        f.getContentPane().add(l1);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
