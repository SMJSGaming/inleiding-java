package h04;

import java.awt.*;
import java.applet.*;

public class TrafficLight extends Applet {

    public void init() {
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {
        g.fillRect(30,30,40,100);
        g.fillRect(45,130,10,200);
        g.setColor(Color.red);
        g.fillOval(40,40,20,20);
        g.setColor(Color.orange);
        g.fillOval(40,70,20,20);
        g.setColor(Color.green);
        g.fillOval(40,100,20,20);
    }
}