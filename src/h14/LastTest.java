package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class LastTest extends Applet {
    private TextField input;
    private Button submit;
    private int ammount, counter = 0;
    private int coins = 23;
    private boolean error, ready = false;
    private boolean win = true;
    private int[] moves = {21, 17, 13, 9, 5, 1, 0};

    public void init() {
        setSize(800, 800);
        input = new TextField("", 20);
        submit = new Button("Ok");
        input.addActionListener(new text());
        submit.addActionListener(new button());
        add(input);
        add(submit);
    }
    public void paint(Graphics g) {
        if (error) {
            g.drawString("invalid value", 10, 30);
        } else {
            if (ready) {
                calc(ammount);
            }
            if (coins == 0) {
                remove(submit);
                remove(input);
                if (win) {
                    g.drawString("congrats you won", 50, 50);
                } else {
                    g.drawString("you lost", 50, 50);
                }
            } else {
                g.drawString("" + coins, 10, 10);
                int counterwhile = 0;
                int x = 50;
                int y = 50;
                while (counterwhile < coins) {
                    g.drawOval(x, y, 20, 20);
                    if (counterwhile % 6 == 0 && counterwhile != 0) {
                        x = 50;
                        y += 40;
                    } else {
                        x += 40;
                    }
                    counterwhile++;
                }
            }
        }
    }
    private int calc(int ammount) {
        coins -= ammount;
        if (coins == 0) {
            win = false;
        } else {
            if (coins <= moves[counter]) {
                counter++;
            }
            ammount = coins - moves[counter];
            if (ammount > 3) {
                ammount = 1;
                //or you can of course use math random but I just use 1 instead
            }
            coins -= ammount;
        }
        return coins;
    }
    class text implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input.getText();
            ammount = Integer.parseInt(s);
            if (ammount > 3 || ammount < 0) {
                error = true;
            } else {
                error = false;
                ready = true;
            }
            input.setText("");
            repaint();
        }
    }
    class button implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input.getText();
            ammount = Integer.parseInt(s);
            if (ammount > 3 || ammount < 0) {
                error = true;
            } else {
                ready = true;
                error = false;
            }
            input.setText("");
            repaint();
        }
    }
}