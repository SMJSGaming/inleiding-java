package h13;

import java.awt.*;
import java.applet.*;

public class Wall extends Applet {

    public  void init(){
        setSize(800, 800);
    }
    public void paint(Graphics g) {
        int x, y, width, height, brickrow, rowcounter;
        brickrow = 0;
        rowcounter = 0;
        y = 20;
        width = 20;
        height = 10;
        x = 20;
        while (brickrow != 10) {
            if (brickrow % 2 == 0) {
                if (rowcounter == 10) {
                    y += 11;
                    x = 10;
                    brickrow++;
                    rowcounter = 0;
                } else {
                    x += 21;
                    brick(g, x, y, width, height);
                    rowcounter++;
                }
            } else {
                if (rowcounter == 11) {
                    y += 11;
                    x = 20;
                    brickrow++;
                    rowcounter = 0;
                } else {
                    x += 21;
                    brick(g, x, y, width, height);
                    rowcounter++;
                }
            }
        }
    }
    void brick(Graphics g, int x, int y, int width, int height){
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
}
