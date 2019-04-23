package h02;

    import java.awt.*;
    import java.applet.*;

     public class Applets extends Applet {

         public void init() {
             setBackground(Color.blue);
         }
         public void paint(Graphics g) {
             g.setColor(Color.yellow);
             g.drawString("Hi, my name is Sjoerd Teijgeler aka SMJS", 50, 60 );
         }
     }