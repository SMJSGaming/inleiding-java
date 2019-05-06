package h12;

import java.awt.*;
import java.applet.*;

public class ButtonsForDays extends Applet {
    Button buttons[] = new Button [25];


    public void init() {
        for (int teller = 0; teller < 25; teller++) {
            buttons[teller]=new Button("Buttons For Days!");
            add(buttons[teller]);
        }
    }

    public void paint(Graphics g)  {
    }
}