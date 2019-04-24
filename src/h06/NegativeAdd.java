package h06;

import java.awt.*;
import java.applet.*;

public class NegativeAdd extends Applet {
    int var1, var2, result;

    public void init() {
        setBackground(Color.lightGray);
        var1 = 20;
        var2 = 2;
        result -= var1 + var2;
    }

    public void paint(Graphics g) {
        g.drawString("" + result, 20,20);
    }
}
