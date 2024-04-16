package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un triangle rectangle, un type de triangle où un angle est de 90 degrés.
 * Hérite de la classe Triangle.
 */
public class TriangleRectangle extends Triangle {

    private double hauteur; 
    private double base; 

    /**
     * Construit un objet TriangleRectangle avec le sommet donné, la hauteur et la base.
     * 
     * @param sommet1 Le sommet du triangle.
     * @param hauteur La hauteur du triangle.
     * @param base La longueur de la base du triangle.
     */
    public TriangleRectangle (Point sommet1, double hauteur, double base) {
        super(sommet1, 
        new Point(sommet1.getX() + base, sommet1.getY()),
        new Point(sommet1.getX(),sommet1.getY() + hauteur));
        this.hauteur = hauteur;
        this.base = base;
    }

    /**
     * Retourne la longueur de la base du triangle.
     * 
     * @return La longueur de la base du triangle.
     */
    public double getBase () {
        return this.base;
    }

    /**
     * Modifie la longueur de la base du triangle.
     * 
     * @param base La nouvelle longueur de la base du triangle.
     */
    public void setBase (double base) {
        this.base = base;
    }

    /**
     * Retourne la hauteur du triangle.
     * 
     * @return La hauteur du triangle.
     */
    public double getHauteur () {
        return this.hauteur;
    }

    /**
     * Modifie la hauteur du triangle.
     * 
     * @param hauteur La nouvelle hauteur du triangle.
     */
    public void setHauteur (double hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur le triangle rectangle.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur le triangle rectangle.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
    public <Graphique> Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return visitor.visitorTriangleRectangle(this);
    }
}