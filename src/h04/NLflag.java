package h04;

import java.awt.*;
import java.applet.*;

public class NLflag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(30,50,10,300);
        g.setColor(Color.red);
        g.fillRect(40,55,90,20);
        g.setColor(Color.white);
        g.fillRect(40,75,90,20);
        g.setColor(Color.blue);
        g.fillRect(40,95,90,20);
    }
}
