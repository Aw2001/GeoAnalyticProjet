package geoanalythique.graphique;

import java.awt.Graphics;

/**
 * La classe abstraite Graphique est une classe de base pour les éléments graphiques.
 */
public abstract class Graphique {
    
    /**
     * Méthode abstraite pour dessiner l'élément graphique.
     * @param g L'objet Graphics pour dessiner.
     */
    public abstract void paint(Graphics g);
}
