package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class LastTest extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button times;
    Button divide;
    Button add;
    Button subtract;
    double result, part1, part2;

    public void init() {
        tekstvak1 = new TextField("", 15);
        tekstvak2 = new TextField("", 15);
        times = new Button("*");
        divide = new Button("/");
        add = new Button("+");
        subtract = new Button("-");
        times.addActionListener( new TimesListener() );
        divide.addActionListener( new DivideListener() );
        add.addActionListener( new AddListener() );
        subtract.addActionListener( new SubtractListener() );
        add(tekstvak1);
        add(tekstvak2);
        add(times);
        add(divide);
        add(add);
        add(subtract);
    }

    public void paint(Graphics g) {
    }

    class TimesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            part1 = Double.parseDouble( s );
            String t = tekstvak2.getText();
            part2 = Double.parseDouble( t );
            result = part1 * part2;
            tekstvak1.setText("" + result);
            tekstvak2.setText("");
            repaint();
        }
    }
    class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            part1 = Double.parseDouble( s );
            String t = tekstvak2.getText();
            part2 = Double.parseDouble( t );
            result = part1 / part2;
            tekstvak1.setText("" + result);
            tekstvak2.setText("");
            repaint();
        }
    }
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            part1 = Double.parseDouble( s );
            String t = tekstvak2.getText();
            part2 = Double.parseDouble( t );
            result = part1 + part2;
            tekstvak1.setText("" + result);
            tekstvak2.setText("");
            repaint();
        }
    }
    class SubtractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            part1 = Double.parseDouble( s );
            String t = tekstvak2.getText();
            part2 = Double.parseDouble( t );
            result = part1 - part2;
            tekstvak1.setText("" + result);
            tekstvak2.setText("");
            repaint();
        }
    }
}
