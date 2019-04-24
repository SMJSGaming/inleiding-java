package h06;

import java.awt.*;
import java.applet.*;

public class Seconds extends Applet {
    int Year, Day, Hour;

    public void init() {
        setBackground(Color.lightGray);
        Hour = 60 * 60;
        Day = Hour * 24;
        Year = Day * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Hour: " + Hour, 20,20);
        g.drawString("Day: " + Day, 20,40);
        g.drawString("Year: " + Year, 20,60);
    }
}