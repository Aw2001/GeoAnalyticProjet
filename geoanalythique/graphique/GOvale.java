package geoanalythique.graphique;

import java.awt.Graphics;

import geoanalythique.model.Point;
import geoanalythique.model.ViewPort;

/**
 * La classe GOvale représente un ovale graphique.
 */
public class GOvale extends Graphique {

    private Point point; // Point de référence
    private int width; // Largeur de l'ovale
    private int height; // Hauteur de l'ovale

    /**
     * Constructeur de la classe GOvale.
     * @param point Point de référence.
     * @param width Largeur de l'ovale.
     * @param height Hauteur de l'ovale.
     */
    public GOvale(Point point, int width, int height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    /**
     * Méthode pour dessiner l'ovale.
     * @param g L'objet Graphics pour dessiner.
     */
    @Override
    public void paint(Graphics g) {
        //Convertir les coordonnées réelles en coordonnées d'affichage
        int x = new ViewPort(0, 0, 20, 20, 800, 600).convertX(point.getX());
        int y = new ViewPort(0, 0, 20, 20, 800, 600).convertY(point.getY());
        g.drawOval(x, y, width, height); // Dessiner l'ovale délimité par le rectangle spécifié
    }
}

