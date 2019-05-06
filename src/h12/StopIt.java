package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class StopIt extends Applet {
    int[] numbers = new int [40000];
    int search, mrloop, counter;

    public void init() {
        counter = 0;
        search = 200;
        mrloop = 0;
        numbers[300] = 200;
        while (mrloop != 1){
            if(numbers[counter] == search){
                mrloop = 1;
            } else {
                counter++;
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("Your Value is: " + numbers[counter], 20, 20);
        g.drawString("It was on index: " + counter, 20, 35);
    }
}