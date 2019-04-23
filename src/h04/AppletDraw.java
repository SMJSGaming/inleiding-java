package h04;

import java.awt.*;
import java.applet.*;

public class AppletDraw extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.black);
            g.drawRoundRect(280, 20, 100, 50,10,10);
            g.drawRect(20, 20, 100, 50);
        g.setColor(Color.darkGray);
            g.fillOval(140,20,120,130);
            g.fillArc(120,150,100,50,90,45);
            g.fillArc(180,150,100,50,90,-45);

        g.setColor(Color.white);
            g.fillRoundRect(280, 80, 100, 50,10,10);
            g.fillRect(20, 80, 100, 50);

    }
}