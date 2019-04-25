package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class GradesList extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    TextField tekstvak6;
    TextField tekstvak7;
    TextField tekstvak8;
    TextField tekstvak9;
    TextField tekstvak10;
    Button knop;
    double grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, grade10, ammount;

    public void init() {
        tekstvak1 = new TextField("", 30);
        tekstvak2 = new TextField("", 30);
        tekstvak3 = new TextField("", 30);
        tekstvak4 = new TextField("", 30);
        tekstvak5 = new TextField("", 30);
        tekstvak6 = new TextField("", 30);
        tekstvak7 = new TextField("", 30);
        tekstvak8 = new TextField("", 30);
        tekstvak9 = new TextField("", 30);
        tekstvak10 = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(knop);
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        add(tekstvak6);
        add(tekstvak7);
        add(tekstvak8);
        add(tekstvak9);
        add(tekstvak10);
        ammount = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Your score is: " + grade1, 50, 70 );
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = tekstvak1.getText();
            String b = tekstvak2.getText();
            String c = tekstvak3.getText();
            String d = tekstvak4.getText();
            String f = tekstvak5.getText();
            String g = tekstvak6.getText();
            String h = tekstvak7.getText();
            String i = tekstvak8.getText();
            String j = tekstvak9.getText();
            String k = tekstvak10.getText();
            if(a != "") {
                grade1 = Double.parseDouble(a);
            }
            if(b != "") {
                grade2 = Double.parseDouble(b);
                grade1 += grade2;
                ammount++;
            }
            if(c != "") {
                grade3 = Double.parseDouble(c);
                grade1 += grade3;
                ammount++;
            }
            if(d != "") {
                grade4 = Double.parseDouble(d);
                grade1 += grade4;
                ammount++;
            }
            if(f != "") {
                grade5 = Double.parseDouble(f);
                grade1 += grade5;
                ammount++;
            }
            if(g != "") {
                grade6 = Double.parseDouble(g);
                grade1 += grade6;
                ammount++;
            }
            if(h != "") {
                grade7 = Double.parseDouble(h);
                grade1 += grade7;
                ammount++;
            }
            if(i != "") {
                grade8 = Double.parseDouble(i);
                grade1 += grade8;
                ammount++;
            }
            if(j != "") {
                grade9 = Double.parseDouble(j);
                grade1 += grade9;
                ammount++;
            }
            if(k != "") {
                grade10 = Double.parseDouble(k);
                grade1 += grade10;
                ammount++;
            }
            grade1 /= ammount;
        }
    }
}