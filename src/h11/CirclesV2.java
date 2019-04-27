package h11;

import java.awt.*;
import java.applet.*;

public class CirclesV2 extends Applet {

    public void init() {
        setSize(500,500);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int width = 400;
        int height = 400;
        int x = 20;
        int y = 20;

        while(teller <= 50){
            g.drawOval(x,y,width,height);
            teller++;
            width -= 8;
            height -= 8;
            x += 4;
            y += 4;
        }
    }
}