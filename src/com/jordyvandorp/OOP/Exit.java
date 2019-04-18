package com.jordyvandorp.OOP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Exit {

    private int brickWidth;
    private int brickHeight;
    private JFrame frame = new JFrame();

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

        JPanel panel = new JPanel();

        final int frameWidth = 500;
        final int frameHeight = 500;
        frame.setSize(frameWidth, frameHeight);
        frame.setResizable(false);

        panel.setLayout(new GridLayout(2,1));
        JLabel label = new JLabel("Congratulations, you won!");
        label.setFont(new java.awt.Font("Tahoma", 0, 36));
        JLabel resetLabel = new JLabel("Close this window and press enter to restart.");
        resetLabel.setFont(new java.awt.Font("Tahoma", 0, 24));

        panel.add(label);
        panel.add(resetLabel);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("You've won!");
        frame.setVisible(true);
    }

}
