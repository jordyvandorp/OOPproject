package com.jordehhh.OOP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Block extends JPanel implements KeyListener, ActionListener {

    public int map[][];
    public int blockWidth;
    public int blockHeight;
    public boolean moveAllowed;
    private Speler player = new Speler(0,0,0);


    public Block(int row, int col){
        moveAllowed = false;
        map = new int[row][col];
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        Speler speler = new Speler(0,0,0);
        for (int i = 0; i < map.length; i++){
            for(int j=0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }

        blockWidth = 400/col;
        blockHeight = 400/row;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.white);
                    g.fillRect(j * blockWidth + 80, i * blockHeight + 50, blockWidth, blockHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * blockWidth + 80, i * blockHeight + 50, blockWidth, blockHeight);

                }
            }
        }
    }


    public void moveLeft(){
        if (player.getHuidigeLocatieX() > 0) {
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 1) {
                gotoLeft();
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 2) {
                player.setSleutelInBezit(2);
                gotoLeft();
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 3) {
                player.setSleutelInBezit(3);
                gotoLeft();
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 4) {
                player.setSleutelInBezit(4);
                gotoLeft();
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 5) {
                //todo window toevoegen met error
                moveAllowed = false;
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 6) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()]) {
                    gotoLeft();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 7) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()]) {
                    gotoLeft();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 8) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()]) {
                    gotoLeft();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 9) {
                moveAllowed = true;
                //todo
            }
        }

    }

    public void gotoLeft() {
        player.setHuidigeLocatieX(player.getHuidigeLocatieX() - 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        //map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] = 1;
        moveAllowed = true;
    }

    public void moveRight(){
        if (player.getHuidigeLocatieX() < 3) {
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 1) {
                gotoRight();
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 2) {
                player.setSleutelInBezit(2);
                gotoRight();
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 3) {
                player.setSleutelInBezit(3);
                gotoRight();
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 4) {
                player.setSleutelInBezit(4);
                gotoRight();
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 5) {
                moveAllowed = false;
                //todo window toevoegen met error
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 6) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()]) {
                    gotoRight();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 7) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()]) {
                    gotoRight();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 8) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()]) {
                    gotoRight();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 9) {
                //todo
            }
        }

    }

    public void gotoRight() {
        player.setHuidigeLocatieX(player.getHuidigeLocatieX() + 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        //map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] = 1;
        moveAllowed = true;
    }

    public void moveUp(){
        if (player.getHuidigeLocatieY() > 0) {
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 1) {
                goUp();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 2) {
                player.setSleutelInBezit(2);
                goUp();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 3) {
                player.setSleutelInBezit(3);
                goUp();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 4) {
                player.setSleutelInBezit(4);
                goUp();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 5) {
                moveAllowed = false;
                //todo window toevoegen met error
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 6) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1]) {
                    goUp();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 7) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1]) {
                    goUp();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 8) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1]) {
                    goUp();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 9) {
                moveAllowed = true;
                //todo
            }
        }

    }

    public void goUp() {
        player.setHuidigeLocatieY(player.getHuidigeLocatieY() - 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        //map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() +1] = 1;
        moveAllowed = true;
    }

    public void moveDown(){
        if (player.getHuidigeLocatieY() < 3) {
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 1) {
                goDown();

            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 2) {
                player.setSleutelInBezit(2);
                goDown();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 3) {
                player.setSleutelInBezit(3);
                goDown();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 4) {
                player.setSleutelInBezit(4);
                goDown();
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 5) {
                moveAllowed = false;
                //todo window toevoegen met error
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 6) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1]) {
                    goDown();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 7) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1]) {
                    goDown();
                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 8) {
                if (player.getSleutelInBezit() == map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1]) {
                    goDown();

                } else {
                    moveAllowed = false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() + 1] == 9) {
                moveAllowed = true;
                //todo
            }
        }

    }

    public void goDown() {
        player.setHuidigeLocatieY(player.getHuidigeLocatieY() + 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        //map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()-1] = 1;
        moveAllowed = true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            moveRight();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            moveLeft();
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            moveUp();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public boolean isMoveAllowed() {
        return moveAllowed;
    }

    public void setMoveAllowed(boolean moveAllowed) {
        this.moveAllowed = moveAllowed;
    }
}
