package com.jordyvandorp.OOP;

import java.awt.*;

public class Key {
    private int brickWidth;
    private int brickHeight;

    public Key(){
        brickHeight = 1000/10;
        brickWidth = 1000/10;
    }

    public void draw100(Graphics2D g, int i, int j){
        g.setColor(Color.yellow);
        g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

        g.setStroke(new BasicStroke(3));
        g.setColor(Color.black);
        g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
    }
    public void draw200(Graphics2D g, int i, int j){
        g.setColor(Color.blue);
        g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

        g.setStroke(new BasicStroke(3));
        g.setColor(Color.black);
        g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
    }
    public void draw300(Graphics2D g, int i, int j){
        g.setColor(Color.pink);
        g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

        g.setStroke(new BasicStroke(3));
        g.setColor(Color.black);
        g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
    }
}
