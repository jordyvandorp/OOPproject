package com.jordyvandorp.OOP;

import javax.swing.*;


public class GUI {
    public static void main(String[] args) {
        JFrame startFrame = new JFrame();
        Background backGround = new Background();

        startFrame.setBounds(10, 10, 1008, 1038);
        startFrame.setTitle("Sleutelbarricade");
        startFrame.setResizable(false);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.add(backGround);
        startFrame.setVisible(true);

        Player player = new Player(0,0,0);
        player.getHuidigeLocatieX();

    }
}
