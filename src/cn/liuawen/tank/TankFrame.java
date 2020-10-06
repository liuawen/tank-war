package cn.liuawen.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-06
 */
public class TankFrame  extends Frame {
    int x = 200;
    int y = 200;
    Dir dir = Dir.DOWN;
    private static final int SPEED = 10;
    public TankFrame(){
        this.setSize(800, 600);
        this.setResizable(false);
        this.setTitle("tank war");
        this.setVisible(true);
        //内部类 我写一个其他也调用不到 直接内部类吧
        this.addKeyListener(new MyKeyListener());
        //匿名内部类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //窗口自动绘制调用这个方法   系统自动调用
    //graphics g  画笔
    @Override
    public void paint(Graphics g){
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
//        System.out.println("paint");
//        g.fillRect(200,200,50,50);
//        g.fillRect(x, y, 20, 20);
        //停止
//        x += 10;
//        y += 10;
    }

    //处理键盘事件的类
    class MyKeyListener extends KeyAdapter{
        //我想斜着走呢  控制方向
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            //按下去


            int key = e.getKeyCode();

            switch (key){
                case KeyEvent.VK_LEFT:
//                    x -= 10;
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
//                    y -=10;
                    bU = true;
                    break;

                case KeyEvent.VK_RIGHT:
//                    x += 10;
                    bR = true;
                    break;

                case KeyEvent.VK_DOWN:
//                    y +=10;
                    bD = true;
                    break;
                default:
                    break;
            }
            setMainTankDir();
//            System.out.println("key pressed");

//            x += 100;
//            repaint();
        }


        @Override
        public void keyReleased(KeyEvent e) {
            //抬起来

            int key = e.getKeyCode();

            switch (key){
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;

                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;

                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;

                default:
                    break;
            }
            setMainTankDir();
        }
        private void setMainTankDir() {
            if (bL) dir = Dir.LEFT;
            if (bU) dir = Dir.UP;
            if (bR) dir = Dir.RIGHT;
            if (bD) dir = Dir.DOWN;

        }

    }
}
