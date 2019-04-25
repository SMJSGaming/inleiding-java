# Module Java

Forked project for further coding.
Software:
-Git
-InelliJ IDEA

----------------------------------------
Main codes:

**h04**
```java
package h04;

import java.awt.*;
import java.applet.*;

public class LastTest extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //part 1
        g.drawLine(10,20,210,20);
        g.drawString("Lijn",95,35);
        g.drawRect(10,40,200,90);
        g.drawString("Rechthoek",80,145);
        g.drawRoundRect(10,150,200,90,30,30);
        g.drawString("Afgeronde rechthoek",50,255);
        //part 2
        g.setColor(Color.magenta);
        g.fillRect(220,40,200,90);
        g.setColor(Color.darkGray);
        g.drawOval(220,40,200,90);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",240,145);
        g.setColor(Color.magenta);
        g.fillOval(220,150,200,90);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",285,255);
        //part 3
        g.drawOval(430,40,200,90);
        g.setColor(Color.magenta);
        g.fillArc(430,40,200,90,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",445,145);
        g.drawOval(485,150,90,90);
        g.drawString("Cirkel",515,255);
    }
}
```

**h06**
```java
package h06;

import java.awt.*;
import java.applet.*;

public class LastTest extends Applet {
    double score1, score2, score3, result;
    int altresult;

    public void init() {
        setBackground(Color.lightGray);
        score1 = 5.9;
        score2 = 6.3;
        score3 = 6.9;
        result = (score1 + score2 + score3) / 3;
        result *= 10;
        altresult = (int) result;
        result = (double) altresult;
        result /= 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + result, 20,20);
    }
}
```

**h08**
```java
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
}```
