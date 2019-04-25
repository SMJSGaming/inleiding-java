package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class LowestNum extends Applet {
    TextField tekstvak;
    Button knop;
    double num, numhold;

    public void init() {
        tekstvak = new TextField("", 9);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        tekstvak.addActionListener( new TekstvakListener() );
        add(knop);
        add(tekstvak);
        numhold = 2147483647;
    }

    public void paint(Graphics g) {
        if (numhold != 2147483647) {
            g.drawString("You highest number is: " + numhold, 50, 70);
        } else {
            g.drawString("You highest number is: 0.0", 50, 70);
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num = Double.parseDouble( s );
            if (num < numhold){
                numhold = num;
            }
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num = Double.parseDouble( s );
            if (num < numhold){
                numhold = num;
            }
            repaint();
        }
    }
}