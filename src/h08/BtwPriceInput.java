package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BtwPriceInput extends Applet {
    TextField tekstvak;
    Label label;
    String t;
    Button knop;
    double prijs, prijshold;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        label = new Label("Type de prijs in een [cijfer].[cijfer] formaat.");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(knop);
        add(tekstvak);
        prijs = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Prijs inclusief BTW: " + prijs, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            prijs = Double.parseDouble( s );
            prijshold = prijs / 100;
            prijshold *= 21;
            prijs += prijshold;
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            prijs = Double.parseDouble( s );
            prijshold = prijs / 100;
            prijshold *= 21;
            prijs += prijshold;
            repaint();
        }
    }
}