package geoanalythique.model;

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
        super(centre, rayon, rayon, 0); // Appel du constructeur de la classe Ellipse en fixant l'inclinaison à 0
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
}
