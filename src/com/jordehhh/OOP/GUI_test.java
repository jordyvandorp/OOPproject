package com.jordehhh.OOP;

import com.jordehhh.OOP.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI_test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Background backGround = new Background();

        frame.setBounds(10, 10, 809, 838);
        frame.setTitle("TEST GUI");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(backGround);
        frame.setVisible(true);

        Speler player = new Speler(0,0,0);
        player.getHuidigeLocatieX();



        /*
        JFrame frame = new JFrame();
        Speelveld veld = new Speelveld();
        frame.setBounds(10, 10, 809, 838);

        frame.setTitle("Sleutelbarricade");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(veld);
        Speler player = new Speler(0,0,0);
        player.getHuidigeLocatieX();
         */
    }
}
