package h13;

import java.awt.*;
import java.applet.*;

public class TreesForDays extends Applet {

    public  void init(){
        setSize(800,800);
    }
    public void paint(Graphics g) {
        int rows, ammount, size, height;
        rows = 2;
        ammount = 5;
        size = 80;
        height = 100;
        TreeBase(g, rows, ammount, size, height);
    }
    void TreeBase(Graphics g, int rows, int ammount, int size, int height){
        int y1, y2, x, xtree1, xtree2, ybush, counter1, counter2;
        y1 = 790;
        y2 = y1 - height;
        x = 20;
        ybush = y2 - size + size / 10;
        counter1 = 0;
        counter2 = 0;
        while (counter1 != rows) {
            while (counter2 != ammount) {
                xtree1 = size / 8 * 3 + x;
                xtree2 = size / 8 * 5 + x;
                g.drawLine(xtree1, y1, xtree1, y2);
                g.drawLine(xtree2, y1, xtree2, y2);
                g.fillOval(x, ybush, size, size);
                x += size + size / 5;
                counter2++;
            }
            counter1++;
            x = 20 + 20 * counter1;
            y1 = ybush - 20;
            y2 = y1 - height;
            ybush = y2 - size + size / 10;
            counter2 = 0;
        }
    }
}
