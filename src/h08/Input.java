package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Input extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop1;
    Button knop2;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("First type something in the textfield then use the buttons");
        knop1 = new Button("Ok");
        knop2 = new Button("Reset");
        knop1.addActionListener( new Knop1Listener() );
        knop2.addActionListener( new Knop2Listener() );
        add(label);
        add(tekstvak);
        add(knop1);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 75, 75 );
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            s = "";
            repaint();
        }
    }
}