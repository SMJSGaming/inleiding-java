package h06;

import java.awt.*;
import java.applet.*;

public class Divide extends Applet {
    double Jan, Ali, Jeannette, Sjoerd, total, part;

    public void init() {
        setBackground(Color.lightGray);
        total = 113;
        part = total / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: $" + part, 20,20);
        g.drawString("Ali: $" + part, 20,40);
        g.drawString("Jeannette: $" + part, 19,60);
        g.drawString("Sjoerd: $" + part, 19,80);
    }
}