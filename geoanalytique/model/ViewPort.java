package geoanalytique.model;

/**
 * La classe ViewPort représente une zone de dessin virtuelle qui convertit les coordonnées réelles du repère mathématique en coordonnées d'affichage et vice versa.
 */
public class ViewPort {
    private double minX; // Valeur minimale sur l'axe des x du repère mathématique
    private double minY; // Valeur minimale sur l'axe des y du repère mathématique
    private double maxX; // Valeur maximale sur l'axe des x du repère mathématique
    private double maxY; // Valeur maximale sur l'axe des y du repère mathématique
    private int width; // Largeur de la vue graphique
    private int height; // Hauteur de la vue graphique

    /**
     * Constructeur de la classe ViewPort.
     * @param minX Valeur minimale sur l'axe des x du repère mathématique.
     * @param minY Valeur minimale sur l'axe des y du repère mathématique.
     * @param maxX Valeur maximale sur l'axe des x du repère mathématique.
     * @param maxY Valeur maximale sur l'axe des y du repère mathématique.
     * @param width Largeur de la vue graphique.
     * @param height Hauteur de la vue graphique.
     */
    public ViewPort(double minX, double minY, double maxX, double maxY, int width, int height) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.width = width;
        this.height = height;
    }

    /**
     * Convertit la coordonnée réelle x en coordonnée d'affichage.
     * @param x La coordonnée réelle x à convertir.
     * @return La coordonnée d'affichage correspondante.
     */
    public int convertX(double x) {
        return (int) ((x - minX) / (maxX - minX) * width);
    }

    /**
     * Convertit la coordonnée réelle y en coordonnée d'affichage.
     * @param y La coordonnée réelle y à convertir.
     * @return La coordonnée d'affichage correspondante.
     */
    public int convertY(double y) {
        return (int) ((maxY - y) / (maxY - minY) * height);
    }

    /**
     * Convertit la coordonnée d'affichage en coordonnée réelle x.
     * @param x La coordonnée d'affichage à convertir.
     * @return La coordonnée réelle x correspondante.
     */
    public double convertBackX(int x) {
        return minX + (x * (maxX - minX) / width);
    }

    /**
     * Convertit la coordonnée d'affichage en coordonnée réelle y.
     * @param y La coordonnée d'affichage à convertir.
     * @return La coordonnée réelle y correspondante.
     */
    public double convertBackY(int y) {
        return maxY - (y * (maxY - minY) / height);
    }
}
