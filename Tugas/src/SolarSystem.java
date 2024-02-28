package Tugas;


import java.awt.*;
import java.awt.geom.*;

public class SolarSystem extends Frame {
    SolarSystem() {
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
        SolarSystem s = new SolarSystem();
        s.setTitle("Exercise 2.2");
        s.setSize(400, 400);
        s.setLocation(0, 0);
        s.setVisible(true);
    }
}
