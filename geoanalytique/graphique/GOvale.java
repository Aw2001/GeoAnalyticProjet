package geoanalytique.graphique;

import java.awt.Graphics;
import java.awt.Graphics2D;

import geoanalytique.model.Point;
import geoanalytique.model.ViewPort;

/**
 * La classe GOvale représente un ovale graphique.
 */
public class GOvale extends Graphique {

    private Point point; // Point de référence
    private int width; // Largeur de l'ovale
    private int height; // Hauteur de l'ovale
    private double rotation; // Inclinaison
    private static final int TICK_SPACING = 30; // Espacement entre les graduations


    /**
     * Constructeur de la classe GOvale.
     * @param point Point de référence.
     * @param width Largeur de l'ovale.
     * @param height Hauteur de l'ovale.
     * @param rotation Inclinaison.
     */
    public GOvale(Point point, int width, int height, double rotation) {
        this.point = point;
        this.width = width * TICK_SPACING;
        this.height = height * TICK_SPACING;
        this.rotation = rotation;
    }

    /**
     * Méthode pour dessiner l'ovale.
     * @param g L'objet Graphics pour dessiner.
     */
    @Override
    public void paint(Graphics g) {
        //Convertir les coordonnées réelles en coordonnées d'affichage
        int x = new ViewPort(point.getX(), point.getY()).convertX();
        int y = new ViewPort(point.getY(), point.getY()).convertY();
        Graphics2D g2d = (Graphics2D) g;
        double rotationAngle = (Math.toRadians(rotation));
        g2d.rotate(rotationAngle, x+width/2 ,y+height/2);
        g2d.drawOval(x, y, width, height); // Dessiner l'ovale délimité par le rectangle spécifié
        // Réinitialiser la transformation
        g2d.rotate(-rotationAngle, x + width / 2, y + height / 2);
    
    }
}

