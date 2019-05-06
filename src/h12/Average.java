package h12;

import java.awt.*;
import java.applet.*;

public class Average extends Applet {
    double[] numbers = { 20.0, 5.0, 10.0, 7.0, 15.0, 12.0, 17.0, 3.0, 9.0, 19.0 };
    double average;
    int y;

    public void init() {
        y = 30;
        average = 0;
        for (int teller = 0; teller < numbers.length; teller++) {
            average += numbers[teller];
        }
        average /= numbers.length;
    }

    public void paint(Graphics g)  {
        g.drawString("Alle nummers zijn:", 50, 20);
        for (int teller = 0; teller < numbers.length; teller++) {
            g.drawString("" + numbers[teller], 50, y);
            y += 10;
        }
        y += 10;
        g.drawString("Het gemiddelde is: " + average, 50, y);
    }
}