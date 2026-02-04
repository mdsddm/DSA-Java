package com.ms.corejava.guiprogramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompoundIntrest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Area Of Triangle");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel firstValue = new JLabel("Enter First Side:");
        JTextField first = new JTextField();
        JLabel secondValue = new JLabel("Enter Second Side:");
        JTextField second = new JTextField();
        JLabel thirdValue = new JLabel("Enter Third Side:");
        JTextField third = new JTextField();
        JButton calculate = new JButton("Calculate Area");
        JLabel result = new JLabel("Area: ");

        frame.setLayout(new GridLayout(5, 2));
        frame.add(firstValue);
        frame.add(first);
        frame.add(secondValue);
        frame.add(second);
        frame.add(thirdValue);
        frame.add(third);
        frame.add(calculate);
        frame.add(result);

        frame.setVisible(true);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(first.getText());
                    double b = Double.parseDouble(second.getText());
                    double c = Double.parseDouble(third.getText());

                    // Validate if sides form a triangle
                    if (a + b > c && a + c > b && b + c > a) {
                        double s = (a + b + c) / 2;
                        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        result.setText("Area: " + String.format("%.2f", area));
                    } else {
                        result.setText("Invalid triangle sides!");
                    }
                } catch (NumberFormatException exp) {
                    result.setText("Invalid Number!");
                }
            }
        });
    }
}
