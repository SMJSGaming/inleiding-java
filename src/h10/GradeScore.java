package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class GradeScore extends Applet {
    TextField tekstvak;
    Button knop;
    String text;
    double score;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(knop);
        add(tekstvak);
        text = "op dit moment, niks";
    }

    public void paint(Graphics g) {
        if (text == "Ongeldig cijfer!") {
            g.drawString("" + text, 50, 70);
        } else {
            g.drawString("Jouw Score is: " + text, 50, 70);
        }
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            score = Double.parseDouble( s );
            if (score > 10){
                text = "Ongeldig cijfer!";
            }
            if (score <= 3) {
                text = "slecht";
            }
            if (score == 4){
                text = "onvoldoende";
            }
            if (score == 5){
                text = "matig";
            }
            if (score == 6 || score == 7){
                text = "voldoende";
            }
            if (score >= 8 && score <= 10){
                text = "goed";
            }
            repaint();
        }
    }
}