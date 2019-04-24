package h05;

import java.awt.*;
import java.applet.*;

public class LastTestVar extends Applet {
    Color fillercolor;
    Color linecolor;
    int width;
    int hight;
    int xrow1;
    int xrow2;
    int xrow3;
    int ylayer1;
    int ylayer2;
    int ytextlayer1;
    int ytextlayer2;

    public void init() {
        fillercolor = Color.magenta;
        linecolor = Color.black;
        width = 200;
        hight = 90;
        xrow1 = 10;
        xrow2 = 220;
        xrow3 = 430;
        ylayer1 = 40;
        ylayer2 = 150;
        ytextlayer1 = 145;
        ytextlayer2 = 255;
    }

    public void paint(Graphics g) {
        //part 1
        g.drawLine(xrow1,20,210,20);
        g.drawString("Lijn",95,35);
        g.drawRect(xrow1,ylayer1,width,hight);
        g.drawString("Rechthoek",80,ytextlayer1);
        g.drawRoundRect(xrow1,ylayer2,width,hight,30,30);
        g.drawString("Afgeronde rechthoek",50,ytextlayer2);
        //part 2
        g.setColor(fillercolor);
        g.fillRect(xrow2,ylayer1,width,hight);
        g.setColor(linecolor);
        g.drawOval(xrow2,ylayer1,width,hight);
        g.setColor(linecolor);
        g.drawString("Gevulde rechthoek met ovaal",240,ytextlayer1);
        g.setColor(fillercolor);
        g.fillOval(xrow2,ylayer2,width,hight);
        g.setColor(linecolor);
        g.drawString("Gevulde ovaal",285,ytextlayer2);
        //part 3
        g.drawOval(xrow3,ylayer1,width,hight);
        g.setColor(fillercolor);
        g.fillArc(xrow3,ylayer1,width,hight,0,45);
        g.setColor(linecolor);
        g.drawString("Taartpunt met ovaal eromheen",445,ytextlayer1);
        g.drawOval(485,ylayer2,90,90);
        g.drawString("Cirkel",515,ytextlayer2);
    }
}