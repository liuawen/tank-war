package cn.liuawen.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-05
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* Frame f = new Frame();
        f.setSize(800, 600);
        f.setResizable(false);
        f.setTitle("tank war");
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });*/
        TankFrame tf = new TankFrame();

        while (true){
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
