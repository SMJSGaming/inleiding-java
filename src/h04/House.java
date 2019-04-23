package h04;

import java.awt.*;
import java.applet.*;

public class House extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.drawLine(100,20,20,100);
        g.drawLine(100,20,180,100);
        g.drawLine(20,100,180,100);
        g.drawRect(30,100,140,100);
        g.drawRect(100,150,30,50);
        g.drawOval(122,175,5,5);
        g.drawRect(50,155,30,30);
        g.drawLine(65,155,65,185);
        g.drawLine(50,170,80,170);
    }
}
