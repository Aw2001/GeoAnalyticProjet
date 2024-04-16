package geoanalytique.controleur;

import java.awt.Graphics;
import java.awt.Color;

/**
 * La classe GeoAnalytiqueControleur gère le dessin des axes et des graduations dans une zone de dessin.
 */
public class GeoAnalytiqueControleur {

    private static final int TICK_SIZE = 5; // Taille des marques de graduation
    private static final int TICK_LABEL_MARGIN = 5; // Marge pour les labels de graduation
    private static final int TICK_SPACING = 30; // Espacement entre les graduations
    private static final int AXIS_MARGIN = 50;

    public GeoAnalytiqueControleur(){};

    /**
     * Méthode pour recalculer et dessiner les axes et les graduations dans une zone de dessin.
     * @param width La largeur de la zone de dessin.
     * @param height La hauteur de la zone de dessin.
     * @param g Le contexte graphique dans lequel les dessins doivent être effectués.
     */
    public void recalculPoints(int width, int height, Graphics g) {

        // Dessiner l'axe des X avec les graduations
        drawXAxis(g, width, height);

        // Dessiner l'axe des Y avec les graduations
        drawYAxis(g, width, height);

    }

    /**
     * Dessine l'axe des abscisses (X) avec les graduations.
     * @param g Le contexte graphique dans lequel les dessins doivent être effectués.
     * @param width La largeur de la zone de dessin.
     * @param height La hauteur de la zone de dessin.
     */
    
     private void drawXAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);
    
        // Dessiner l'axe des X
        g.drawLine(AXIS_MARGIN, height / 2, width - AXIS_MARGIN, height / 2);
    
        // Dessiner les graduations de l'axe des X pour les valeurs positives
        int graduationValue = 1;
        for (int x = width / 2 + TICK_SPACING; x < width - AXIS_MARGIN; x += TICK_SPACING) {
            g.drawLine(x, height / 2 - TICK_SIZE / 2, x, height / 2 + TICK_SIZE / 2);
            g.drawString(Integer.toString(graduationValue), x - TICK_LABEL_MARGIN, height / 2 - TICK_LABEL_MARGIN);
            graduationValue++;
        }
    
        // Dessiner les graduations de l'axe des X pour les valeurs négatives
        graduationValue = -1;
        for (int x = width / 2 - TICK_SPACING; x > AXIS_MARGIN; x -= TICK_SPACING) {
            g.drawLine(x, height / 2 - TICK_SIZE / 2, x, height / 2 + TICK_SIZE / 2);
            g.drawString(Integer.toString(graduationValue), x - TICK_LABEL_MARGIN, height / 2 - TICK_LABEL_MARGIN);
            graduationValue--;
        }
    }
    
    /**
     * Dessine l'axe des ordonnées (Y) avec les graduations.
     * @param g Le contexte graphique dans lequel les dessins doivent être effectués.
     * @param width La largeur de la zone de dessin.
     * @param height La hauteur de la zone de dessin.
     */
    private void drawYAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);
    
        // Dessiner l'axe des Y
        g.drawLine(width / 2, AXIS_MARGIN, width / 2, height - AXIS_MARGIN);
    
        // Dessiner les graduations de l'axe des Y pour les valeurs positives
        int graduationValue = 1;
        for (int y = height / 2 - TICK_SPACING; y > AXIS_MARGIN; y -= TICK_SPACING) {
            g.drawLine(width / 2 - TICK_SIZE / 2, y, width / 2 + TICK_SIZE / 2, y);
            g.drawString(Integer.toString(graduationValue), width / 2 + TICK_LABEL_MARGIN, y + TICK_LABEL_MARGIN);
            graduationValue++;
        }
    
        // Dessiner les graduations de l'axe des Y pour les valeurs négatives
        graduationValue = -1;
        for (int y = height / 2 + TICK_SPACING; y < height - AXIS_MARGIN; y += TICK_SPACING) {
            g.drawLine(width / 2 - TICK_SIZE / 2, y, width / 2 + TICK_SIZE / 2, y);
            g.drawString(Integer.toString(graduationValue), width / 2 + TICK_LABEL_MARGIN, y + TICK_LABEL_MARGIN);
            graduationValue--;
        }
    }
}


