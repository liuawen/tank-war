package cn.liuawen.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-10-05
 */
public class T {
    public static void main(String[] args) {
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

    }
}
