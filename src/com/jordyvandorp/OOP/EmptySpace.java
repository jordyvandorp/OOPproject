package com.jordyvandorp.OOP;

import java.awt.*;

public class EmptySpace {
    private int brickWidth;
    private int brickHeight;

    public EmptySpace(){
        brickHeight = 1000/10;
        brickWidth = 1000/10;
    }

    public void draw(Graphics2D g, int i, int j){
        g.setColor(Color.white);
        g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

        g.setStroke(new BasicStroke(3));
        g.setColor(Color.black);
        g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
    }
}
