package com.jordehhh.OOP;

import javax.swing.*;


public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Background backGround = new Background();

        frame.setBounds(10, 10, 1008, 1038);
        frame.setTitle("TEST GUI");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(backGround);
        frame.setVisible(true);

        Player player = new Player(0,0,0);
        player.getHuidigeLocatieX();

    }
}
