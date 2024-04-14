
package geoanalythique.graphique;

import java.awt.Graphics;

import geoanalythique.model.Point;
import geoanalythique.model.ViewPort;

/**
 * La classe GTexte représente un texte graphique.
 */
public class GTexte extends Graphique {
    private String texte;
    private Point point;
   

    /**
     * Constructeur de la classe GTexte.
     * @param texte Le texte à afficher.
     * @param point Coordonnées du texte.
     */
    public GTexte(String texte, Point point) {
        this.texte = texte;
        this.point = point;
    }

    /**
     * Méthode pour dessiner le texte.
     * @param g L'objet Graphics pour dessiner.
     */
    @Override
    public void paint(Graphics g) {
        int x = new ViewPort(0, 0, 20, 20, 800, 600).convertX(point.getX());
        int y = new ViewPort(0, 0, 20, 20, 800, 600).convertY(point.getY());
        g.drawString(texte, x, y); // Dessiner le texte à la position spécifiée
    }
}
