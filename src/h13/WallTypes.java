package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class WallTypes extends Applet {
    boolean type1, ready;
    Button knop1, knop2;

    public  void init(){
        ready = false;
        setSize(800, 800);
        knop1 = new Button("type1");
        knop2 = new Button("type2");
        knop1.addActionListener( new Knop1Listener() );
        knop2.addActionListener( new Knop2Listener() );
        add (knop1);
        add (knop2);
    }
    public void paint(Graphics g) {
        if (ready == true) {
            int x, y, width, height, brickrow, rowcounter;
            brickrow = 0;
            rowcounter = 0;
            y = 20;
            if (type1 == true) {
                width = 20;
                height = 10;
                x = 20;
            } else {
                width = 30;
                height = 20;
                x = 30;
            }
            while (brickrow != 10) {
                if (brickrow % 2 == 0) {
                    if (rowcounter == 10) {
                        if (type1 == true) {
                            y += 11;
                            x = 10;
                        } else {
                            y += 21;
                            x = 15;
                        }
                        brickrow++;
                        rowcounter = 0;
                    } else {
                        if (type1 == true) {
                            x += 21;
                        } else {
                            x += 31;
                        }
                        brick(g, x, y, width, height);
                        rowcounter++;
                    }
                } else {
                    if (rowcounter == 11) {
                        if (type1 == true) {
                            y += 11;
                            x = 20;
                        } else {
                            y += 21;
                            x = 30;
                        }
                        brickrow++;
                        rowcounter = 0;
                    } else {
                        if (type1 == true) {
                            x += 21;
                        } else {
                            x += 31;
                        }
                        brick(g, x, y, width, height);
                        rowcounter++;
                    }
                }
            }
        }
    }
    void brick(Graphics g, int x, int y, int width, int height){
        if (type1 == true) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.gray);
        }
        g.fillRect(x, y, width, height);
    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ready = true;
            type1 = true;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            ready = true;
            type1 = false;
            repaint();
        }
    }
}
