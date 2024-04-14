package geoanalythique.graphique;

import java.awt.Graphics;

import geoanalythique.model.Point;
import geoanalythique.model.ViewPort;

/**
 * La classe GCoordonnée représente une coordonnée graphique.
 */
public class GCoordonnee extends Graphique {
    
    private Point point; /** point à dessiner

    /**
     * Constructeur de la classe GCoordonnée.
     * @param x La coordonnée x.
     * @param y La coordonnée y.
     */
    public GCoordonnee(Point point) {
        this.point = point;
    }

    /**
     * Méthode pour dessiner la coordonnée.
     * @param g L'objet Graphics pour dessiner.
     */
    @Override
    public void paint(Graphics g) {
        //Convertir les coordonnées réelles en coordonnées d'affichage
        int x = new ViewPort(0, 0, 20, 20, 800, 600).convertX(point.getX());
        int y = new ViewPort(0, 0, 20, 20, 800, 600).convertY(point.getY());

        // Dessiner la coordonnée en utilisant l'objet Graphics
        g.fillOval(x, y, 5, 5); // Dessiner un petit cercle pour représenter la coordonnée
    }


}

