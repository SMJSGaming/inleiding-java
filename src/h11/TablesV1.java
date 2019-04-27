package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TablesV1 extends Applet {
    TextField tekstvak;
    Button knop;
    int table, counter, output, ready, y;

    public void init() {
        tekstvak = new TextField("", 8);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        y = 50;
        if(ready == 1) {
            counter = 1;
            while (counter <= 10) {
                output = table * counter;
                g.drawString("" + counter + " x " + table + " = " + output, 145, y);
                y += 15;
                counter++;
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            table = Integer.parseInt(s);
            if (s != "") {
                ready = 1;
            }
            tekstvak.setText("");
            repaint();
        }
    }
}