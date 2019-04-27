package h11;

import java.awt.*;
import java.applet.*;

public class CirclesV1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int width = 40;
        int height = 40;
        int x = 20;
        int y = 20;

        while(teller <= 5){
            g.drawOval(x,y,width,height);
            teller++;
            width -= 8;
            height -= 8;
            x += 4;
            y += 4;
        }
    }
}