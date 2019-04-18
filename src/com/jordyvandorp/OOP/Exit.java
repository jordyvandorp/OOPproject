package com.jordyvandorp.OOP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exit {

    Background background;
    private int brickWidth;
    private int brickHeight;

    public Exit(){
        brickHeight = 1000/10;
        brickWidth = 1000/10;
    }

    public void draw(Graphics2D g, int i, int j){
        g.setColor(Color.red);
        g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

        g.setStroke(new BasicStroke(3));
        g.setColor(Color.black);
        g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
    }

    public void exitReached(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        final int frameWidth = 500;
        final int frameHeight = 500;
        frame.setSize(frameWidth, frameHeight);
        frame.setResizable(false);

        panel.setLayout(new GridLayout(2,1));
        JLabel label = new JLabel("Congratulations, you won!");
        label.setFont(new java.awt.Font("Tahoma", 0, 36));
        JLabel resetLabel = new JLabel("Press Enter for restart");
        resetLabel.setFont(new java.awt.Font("Tahoma", 0, 36));

        panel.add(label);
        panel.add(resetLabel);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("You've won!");
        frame.setVisible(true);
    }
}
