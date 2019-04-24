package h04;

import java.awt.*;
import java.applet.*;

public class Graph extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //graph
        g.drawRect(50,20,140,120);
        //lines
        g.setColor(Color.lightGray);
            g.drawLine(50,40,190,40);
            g.drawLine(50,60,190,60);
            g.drawLine(50,80,190,80);
            g.drawLine(50,100,190,100);
            g.drawLine(50,120,190,120);
        //values
        g.setColor(Color.black);
            g.drawString("0",37,147);
            g.drawString("20",30,127);
            g.drawString("40",30,107);
            g.drawString("60",30,87);
            g.drawString("80",30,67);
            g.drawString("100",23,47);
            g.drawString("120",23,27);
        //graph lines
        g.setColor(Color.red);
            g.fillRect(70,100,20,40);
        g.setColor(Color.orange);
            g.fillRect(110,40,20,100);
        g.setColor(Color.yellow);
            g.fillRect(150,60,20,80);
        //names
        g.setColor(Color.black);
            g.drawString("Valerie",55,160);
            g.drawString("Jeroen",100,160);
            g.drawString("Hans",147,160);
        //scale
        g.drawString("KG",28,10);
    }
}
