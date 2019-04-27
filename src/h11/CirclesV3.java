package h11;

import java.awt.*;
import java.applet.*;

public class CirclesV3 extends Applet {

    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int width = 100;
        int height = 100;

        while(teller <= 100){
            g.drawOval(20,20,width,height);
            teller++;
            //I do not recommend making this here smaller then 6 (this has to do with the resolution (8 is the most stable))
            width += 8;
            height += 8;
        }
    }
}