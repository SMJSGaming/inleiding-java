package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Finder extends Applet {
    Button button;
    TextField textfield;
    int numbers[] = {1,2,3,4,5,6,7,8,9};
    boolean ready, found;
    int y, index;


    public void init() {
        y = 20;
        found = false;
        ready = false;
        textfield = new TextField("", 2);
        add(textfield);
        button = new Button("ok");
        button.addActionListener( new buttonListener() );
        add(button);
    }

    public void paint(Graphics g) {
        if (y != 20){
            y = 20;
        }
        for (int teller = 0; teller < numbers.length; teller++) {
            g.drawString("" + numbers[teller], 20, y);
            y += 15;
        }
        if(ready == true){
            if(found == true){
                g.drawString("Gevonden!", 50, 20);
                g.drawString("Het was op index: " + index, 50, 35);
            } else {
                g.drawString("Niet gevonden", 50, 20);
            }
        }
    }

    class buttonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            if (found == true){
                found = false;
            }
            String s = textfield.getText();
            int search = Integer.parseInt( s );
            for (int teller = 0; teller < numbers.length; teller++) {
                if (numbers[teller] == search){
                    found = true;
                    index = teller;
                }
                textfield.setText("");
            }
            ready = true;
            repaint();
        }
    }
}