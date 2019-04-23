package h04;

import java.awt.*;
import java.applet.*;

public class Triangle extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.drawLine(100,20,20,100);
        g.drawLine(100,20,180,100);
        g.drawLine(20,100,180,100);
    }
}
