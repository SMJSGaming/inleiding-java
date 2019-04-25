package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HighestNum extends Applet {
    TextField tekstvak;
    Button knop;
    double num, numhold;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        tekstvak.addActionListener( new TekstvakListener() );
        add(knop);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("You highest number is: " + numhold, 50, 70 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num = Double.parseDouble( s );
            if (num > numhold){
                numhold = num;
            }
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num = Double.parseDouble( s );
            if (num > numhold){
                numhold = num;
            }
            repaint();
        }
    }
}