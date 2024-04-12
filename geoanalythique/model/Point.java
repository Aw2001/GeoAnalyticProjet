package geoanalythique.model;

/**
 * La classe Point représente un point dans un espace bidimensionnel.
 * Elle hérite de la classe GeoObject.
 */
public class Point extends GeoObject {

    private double x; // Coordonnée x du point
    private double y; // Coordonnée y du point

    /**
     * Constructeur de la classe Point.
     * @param abscisse La coordonnée x du point.
     * @param ordonnee La coordonnée y du point.
     */
    public Point(double abscisse, double ordonnee) {
        this.x = abscisse;
        this.y = ordonnee;
    }

    /**
     * Obtient la coordonnée x du point.
     * @return La coordonnée x du point.
     */
    public double getX() {
        return this.x;
    }

    /**
     * Définit la coordonnée x du point.
     * @param abscisse La coordonnée x à définir.
     */
    public void setX(double abscisse) {
        this.x = abscisse;
    }

    /**
     * Obtient la coordonnée y du point.
     * @return La coordonnée y du point.
     */
    public double getY() {
        return this.y;
    }

    /**
     * Définit la coordonnée y du point.
     * @param ordonnee La coordonnée y à définir.
     */
    public void setY(double ordonnee) {
        this.y = ordonnee;
    }
}
