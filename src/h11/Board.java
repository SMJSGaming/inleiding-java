package h11;

import java.awt.*;
import java.applet.*;

public class Board extends Applet {

    public void init() {
        setSize(1000,1000);
        setBackground(Color.GRAY);
    }

    public void paint(Graphics g) {
        int teller = 1;
        int telhold, rowcounthold;
        int rowcount = 1;
        int x = 40;
        int y = 40;

        while(teller <= 71){
            telhold = teller % 2;
            if (telhold == 0) {
                g.setColor(Color.white);
            } else {
                g.setColor(Color.black);
            }
            g.fillRect(x,y,40,40);
            x += 40;
            teller++;
            rowcount++;
            rowcounthold = rowcount % 9;
            if (rowcounthold == 0){
                rowcount = 1;
                y += 40;
                x = 40;
                teller++;
            }
        }
    }
}