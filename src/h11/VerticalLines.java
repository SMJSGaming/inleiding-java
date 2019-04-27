package h11;

import java.awt.*;
import java.applet.*;

public class VerticalLines extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++){
            x += 10;
            g.drawLine(x , 10, x , 80);
        }
    }
}
