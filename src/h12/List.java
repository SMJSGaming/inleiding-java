package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class List extends Applet {
    TextField fields1[] = new TextField[10];
    TextField fields2[] = new TextField[10];
    Button ok;
    int counter, y;
    String a[] = new String[10];
    String b[] = new String[10];
    boolean ready;

    public void init() {
        setSize(1200,500);
        counter = 0;
        y = 70;
        for (int teller = 0; teller < 10; teller++) {
            fields1[teller]= new TextField ("Naam", 20);
            add(fields1[teller]);
            fields2[teller]= new TextField ("Telefoon", 20);
            add(fields2[teller]);
        }
        ok = new Button("OK");
        ok.addActionListener( new okListener() );
        add(ok);
    }

    public void paint(Graphics g) {
        if (y != 70) {
            y = 70;
        }
        if (ready == true) {
            if (counter == 10) {
                for (int teller = 0; teller < 10; teller++) {
                    g.drawString(a[teller] + ":", 10, y);
                    y += 15;
                    g.drawString(b[teller], 10, y);
                    y += 15;
                    counter = 0;
                    ready = false;
                }
            } else {
                g.drawString(a[counter], 10, 70);
                g.drawString(b[counter], 10, 85);
            }
        }
    }
    class okListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            if (ready == false){
                for (int teller = 0; teller < 10; teller++) {
                    a[teller] = fields1[teller].getText();
                    fields1[teller].setText("");
                    b[teller] = fields2[teller].getText();
                    fields2[teller].setText("");
                }
            } else {
                counter++;
            }
            ready = true;
            repaint();
        }
    }
}