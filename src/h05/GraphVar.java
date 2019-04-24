package h05;

import java.awt.*;
import java.applet.*;

public class GraphVar extends Applet {
    int ValerieKG;
    int JeroenKG;
    int HansKG;

    int ValerieKGorg;
    int JeroenKGorg;
    int HansKGorg;

    int ValerieKGcord;
    int JeroenKGcord;
    int HansKGcord;

    int VarholderValerie;
    int VarholderJeroen;
    int VarholderHans;

    public void init() {
        //edit this for new weights
        ValerieKG = 40;
        JeroenKG = 100;
        HansKG = 80;

        //don't edit this
        ValerieKGorg = 40;
        JeroenKGorg = 100;
        HansKGorg = 80;

        ValerieKGcord = 100;
        JeroenKGcord = 40;
        HansKGcord = 60;

        //changing the graph start cords according to Valerie her new weight
        VarholderValerie = ValerieKG - ValerieKGorg;
        ValerieKGcord = ValerieKGcord - VarholderValerie;

        //changing the graph start cords according to Jeroen his new weight
        VarholderJeroen = JeroenKG - JeroenKGorg;
        JeroenKGcord = JeroenKGcord - VarholderJeroen;

        //changing the graph start cords according to Hans his new weight
        VarholderHans = HansKG - HansKGorg;
        HansKGcord = HansKGcord - VarholderHans;


        //To be honest. this was me desperately trying to fix the fact that this code wasn't made for dynamic editing.
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
        g.fillRect(70,ValerieKGcord,20,ValerieKG);
        g.setColor(Color.orange);
        g.fillRect(110,JeroenKGcord,20,JeroenKG);
        g.setColor(Color.yellow);
        g.fillRect(150,HansKGcord,20,HansKG);
        //names
        g.setColor(Color.black);
        g.drawString("Valerie",55,160);
        g.drawString("Jeroen",100,160);
        g.drawString("Hans",147,160);
        //scale
        g.drawString("KG",28,10);
    }
}
