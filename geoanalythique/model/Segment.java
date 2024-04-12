package geoanalythique.model;

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
}
