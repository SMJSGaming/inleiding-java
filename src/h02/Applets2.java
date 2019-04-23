package h02;

import java.awt.*;
import java.applet.*;

public class Applets2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sjoerd", 180, 60 );
        g.setColor(Color.red);
        g.drawString("Teijgeler", 175, 80 );
    }
}
