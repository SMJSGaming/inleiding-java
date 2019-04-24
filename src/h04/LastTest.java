package h04;

import java.awt.*;
import java.applet.*;

public class LastTest extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //part 1
        g.drawLine(10,20,200,20);
        g.drawString("Lijn",95,35);
        g.drawRect(10,40,200,90);
        g.drawString("Rechthoek",80,145);
        g.drawRoundRect(10,150,200,90,30,30);
        g.drawString("Afgeronde rechthoek",50,255);
        //part 2
        g.setColor(Color.magenta);
        g.fillRect(220,40,200,90);
        g.setColor(Color.darkGray);
        g.drawOval(220,40,200,90);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",240,145);
        g.setColor(Color.magenta);
        g.fillOval(220,150,200,90);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",285,255);
        //part 3
        g.drawOval(430,40,200,90);
        g.setColor(Color.magenta);
        g.fillArc(430,40,200,90,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",445,145);
        g.drawOval(485,150,90,90);
        g.drawString("Cirkel",515,255);
    }
}