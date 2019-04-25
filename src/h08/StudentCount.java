package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class StudentCount extends Applet {
    TextField tekstvak;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int man,vrouw,potman,potvrouw, total;

    public void init() {
        vrouw = 0;
        man = 0;
        potvrouw = 0;
        potman = 0;
        knop1 = new Button("vrouw");
        knop2 = new Button("man");
        knop3 = new Button("potentiële vrouwlijke leerling");
        knop4 = new Button("potentiële mannelijke leerling");
        knop1.addActionListener( new Knop1Listener() );
        knop2.addActionListener( new Knop2Listener() );
        knop3.addActionListener( new Knop3Listener() );
        knop4.addActionListener( new Knop4Listener() );
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    public void paint(Graphics g) {
        g.drawString("vrouwen: " + vrouw, 75, 75 );
        g.drawString("mannen: " + man, 75, 90 );
        g.drawString("potentiële vrouwlijke leerlingen: " + potvrouw, 75, 105 );
        g.drawString("potentiële mannelijke leerlingen: " + potman, 75, 120 );
        g.drawString("totaal: " + total, 75, 135 );
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            total = vrouw + man;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            man++;
            total = vrouw + man;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouw++;
            potvrouw++;
            total = vrouw + man;
            repaint();
        }
    }
    class Knop4Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            man++;
            potman++;
            total = vrouw + man;
            repaint();
        }
    }
}