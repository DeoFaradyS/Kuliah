package Tugas1;


import java.awt.*;
import java.awt.geom.*;

import Controller.WindowCloser;

public class GeneralPathShape extends Frame {
    // Constructor
    GeneralPathShape() {
        addWindowListener(new WindowCloser());
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        BasicStroke bs = new BasicStroke(1.0f);
        g2d.setStroke(bs);

        GeneralPath gp = new GeneralPath();
        gp.moveTo(100, 50);
        gp.curveTo(150, 50, 150, 50, 150, 100);
        gp.curveTo(150, 150, 150, 150, 100, 150);
        gp.curveTo(50, 150, 50, 150, 50, 100);
        gp.curveTo(50, 50, 50, 50, 100, 50);

        g2d.draw(gp);

    }

    public static void main(String[] argv) {
        GeneralPathShape r = new GeneralPathShape();
        r.setTitle("Exercise 2.1");
        r.setSize(400, 400);
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }
}
