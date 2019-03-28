package com.jordehhh.OOP;

        import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Vakje vakje = new
        JFrame frame = new JFrame();
        Speelveld veld = new Speelveld();
        frame.setBounds(10,10,700,700);
        frame.setTitle("Sleutelbarricade");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.add(veld);
        Speler player = new Speler(0,0,0);
        player.getHuidigeLocatieX();

    }
}
