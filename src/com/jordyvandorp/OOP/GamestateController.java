package com.jordyvandorp.OOP;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamestateController extends JPanel implements KeyListener, ActionListener {

    public int map[][];
    public int blockWidth;
    public int blockHeight;
    public boolean moveAllowed;
    public Player player = new Player(0,0,0);


    public GamestateController(int row, int col){
        moveAllowed = false;
        MapGenerator mg = new MapGenerator();
        map = mg.map;
        //map = new int[row][col];
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        blockWidth = 400/col;
        blockHeight = 400/row;
    }





    /*
    0 = player
    1 = leeg vakje
    2 = sleutel 100
    3 = sleutel 200
    4 = sleutel 300
    5 = muur
    6 = barricade 100
    7 = barricade 200
    8 = barricade 300
    9 = exit
     */
    public boolean moveLeft(){
        if (player.getHuidigeLocatieY() > 0) {
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 1) {
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 2) {
                player.setSleutelInBezit(2);
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 3) {
                player.setSleutelInBezit(3);
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 4) {
                player.setSleutelInBezit(4);
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 5) {
                //todo window toevoegen met error
                return false;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 6) {
                if (player.getSleutelInBezit() == 2) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 7) {
                if (player.getSleutelInBezit() == 3) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 8) {
                if (player.getSleutelInBezit() == 4) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 9) {
                return true;
                //todo
            }
        }

        return false;
    }

    public void gotoLeft() {
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieY(player.getHuidigeLocatieY() - 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        moveAllowed = true;
    }

    public boolean moveRight(){
        if (player.getHuidigeLocatieY() < 9) {
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 1) {
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 2) {
                player.setSleutelInBezit(2);
                return true;
            }
            if (map[player.getHuidigeLocatieX() ][player.getHuidigeLocatieY() +1] == 3) {
                player.setSleutelInBezit(3);
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 4) {
                player.setSleutelInBezit(4);
                return true;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 5) {
                return false;
                //todo window toevoegen met error
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 6) {
                if (player.getSleutelInBezit() == 2) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 7) {
                if (player.getSleutelInBezit() == 3) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() +1] == 8) {
                if (player.getSleutelInBezit() == 4) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 9) {
                return true;
                //todo
            }
        }


        return false;
    }

    public void gotoRight() {
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieY(player.getHuidigeLocatieY()+1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        moveAllowed = true;
    }

    public boolean moveUp(){
        if (player.getHuidigeLocatieX() > 0) {
            // empty box
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 1) {
                return true;
            }
            // sleutel 100
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 2) {
                player.setSleutelInBezit(2);
                return true;
            }
            //sleutel 200
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 3) {
                player.setSleutelInBezit(3);
                return true;
            }
            //sleutel 300
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 4) {
                player.setSleutelInBezit(4);
                return true;
            }
            //muur
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 5) {
                return false;
                //todo window toevoegen met error
            }
            //barricade 100
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 6) {
                if (player.getSleutelInBezit() == 2) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            //barricade 200
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 7) {
                if (player.getSleutelInBezit() == 3) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            //barricade 300
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 8) {
                if (player.getSleutelInBezit() == 4) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            //exit
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 9) {
                return true;
                //todo
            }
        }

        return false;
    }

    public void goUp() {
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieX(player.getHuidigeLocatieX() - 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        moveAllowed = true;
    }

    public boolean moveDown(){
        if (player.getHuidigeLocatieX() < 9) {
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 1) {
                return true;

            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 2) {
                player.setSleutelInBezit(2);
                return true;
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 3) {
                player.setSleutelInBezit(3);
                return true;
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 4) {
                player.setSleutelInBezit(4);
                return true;
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 5) {
                return false;
                //todo window toevoegen met error
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 6) {
                if (player.getSleutelInBezit() == 2) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 7) {
                if (player.getSleutelInBezit() == 3) {
                    return true;
                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 8) {
                if (player.getSleutelInBezit() == 4) {
                    return true;

                } else {
                    return false;
                    //todo window toevoegen dat aangeeft dat je niet de goede sleutel hebt
                }
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 9) {
                return true;
                //todo
            }
        }

        return false;
    }

    public void goDown() {
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieX(player.getHuidigeLocatieX()+1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
        System.out.println(map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()]);
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
