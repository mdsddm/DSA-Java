package com.ms.corejava.guiprogramming;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Circle Area Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a text field for radius input
        JTextField radiusTextField = new JTextField();
        JLabel radiusLabel = new JLabel("Enter Radius:");

        // Create a button to trigger the calculation
        JButton calculateButton = new JButton("Get Area");

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Area:");

        // Set layout for the frame
        frame.setLayout(new GridLayout(3, 2));
        frame.add(radiusLabel);
        frame.add(radiusTextField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the radius from the text field
                    double radius = Double.parseDouble(radiusTextField.getText());

                    // Calculate the area of the circle
                    double area = Math.PI * radius * radius;

                    // Display the result
                    resultLabel.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    // Handle the case where the input is not a number
                    resultLabel.setText("Please enter a valid number!");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
