import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class Heart extends Frame {
    Heart() {
        addWindowListener(new WindowCloser());
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Generating an ellipse from the rectangle.
        // This ellipse is used to construct the initial and the final ellipse.
        Ellipse2D.Double elli = new Ellipse2D.Double(20, 40, 50, 20);
        g2d.draw(elli); // Draws the first ellipse
    }

    public static void main(String[] args) {
        Heart h = new Heart();
        h.setTitle("Heart");
        h.setSize(400,400);
        h.setLocationRelativeTo(null);
        h.setVisible(true);
    }

}
