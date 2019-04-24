package h06;

import java.awt.*;
import java.applet.*;

public class LastTest extends Applet {
    double score1, score2, score3, result;
    int altresult;

    public void init() {
        setBackground(Color.lightGray);
        score1 = 5.9;
        score2 = 6.3;
        score3 = 6.9;
        result = (score1 + score2 + score3) / 3;
        result *= 10;
        altresult = (int) result;
        result = (double) altresult;
        result /= 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + result, 20,20);
    }
}
