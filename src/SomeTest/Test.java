package SomeTest;

import java.awt.*;
import java.applet.*;

public class Test extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.drawString("Applet lib test", 10, 20 );
        g.drawString("This works I guess", 10, 280 );
    }
}
