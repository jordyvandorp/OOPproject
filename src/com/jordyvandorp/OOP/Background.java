package com.jordyvandorp.OOP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;

public class Background extends JPanel implements KeyListener, ActionListener {

    public GamestateController gamestateController = new GamestateController();

    private Timer timer;
    private int delay = 8;
    private int playerX = 0;
    private int playerY = 0;
    private MapGenerator map;

    public Background(){
        map = new MapGenerator();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g){
        // background
        g.setColor(Color.white);
        g.fillRect(1,1, 1000, 1000);

        // drawing map
        map.draw((Graphics2D)g);

        // borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 1000);
        g.fillRect(0, 0, 1000, 3);
        g.fillRect(1000, 0, 3, 800);
        g.fillRect(0, 1000, 1000, 3);

        // the ball
        g.setColor(Color.green);
        g.fillOval(playerX, playerY, 100, 100);

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >= 900){
                playerX = 900;
            } else{
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(playerX <= 0){
                playerX = 0;
            } else{
                moveLeft();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            if(playerY <= 0){
                playerY = 0;
            } else{
                moveUp();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            if(playerY >= 900){
                playerY = 900;
            } else{
                moveDown();
            }
        }
    }
    public void moveRight(){
        gamestateController.moveRight();
        if (gamestateController.moveRight()== true){
            gamestateController.gotoRight();
            playerX += 100;
            map.setValueRight(1, gamestateController.player.getHuidigeLocatieX(), gamestateController.player.getHuidigeLocatieY(), 0);
        }
        else{
            System.out.println("This move is not allowed");
        }

    }
    public void moveLeft(){
        gamestateController.moveLeft();
        if (gamestateController.moveLeft() == true){
            gamestateController.gotoLeft();
            playerX -= 100;
            map.setValueLeft(1, gamestateController.player.getHuidigeLocatieX(), gamestateController.player.getHuidigeLocatieY(), 0);
        }
        else{
            System.out.println("This move is not allowed");
        }

    }
    public void moveUp(){
        gamestateController.moveUp();
        if (gamestateController.moveUp() == true){
            gamestateController.goUp();
            playerY -= 100;
            map.setValueUp(1, gamestateController.player.getHuidigeLocatieX(), gamestateController.player.getHuidigeLocatieY(), 0);
        } else{
            System.out.println("This move is not allowed");
        }

    }
    public void moveDown(){
        gamestateController.moveDown();
        if (gamestateController.moveDown() == true){
            gamestateController.goDown();
            playerY += 100;
            map.setValueDown(1, gamestateController.player.getHuidigeLocatieX(), gamestateController.player.getHuidigeLocatieY(), 0);
        } else{
            System.out.println("This move is not allowed");
        }

    }

    public int getPlayerX() {
        return playerX;
    }

    public void setPlayerX(int playerX) {
        this.playerX = playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public void setPlayerY(int playerY) {
        this.playerY = playerY;
    }
}