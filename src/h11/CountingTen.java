package h11;

import java.awt.*;
import java.applet.*;

public class CountingTen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 20; teller >= 10; teller--){
            y += 10;
            g.drawString("" + teller, 20, y);
        }
    }
}
