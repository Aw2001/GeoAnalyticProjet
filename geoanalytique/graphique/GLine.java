package geoanalytique.graphique;

import java.awt.Graphics;

import geoanalytique.model.Point;
import geoanalytique.model.ViewPort;

/**
 * La classe GLine représente une ligne graphique.
 */
public class GLine extends Graphique {

    private Point point1; // Point de départ de la ligne
    private Point point2; // Point de d'arrivée de la ligne

    /**
     * Constructeur de la classe GLine.
     * @param x1 Coordonnée x du point de départ de la ligne.
     * @param y1 Coordonnée y du point de départ de la ligne.
     * @param x2 Coordonnée x du point d'arrivée de la ligne.
     * @param y2 Coordonnée y du point d'arrivée de la ligne.
     */
    public GLine(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Méthode pour dessiner la ligne.
     * @param g L'objet Graphics pour dessiner.
     */
    @Override
    public void paint(Graphics g) {
        //Convertir les coordonnées réelles en coordonnées d'affichage
        int x1 = new ViewPort(0, 0, 20, 20, 800, 600).convertX(point1.getX());
        int y1 = new ViewPort(0, 0, 20, 20, 800, 600).convertY(point1.getY());
        int x2 = new ViewPort(0, 0, 20, 20, 800, 600).convertX(point2.getX());
        int y2 = new ViewPort(0, 0, 20, 20, 800, 600).convertY(point2.getY());
        g.drawLine(x1, y1, x2, y2); // Dessiner la ligne entre les points de départ et d'arrivée
    }
}
