package Tugas;

import java.awt.*;

public class CoordinateSystem {

    public static void drawSimpleCoordinateSystem(int xmax, int ymax, Graphics2D g2d) {
        int xOffset = 20;
        int yOffset = 20;
        int step = 20;
        String s;

        // Gunakan font yang lebih kecil
        Font fo = g2d.getFont();
        g2d.setFont(new Font("sansserif", Font.PLAIN, 6));

        // Gambar sumbu x
        g2d.drawLine(xOffset, yOffset, xmax, yOffset);

        // Tanda dan label untuk sumbu x
        for (int i = xOffset + step; i <= xmax; i = i + step) {
            g2d.drawLine(i, yOffset - 2, i, yOffset + 2);
            g2d.drawString(String.valueOf(i), i - 7, yOffset - 7);
        }

        // Gambar sumbu y
        g2d.drawLine(xOffset, yOffset, xOffset, ymax);

        // Tanda dan label untuk sumbu y
        s = "  "; // Indentasi untuk angka < 100
        for (int i = yOffset + step; i <= ymax; i = i + step) {
            g2d.drawLine(xOffset - 2, i, xOffset + 2, i);
            if (i > 99) {
                s = "";
            }
            g2d.drawString(s + String.valueOf(i), xOffset - 25, i + 5);
        }

        // Gambar panah di ujung sumbu x
        g2d.drawLine(xmax - 5, yOffset - 5, xmax, yOffset);
        g2d.drawLine(xmax - 5, yOffset + 5, xmax, yOffset);

        // Gambar panah di ujung sumbu y
        g2d.drawLine(xOffset - 5, ymax - 5, xOffset, ymax);
        g2d.drawLine(xOffset + 5, ymax - 5, xOffset, ymax);

        // Reset font ke font awal
        g2d.setFont(fo);
    }
}

