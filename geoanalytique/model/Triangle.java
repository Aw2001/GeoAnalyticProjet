package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * La classe Triangle représente un triangle dans un espace bidimensionnel.
 * Elle hérite de la classe Polygone.
 */
public class Triangle extends Polygone {

    private Point sommet1; // Premier sommet du triangle
    private Point sommet2; // Deuxième sommet du triangle
    private Point sommet3; // Troisième sommet du triangle

     /**
     * Constructeur de la classe Triangle.
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public Triangle (Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Obtient le premier sommet du triangle.
     * @return Le premier sommet du triangle.
     */
    public Point getSommet1 () {
        return this.sommet1;
    }

    /**
     * Définit le premier sommet du triangle.
     * @param sommet1 Le premier sommet du triangle à définir.
     */
    public void setSommet1 (Point sommet1) {
        this.sommet1 = sommet1;
    }

     /**
     * Obtient le deuxieme sommet du triangle.
     * @return Le deuxieme sommet du triangle.
     */
    public Point getSommet2 () {
        return this.sommet2;
    }

    /**
     * Définit le deuxieme sommet du triangle.
     * @param sommet2 Le deuxieme sommet du triangle à définir.
     */
    public void setSommet2 (Point sommet2) {
        this.sommet2 = sommet2;
    }

      /**
     * Obtient le troisieme sommet du triangle.
     * @return Le troisieme sommet du triangle.
     */
    public Point getSommet3 () {
        return this.sommet3;
    }

    /**
     * Définit le troisieme sommet du triangle.
     * @param sommet2 Le troisieme sommet du triangle à définir.
     */
    public void setSommet3 (Point sommet3) {
        this.sommet3 = sommet3;
    }

    /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur le triangle.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur le triangle.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
    public <Graphique> Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return  visitor.visitorTriangle(this);
    }
    
}
