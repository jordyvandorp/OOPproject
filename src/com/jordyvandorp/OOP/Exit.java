package com.jordyvandorp.OOP;

import javax.swing.*;

public class Exit {
    private boolean uitgangIsBereikt;

    public Exit(){}

    public boolean isUitgangIsBereikt() {
        return uitgangIsBereikt;
    }

    public void setUitgangIsBereikt(boolean uitgangIsBereikt) {
        this.uitgangIsBereikt = uitgangIsBereikt;

    }
    public void exitReached(){
        JFrame frame = new JFrame();
        final int frameWidth = 250;
        final int frameHeight = 100;
        frame.setSize(frameWidth, frameHeight);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Congratulations! You did it!");
        JButton button = new JButton("Close");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Victory");
        frame.setVisible(true);

    }
}
