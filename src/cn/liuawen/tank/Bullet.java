package cn.liuawen.tank;

import java.awt.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-06
 */
public class Bullet {
//    private static final int SPEED = 10;
    private static final int SPEED = 1;
//    private static final int WIDTH = 5, HEIGHT = 5;
    private static final int WIDTH = 30, HEIGHT = 30;

    private int x, y;
    private Dir dir;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(c);

        move();
    }

    private void move() {

        switch (dir){
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
        }
    }
}
