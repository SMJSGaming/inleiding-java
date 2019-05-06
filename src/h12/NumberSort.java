package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class NumberSort extends Applet {
    Button button;
    TextField textfields[] = new TextField [5];
    int numbers[] = new int [5];
    int y;
    boolean ready;


    public void init() {
        ready = false;
        y = 60;
        for (int teller = 0; teller < 5; teller++) {
            textfields[teller] = new TextField("", 1);
            add(textfields[teller]);
        }
        button = new Button("ok");
        button.addActionListener( new buttonListener() );
        add(button);
    }

    public void paint(Graphics g)  {
        if (ready == true) {
            if (y != 60){
                y = 60;
            }
            for (int teller = 0; teller < 5; teller++) {
                g.drawString("" + numbers[teller], 50, y);
                y += 15;
            }
        }
    }

    class buttonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            for (int teller = 0; teller < 5; teller++) {
                String s = textfields[teller].getText();
                numbers[teller] = Integer.parseInt( s );
                textfields[teller].setText("");
            }
            Arrays.sort(numbers);
            ready = true;
            repaint();
        }
    }
}