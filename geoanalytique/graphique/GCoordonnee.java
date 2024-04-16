package geoanalytique.graphique;

import java.awt.Graphics;

import geoanalytique.model.Point;
import geoanalytique.model.ViewPort;

/**
 * La classe GCoordonnée représente une coordonnée graphique.
 */
public class GCoordonnee extends Graphique {
    
    private Point point; //point à dessiner

    /**
     * Constructeur de la classe GCoordonnée.
     * @param point Le point à représenter
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
        ViewPort  viewport1 = new ViewPort(point.getX(), point.getY());
        ViewPort  viewport2 = new ViewPort(point.getX(), point.getY());

        int x = viewport1.convertX();
        int y = viewport2.convertY();

        // Dessiner la coordonnée en utilisant l'objet Graphics
        g.fillOval(x, y, 10, 10); // Dessiner un petit cercle pour représenter la coordonnée
    }


}

