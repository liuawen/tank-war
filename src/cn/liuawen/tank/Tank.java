package cn.liuawen.tank;

import java.awt.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-06
 */
public class Tank {
    private int x, y;
    private Dir dir = Dir.DOWN;
    private static final int SPEED = 10;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 20, 20);
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
    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
}
