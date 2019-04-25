package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class YearMonthDays extends Applet {
    TextField tekstvak, TextYear;
    Button knop;
    String tekst;
    int month, year, yearhold;

    public void init() {
        TextYear = new TextField("year", 9);
        tekstvak = new TextField("month", 9);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(knop);
        add(TextYear);
        add(tekstvak);
        tekst = "Niets tot nu toe.";
    }

    public void paint(Graphics g) {
        if (year != 0) {
            g.drawString("Het Jaar: " + year, 50, 70);
        } else {
            g.drawString("", 50, 70);
        }
        if (month == 2){
            if (yearhold == 0){
                g.drawString("Februari, 29 dagen" + tekst, 50, 80);
            } else {
                g.drawString("Februari, 28 dagen" + tekst, 50, 80);
            }
        } else {
            g.drawString("" + tekst, 50, 80);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            month = Integer.parseInt( s );
            s = TextYear.getText();
            year = Integer.parseInt( s );
            yearhold %= 4;
            switch (month){
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    tekst = "";
                    break;
                case 3:
                    tekst = "Maart, 31 dagen";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "Juli, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
                default:
                    tekst = "Een niet bestaande maand die oneindig lang duurt, ∞ dagen";
                    break;
            }
            repaint();
        }
    }
}