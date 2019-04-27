package h11;

import java.awt.*;
import java.applet.*;

public class Fibonacci extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int getal1, getal2;
        int y = 0;
        getal1 = 1;
        getal2 = 1;

        while (getal1 < 6000) {
            y += 15;
            if (y == 15) {
                g.drawString("1", 20, y);
                y += 15;
            }
            getal2 += getal1;
            g.drawString("" + getal1, 20, y);
            y += 15;
            g.drawString("" + getal2, 20, y);
            getal1 += getal2;
        }
    }
}