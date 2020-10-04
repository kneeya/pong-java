package pongjava;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Tennis extends Applet implements Runnable, KeyListener{
    final int WIDTH = 700, HEIGHT = 500;
    Thread thread;

    public void init() {
        this.resize(WIDTH, HEIGHT);

        this.addKeyListener(this);

        thread = new Thread(this);
        thread.start();
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

            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {

        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

        }
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP) {

        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
        
    }

    public void keyTyped(KeyEvent arg0) {
        
    }
}

