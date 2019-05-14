package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;

public class CardsV2 extends Applet {
    Button knop;
    String[] deck1 = new String[52];

    void deck() {
        String[] type = {"Harten", "Ruiten", "Schoppen", "Klaver"};
        String[] numbers = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
        int varhold, i, typen, spot;
        i = 0;
        typen = 0;
        spot = 0;
        while (i < 52) {
            varhold = i % 13;
            if (varhold == 0 && i != 0) {
                typen++;
                spot = 0;
            }
            deck1[i] = "" + type[typen] + " " + numbers[spot];
            spot++;
            i++;
        }
    }

    public void init() {
        setSize(800, 800);
        deck();
        Randomize(deck1);
        knop = new Button("Draw");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        for (int j = 0; j < 52; j++) {
            g.drawString("" + deck1[j], 30 + j / 13 * 100, 50 + (j % 13) * 15);
        }
    }
    public static void Randomize(String[] arr) {
        Random rgen = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randPos = rgen.nextInt(arr.length);
            String tmp = arr[i];
            arr[i] = arr[randPos];
            arr[randPos] = tmp;
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Randomize(deck1);
            repaint();
        }
    }
}
