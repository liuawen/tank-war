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
        System.out.println("paint");
//        g.fillRect(200,200,50,50);
        g.fillRect(x, y, 20, 20);
        x += 10;
        y += 10;
    }

    //处理键盘事件的类
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            //按下去
            System.out.println("key pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //抬起来
            System.out.println("key released");
        }
    }
}
