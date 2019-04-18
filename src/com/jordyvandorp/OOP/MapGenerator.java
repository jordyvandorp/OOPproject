package com.jordyvandorp.OOP;

import java.awt.*;

/**
 * MapGenerator makes a 2dArray and gives different colors to the different numbers (objects) in the array
 */
public class MapGenerator {
    private EmptySpace emptySpace = new EmptySpace();
    private Barricade barricade = new Barricade();
    private Wall wall = new Wall();
    private Key key = new Key();
    private Exit exit = new Exit();

    public int [][]map =
            {
                    {0, 5, 6, 1, 1, 6, 1, 1, 5, 5},
                    {1, 5, 6, 1, 1, 6, 1, 1, 1, 5},
                    {1, 1, 6, 1, 5, 1, 1, 1, 7, 5},
                    {1, 5, 6, 1, 5, 1, 5, 5, 1, 1},
                    {1, 3, 5, 2, 6, 7, 5, 5, 7, 1},
                    {1, 1, 1, 5, 6, 1, 5, 5, 1, 7},
                    {5, 5, 1, 6, 6, 1, 4, 5, 7, 7},
                    {2, 1, 1, 6, 6, 1, 1, 1, 5, 8},
                    {1, 5, 8, 2, 6, 1, 8, 5, 8, 8},
                    {1, 4, 8, 5, 3, 6, 8, 8, 5, 9}
            };
    public int brickWidth;
    public int brickHeight;

    public MapGenerator(){
        brickWidth = 1000/10;
        brickHeight = 1000/10;
    }

    /**
     * @param g
     * The method draw is there to go through the array and draw the coroct color on the correct position in the JFRame
     */
    public void draw(Graphics2D g){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 1){
                    /*g.setColor(Color.white);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    emptySpace.draw(g, i, j);
                }
                else if(map[i][j] == 2){
                    /*g.setColor(Color.yellow);
                    g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    key.draw100(g, i, j);
                }
                else if(map[i][j] == 3){
                    /*g.setColor(Color.blue);
                    g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    key.draw200(g, i, j);
                }
                else if(map[i][j] == 4){
                    /*g.setColor(Color.pink);
                    g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    key.draw300(g, i, j);
                }
                else if(map[i][j] == 5){
                    /*g.setColor(Color.black);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    wall.draw(g, i, j);
                }
                else if(map[i][j] == 6){
                    /*g.setColor(Color.yellow);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    barricade.draw100(g, i, j);
                }
                else if(map[i][j] == 7){
                    /*g.setColor(Color.blue);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    barricade.draw200(g, i, j);
                }
                else if(map[i][j] == 8){
                    /*g.setColor(Color.pink);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    barricade.draw300(g, i, j);
                }
                else if(map[i][j] == 9){
                    /*g.setColor(Color.red);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);*/
                    exit.draw(g, i, j);
                }
            }
        }
    }

    /**
     * @param value
     * @param playerX
     * @param playerY
     * @param value2
     * setValueRight is there to change the number in the 2d Array at the correct position and then to let the program change the colors in the JFrame
     */
    public void setValueRight(int value, int playerX, int playerY, int value2){
        map[playerX][playerY - 1] = value;
        map[playerX][playerY] = value2;
    }

    /**
     * @param value
     * @param playerX
     * @param playerY
     * @param value2
     * setValueLeft is there to change the number in the 2d Array at the correct position and then to let the program change the colors in the JFrame
     */
    public void setValueLeft(int value, int playerX, int playerY, int value2){
        map[playerX][playerY + 1] = value;
        map[playerX][playerY] = value2;
    }

    /**
     * @param value
     * @param playerX
     * @param playerY
     * @param value2
     * setValueUp is there to change the number in the 2d Array at the correct position and then to let the program change the colors in the JFrame
     */
    public void setValueUp(int value, int playerX, int playerY, int value2){
        map[playerX + 1][playerY] = value;
        map[playerX][playerY] = value2;
    }

    /**
     * @param value
     * @param playerX
     * @param playerY
     * @param value2
     * setValueDown is there to change the number in the 2d Array at the correct position and then to let the program change the colors in the JFrame
     */
    public void setValueDown(int value, int playerX, int playerY, int value2){
        map[playerX - 1][playerY] = value;
        map[playerX][playerY] = value2;

    }
}
