package pongjava;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Tennis extends Applet implements Runnable{
    final int WIDTH = 700, HEIGHT = 500;
    public void init() {
        this.resize(WIDTH, HEIGHT);
    }
    public void paint(Graphics g) {
        g.setColor(Color.black)
        g.fillReact(0, 0, WIDTH, HEIGHT);
    }
    public void update(Graphics g) {
        paint(g);
    }
    public void run() {
        for(;;){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}

