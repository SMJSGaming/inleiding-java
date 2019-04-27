package h11;

        import java.awt.*;
        import java.applet.*;

public class Squeres extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int x = 10;
        int y = 10;

        while(teller <= 5){
            g.drawRect(x, y, 10, 10);
            teller++;
            x += 10;
            y += 10;
        }
    }
}