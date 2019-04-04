package com.jordyvandorp.OOP;

import javax.swing.*;

public class Exit {

    public Exit(){}

    public void exitReached(){
        JFrame frame = new JFrame();
        final int frameWidth = 300;
        final int frameHeight = 80;
        frame.setSize(frameWidth, frameHeight);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Congratulations, you won!");
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Victory");
        frame.setVisible(true);

    }
}
