package Tugas1;
import java.awt.*;
import java.awt.geom.*;

import Controller.WindowCloser;

public class LetterD extends Frame {
    LetterD() {
        addWindowListener(new WindowCloser());
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        BasicStroke bs = new BasicStroke(1.0f);
        g2d.setStroke(bs);

        QuadCurve2D.Double d1 = new QuadCurve2D.Double(50, 50, 150, 50, 150, 125);
        QuadCurve2D.Double d2 = new QuadCurve2D.Double(150, 125, 150, 200, 50, 200);
        Line2D.Double d3 = new Line2D.Double(50,50,50,200);
    
        g2d.draw(d1);
        g2d.draw(d2);
        g2d.draw(d3);

    }

    public static void main(String[] argv) {
        LetterD s = new LetterD();
        s.setTitle("Exercise 2.6");
        s.setSize(400, 400);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }
}