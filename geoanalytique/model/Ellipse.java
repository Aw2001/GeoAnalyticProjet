package geoanalytique.model;

import geoanalytique.graphique.Graphique;
import geoanalytique.util.GeoObjectVisitor;

/**
 * La classe Ellipse représente une ellipse dans un espace bidimensionnel.
 * Elle hérite de la classe Surface.
 */
public class Ellipse extends Surface {

    private Point centre; // Centre de l'ellipse
    private double demiAxeX; // Longueur du demi-axe x de l'ellipse
    private double demiAxeY; // Longueur du demi-axe y de l'ellipse
    private double inclinaison; // Inclinaison de l'ellipse en degrés (0 pour une ellipse parallèle au plan x)

    /**
     * Constructeur de la classe Ellipse.
     * @param centre Le centre de l'ellipse.
     * @param demiAxeX La longueur du demi-axe x de l'ellipse.
     * @param demiAxeY La longueur du demi-axe y de l'ellipse.
     * @param inclinaison L'inclinaison de l'ellipse en degrés (0 pour une ellipse parallèle au plan x).
     */
    public Ellipse (Point centre, double demiAxeX, double demiAxeY, double inclinaison) {
        this.centre = centre;
        this.demiAxeX = demiAxeX;
        this.demiAxeY = demiAxeY;
        this.inclinaison = inclinaison;
    }

    /**
     * Obtient le centre de l'ellipse.
     * @return Le centre de l'ellipse.
     */
    public Point getCentre () {
        return this.centre;
    }

    /**
     * Définit le centre de l'ellipse.
     * @param centre Le centre à définir.
     */
    public void setCentre (Point centre) {
        this.centre = centre;
    }

    /**
     * Obtient la longueur du demi-axe x de l'ellipse.
     * @return La longueur du demi-axe x de l'ellipse.
     */
    public double getdemiAxeX () {
        return this.demiAxeX;
    }

    /**
     * Définit la longueur du demi-axe x de l'ellipse.
     * @param demiAxeX La longueur du demi-axe x de l'ellipse à définir.
     */
    public void setdemiAxeX (double demiAxeX) {
        this.demiAxeX = demiAxeX;
    }
    
    /**
     * Obtient la longueur du demi-axe y de l'ellipse.
     * @return La longueur du demi-axe y de l'ellipse.
     */
    public double getdemiAxeY () {
        return this.demiAxeY;
    }

    /**
     * Définit la longueur du demi-axe y de l'ellipse.
     * @param demiAxeY la longueur du demi-axe y de l'ellipse à définir.
     */
    public void setdemiAxeY (double demiAxeY) {
        this.demiAxeY = demiAxeY;
    }

    /**
     * Obtient l'inclinaison de l'ellipse en degrés (0 pour une ellipse parallèle au plan x).
     * @return L'inclinaison de l'ellipse en degrés (0 pour une ellipse parallèle au plan x).
     */
    public double getInclinaison () {
        return this.inclinaison;
    }

    /**
     * Définit l'inclinaison de l'ellipse en degrés (0 pour une ellipse parallèle au plan x).
     * @param centre L'inclinaison de l'ellipse en degrés (0 pour une ellipse parallèle au plan x) à définir.
     */
    public void setInclinaison (double inclinaison) {
        this.inclinaison = inclinaison;
    }

    /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur l'ellipse.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur l'ellipse.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    @Override
     public <Graphique>Graphique accept (GeoObjectVisitor<Graphique> visitor) {
        return visitor.visitorEllipse(this);
    }
}
