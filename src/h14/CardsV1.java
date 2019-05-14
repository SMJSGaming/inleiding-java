package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CardsV1 extends Applet {
    String[] type = {"Harten", "Ruiten", "Schoppen", "Klaver"};
    String[] numbers = {"aas","twee","drie","vier","vijf","zes","zeven","acht","negen","tien","boer","vrouw","heer"};
    int r12, r22;
    double r1, r2;
    Button knop;

    public void random(){
        r1 = Math.random();
        r2 = Math.random();
        r12 = (int)(r1 * 3);
        r22 = (int)(r2 * 12);
    }
    public void init(){
        random();
        knop = new Button("Draw");
        knop.addActionListener( new KnopListener() );
        add(knop);
    }
    public void paint(Graphics g) {
        g.drawString("" + type[r12] + " " + numbers[r22], 30, 30);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            random();
            repaint();
        }
    }
}
