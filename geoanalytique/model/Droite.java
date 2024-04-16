package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * La classe Droite représente une droite dans un espace bidimensionnel.
 * Elle hérite de la classe GeoObject.
 */
public class Droite extends GeoObject {
    
    private Point point1; // Premier point de la droite
    private Point point2; // Second point de la droite

    /**
     * Constructeur de la classe Droite.
     * @param point1 Le premier point de la droite.
     * @param point2 Le second point de la droite.
     */
    public Droite (Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Obtient le premier point de la droite.
     * @return Le premier point de la droite.
     */
    public Point getPoint1 () {
        return this.point1;
    }

    /**
     * Définit le premier point de la droite.
     * @param point1 Le premier point de la droite à définir.
     */
    public void setPoint1 (Point point1) {
        this.point1 = point1;
    }
     /**
     * Obtient le deuxieme point de la droite.
     * @return Le deuxieme point de la droite.
     */
    public Point getPoint2 () {
        return this.point2;
    }

    /**
     * Définit le deuxieme point de la droite.
     * @param point1 Le deuxieme point de la droite à définir.
     */
    public void setPoint2 (Point point2) {
        this.point2 = point2;
    }

    /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur la droite.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur la droite.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
    public <Graphique> Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return visitor.visitorDroite(this);
    }

}
