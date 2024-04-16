package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * La classe Segment représente un segment de droite dans un espace bidimensionnel.
 * Elle hérite de la classe Droite.
 */
public class Segment extends Droite {

    /**
     * Constructeur de la classe Segment.
     * @param point1 Le premier point du segment.
     * @param point2 Le deuxième point du segment.
     */
    public Segment (Point point1, Point point2) {
        super(point1, point2);
    }

     /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur le segment.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur le segment.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
    public <Graphique> Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return visitor.visitorSegment(this);
    }
}
