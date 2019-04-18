package com.jordyvandorp.OOP;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamestateController extends JPanel{

    public int[][] map;

    public Player player = new Player(0,0,0);
    public Exit exit = new Exit();
    public MapGenerator mg = new MapGenerator();
    //public Background bg = new Background();


    public GamestateController(){
        map = mg.map;
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    /*
    0 = player
    1 = empty square
    2 = key 100
    3 = key 200
    4 = key 300
    5 = wall
    6 = barricade 100
    7 = barricade 200
    8 = barricade 300
    9 = exit
    checks if movement to the left is allowed.
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
                return false;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 6) {
                return player.getSleutelInBezit() == 2;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 7) {
                return player.getSleutelInBezit() == 3;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 8) {
                return player.getSleutelInBezit() == 4;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() - 1] == 9) {
                exit.exitReached();
                return true;
            }
        }

        return false;
    }

    //handles movement to the left.
    public void gotoLeft() {
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieY(player.getHuidigeLocatieY() - 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
    }

    /*
    0 = player
    1 = empty square
    2 = key 100
    3 = key 200
    4 = key 300
    5 = wall
    6 = barricade 100
    7 = barricade 200
    8 = barricade 300
    9 = exit
    checks if movement to the right is allowed.
     */
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
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 6) {
                return player.getSleutelInBezit() == 2;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 7) {
                return player.getSleutelInBezit() == 3;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY() +1] == 8) {
                return player.getSleutelInBezit() == 4;
            }
            if (map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()+1] == 9) {
                exit.exitReached();
                return true;
            }
        }


        return false;
    }

    //handles movement to the right
    public void gotoRight() {
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieY(player.getHuidigeLocatieY()+1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
    }

    /*
    0 = player
    1 = empty square
    2 = key 100
    3 = key 200
    4 = key 300
    5 = wall
    6 = barricade 100
    7 = barricade 200
    8 = barricade 300
    9 = exit
    checks if upward movement is allowed
     */

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
            }
            //barricade 100
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 6) {
                return player.getSleutelInBezit() == 2;
            }
            //barricade 200
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 7) {
                return player.getSleutelInBezit() == 3;
            }
            //barricade 300
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 8) {
                return player.getSleutelInBezit() == 4;
            }
            //exit
            if (map[player.getHuidigeLocatieX() - 1][player.getHuidigeLocatieY()] == 9) {
                exit.exitReached();
                return true;
            }
        }

        return false;
    }

    //handles upward movement
    public void goUp() {
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieX(player.getHuidigeLocatieX() - 1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
    }

    /*
    0 = player
    1 = empty square
    2 = key 100
    3 = key 200
    4 = key 300
    5 = wall
    6 = barricade 100
    7 = barricade 200
    8 = barricade 300
    9 = exit
    Checks if a move downwards is allowed.
     */

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
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 6) {
                return player.getSleutelInBezit() == 2;
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 7) {
                return player.getSleutelInBezit() == 3;
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 8) {
                return player.getSleutelInBezit() == 4;
            }
            if (map[player.getHuidigeLocatieX() + 1][player.getHuidigeLocatieY()] == 9) {
                exit.exitReached();
                return true;
            }
        }

        return false;
    }

    //handles downward movement
    public void goDown() {
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 1;
        player.setHuidigeLocatieX(player.getHuidigeLocatieX()+1);
        map[player.getHuidigeLocatieX()][player.getHuidigeLocatieY()] = 0;
    }


    // Resets the field by making new instances and changing variables to their original values.
    public void reset() {
        player = new Player(0,0,0);
        mg = new MapGenerator();
        map = mg.map;

    }
}
