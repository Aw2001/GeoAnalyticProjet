package geoanalytique.graphique;

import java.awt.Graphics;

import geoanalytique.model.Point;
import geoanalytique.model.ViewPort;

/**
 * La classe GLineDroite représente une ligne droite graphique.
 */
public class GLineDroite extends Graphique {

    private Point point1; // Premier point à représenter
    private Point point2; // Deuxieme point à représenter

    /**
     * Constructeur de la classe GLineDroite.
     * @param point1 Premier point à représenter.
     * @param point2 Deuxieme point à représenter.
     */
    public GLineDroite(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Méthode pour dessiner la ligne droite.
     * @param g L'objet Graphics pour dessiner.
     */
    @Override
    public void paint(Graphics g) {
        //calcul pente
        double m = (point2.getY() - point1.getY()) /  (point2.getX() - point1.getX()); // Convertir les coordonnées réelles en coordonnées d'affichage
        int x1 = new ViewPort(point1.getX(), point1.getY()).convertX();
        int y1 = new ViewPort(point1.getX(), point1.getY()).convertY();
        int x2 = new ViewPort(point2.getX(), point2.getY()).convertX();
        int y2 = new ViewPort(point2.getX(), point2.getY()).convertY();
    
        // Déterminer les dimensions du composant
        int width = 1920;
        int height = 950;
    
        // Prolonger la ligne aux bords du composant graphique
        if (x1 == x2) { // La ligne est verticale

            y1 = 0;
            y2 = height;
            // Dessiner la ligne prolongée
            g.drawLine(x1, y1, x2, y2);

        } else if (y1 == y2) { // La ligne est horizontale

            x1 = 0;
            x2 = width;
            // Dessiner la ligne prolongée
            g.drawLine(x1, y1, x2, y2);

        } else { // La ligne est diagonale

            // Calcul des coordonnées des points de début et de fin de la droite oblique
            int newX1 = 0;
            int newY1 = (int) (m * (newX1 - x1) + y1);

            int newX2 = width;
            int newY2 = (int) (m * (newX2 - x1) + y1);

           // Vérification et ajustement des coordonnées si elles dépassent les limites du composant
            if (newY1 < 0 || newY1 > height) {
                newY1 = (newY1 < 0) ? 0 : height;
                newX1 = (int) ((newY1 - y1) / m) + x1;
            }

            if (newY2 < 0 || newY2 > height) {
                newY2 = (newY2 < 0) ? 0 : height;
                newX2 = (int) ((newY2 - y1) / m) + x1;
            }

            // Dessiner la droite oblique avec les nouvelles coordonnées calculées
            g.drawLine(newX1, newY1, newX2, newY2);

        }
    
       
    }
    
}
