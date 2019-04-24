package h04;

import java.awt.*;
import java.applet.*;

public class Dice extends Applet {

    public void init() {
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(60,60,50,50);
        g.setColor(Color.black);
        g.drawRect(60,60,50,50);
        g.fillOval(70,70,10,10);
        g.fillOval(90,70,10,10);
        g.fillOval(70,90,10,10);
        g.fillOval(90,90,10,10);
    }
}