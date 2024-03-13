package Tugas2;

import java.awt.*;
import java.awt.geom.*;
import Controller.WindowCloser;

/**
 * Use of GeneralPath to draw a dashed car.
 *
 * @author Deo Farady Santoso
 *         Last change 14.03.2024
 */
public class GeneralPathCarDashed extends Frame {
    GeneralPathCarDashed() {
        addWindowListener(new WindowCloser());
    }

    /**
     * Method untuk menggambar mobil dengan garis dashing menggunakan Java Swing.
     *
     * @param g Grafik yang akan digunakan untuk menggambar.
     */
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Penggunaan antialiasing untuk memiliki garis yang lebih bagus.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // array untuk deskripsi pola dasbor.
        float[] dashPattern;
        // Offset di mana pola dasbor harus dimulai.
        float dashPhase = 0.0f;

        // Menginisialisasi array of float dengan panjang 2
        dashPattern = new float[2];

        // Menetapkan panjang garis panjang menjadi 20
        dashPattern[0] = 20;
        dashPattern[1] = 10;

        // Gunakan pola dasbor yang sama seperti sebelumnya, tetapi dengan
        // offset 10
        dashPhase = 10.0f;

        // Garis harus memiliki ketebalan 3.0
        BasicStroke bsDashed = new BasicStroke(3.0f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL, 2.0f,
                dashPattern, dashPhase);
        g2d.setStroke(bsDashed);

        // Generalpath untuk mendefinisikan GeneralPath.
        GeneralPath gp = new GeneralPath();

        // Mulailah di bagian depan bawah mobil.
        gp.moveTo(60, 120);
        // bagian bawah bodi
        gp.lineTo(80, 120);
        // roda depan
        gp.quadTo(90, 140, 100, 120);
        // bawah bodi tengah
        gp.lineTo(160, 120);
        // rear wheel
        gp.quadTo(170, 140, 180, 120);
        // rear underbody
        gp.lineTo(200, 120);
        // rear
        gp.curveTo(195, 100, 200, 80, 160, 80);
        // roof
        gp.lineTo(110, 80);
        // windscreen
        gp.lineTo(90, 100);
        // bonnet
        gp.lineTo(60, 100);
        // front
        gp.lineTo(60, 120);

        // Gambarlah mobil.
        g2d.draw(gp);

        g2d.setStroke(new BasicStroke(1.0f));
    }

    public static void main(String[] argv) {
        GeneralPathCarDashed s = new GeneralPathCarDashed();
        s.setTitle("Exercise 2.6");
        s.setSize(400, 400);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
    }
}
