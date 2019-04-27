package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TablesV2 extends Applet {
    Button knop;
    int counter, output, y;
    int table = 1;

    public void init() {
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        y = 50;
        counter = 1;
        while (counter <= 10) {
            output = table * counter;
            g.drawString("" + counter + " x " + table + " = " + output, 175, y);
            y += 15;
            counter++;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (table != 10) {
                table++;
            } else {
                table = 1;
            }
            repaint();
        }
    }
}