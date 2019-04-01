import java.awt.*;

public class MapGenerator {
    public int [][]map =
            {
                    {0, 5, 6, 1, 1, 6, 1, 1, 5, 5},
                    {1, 5, 6, 2, 1, 6, 1, 1, 3, 5},
                    {1, 1, 6, 1, 5, 1, 1, 1, 7, 5},
                    {1, 5, 6, 1, 5, 1, 5, 5, 1, 1},
                    {3, 1, 5, 2, 6, 7, 5, 5, 7, 1},
                    {1, 1, 1, 5, 6, 1, 5, 5, 1, 7},
                    {5, 5, 1, 6, 6, 1, 4, 5, 7, 7},
                    {2, 1, 1, 6, 6, 1, 1, 1, 5, 8},
                    {1, 5, 8, 2, 6, 1, 8, 5, 8, 8},
                    {1, 4, 8, 5, 3, 6, 8, 8, 5, 9}
            };
    public int brickWidth;
    public int brickHeight;
    public MapGenerator(int row, int col){
        /*map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }*/

        brickWidth = 1000/10;
        brickHeight = 1000/10;
    }
    public void draw(Graphics2D g){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 1){
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 2){
                    g.setColor(Color.yellow);
                    g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 3){
                    g.setColor(Color.blue);
                    g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 4){
                    g.setColor(Color.pink);
                    g.fillOval(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 5){
                    g.setColor(Color.black);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 6){
                    g.setColor(Color.yellow);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 7){
                    g.setColor(Color.blue);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 8){
                    g.setColor(Color.pink);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 9){
                    g.setColor(Color.red);
                    g.fillRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth, i * brickHeight, brickWidth, brickHeight);
                }
            }
        }
    }
}
