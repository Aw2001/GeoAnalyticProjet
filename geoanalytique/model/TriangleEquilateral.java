package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un triangle équilatéral, un type de triangle où tous les côtés sont de longueur égale.
 * Hérite de la classe Triangle.
 */

public class TriangleEquilateral extends Triangle {

    private double longueurCote; //longueur du côté

    /**
     * Construit un objet TriangleEquilateral avec le sommet donné et la longueur de côté.
     * @param sommet1 Un sommet du triangle.
     * @param longueurCote La longueur de chaque côté du triangle.
     */
    public TriangleEquilateral (Point sommet1, double longueurCote) {
        super(sommet1, 
        new Point(sommet1.getX() + longueurCote, sommet1.getY()),
        new Point(sommet1.getX() + (longueurCote/2),sommet1.getY() + (Math.sqrt(3)*longueurCote/2)));
        this.longueurCote = longueurCote;
    }

    /**
     * Retourne la longueur de chaque côté du triangle.
     * @return La longueur de chaque côté du triangle.
     */
    public double getLongueurCote () {
        return this.longueurCote;
    }

    /**
     * Définit la longueur de chaque côté du triangle.
     * @param longueurCote La longueur de chaque côté du triangle.
     */
    public void setLongueurCote (double longueurCote) {
        this.longueurCote = longueurCote;
    }
    
    /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur le triangle équilatéral.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur le triangle équilatéral.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
    public <Graphique> Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return visitor.visitorTriangleEquilateral(this);
    }
}
