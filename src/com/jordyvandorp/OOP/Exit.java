package com.jordyvandorp.OOP;

import javax.swing.*;

public class Exit {

    //private Background bg = new Background();
    public Exit(){}

    public void exitReached(){
        JFrame frame = new JFrame();
        final int frameWidth = 500;
        final int frameHeight = 100;
        frame.setSize(frameWidth, frameHeight);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Congratulations, you won!");
        label.setFont(new java.awt.Font("Tahoma", 0, 36));
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("You've won!");
        frame.setVisible(true);


    }
}
