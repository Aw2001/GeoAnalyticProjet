package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * La classe Cercle représente un cercle dans un espace bidimensionnel.
 * Elle hérite de la classe Ellipse.
 */
public class Cercle extends Ellipse {

    private double rayon;
    /**
     * Constructeur de la classe Cercle.
     * @param centre Le centre du cercle.
     * @param rayon Le rayon du cercle.
     */
    public Cercle (Point centre, double rayon) {
        super(centre, rayon, rayon, 0); // Un cercle est une ellipse avec les mêmes longueurs de demi-axes et une inclinaison nulle
        this.rayon = rayon;
    }

    /**
     * Renvoie le rayon du cercle.
     * @return Le rayon du cercle.
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * Modifie le rayon du cercle.
     * @param rayon Le nouveau rayon du cercle.
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur le cercle.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur le cercle.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
     public <Graphique> Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return visitor.visitorCercle(this);
    }
}
