package geoanalytique.graphique;

import java.awt.Graphics;

import geoanalytique.model.Point;
import geoanalytique.model.ViewPort;

/**
 * La classe GLine représente une ligne graphique.
 */
public class GLine extends Graphique{
    
    private Point point1; // Point de départ de la ligne
    private Point point2; // Point de d'arrivée de la ligne

    /**
     * Constructeur de la classe GLine.
     * @param point1 Le premier point à représenter.
     * @param point2 Le second point à représenter.
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
        
        // Convertir les coordonnées réelles en coordonnées d'affichage
        int x1 = new ViewPort(point1.getX(), point1.getY()).convertX();
        int y1 = new ViewPort(point1.getX(), point1.getY()).convertY();
        int x2 = new ViewPort(point2.getX(), point2.getY()).convertX();
        int y2 = new ViewPort(point2.getX(), point2.getY()).convertY();
    
        g.drawLine(x1, y1, x2, y2);
    
       
    }
}
