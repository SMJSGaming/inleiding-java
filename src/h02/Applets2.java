package h02;


    /*

    @(#)Show.java 1.0 03/02/26

    *

    Voorbeeld 2.1

    *

    */

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Applets2 extends Applet {
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sjoerd", 180, 60 );
        g.setColor(Color.red);
        g.drawString("Teijgeler", 175, 80 );
    }
}
