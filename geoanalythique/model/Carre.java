package geoanalythique.model;

/**
 * La classe Carre représente un carre dans un espace bidimensionnel.
 * Elle hérite de la classe Polygone.
 */
public class Carre extends Polygone {
    
    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;
    private double longueurCote;

    /**
     * Constructeur pour créer un carré à partir d'un sommet et de la longueur d'un côté.
     * Les autres sommets sont calculés en conséquence pour former un carré.
     * 
     * @param sommet1 Le premier sommet du carré.
     * @param longueurCote La longueur d'un côté du carré.
     */
    public Carre(Point sommet1, double longueurCote) {
        this.sommet1 = sommet1;
        this.sommet2 = new Point(longueurCote + sommet1.getX(), sommet1.getY());
        this.sommet3 = new Point(sommet1.getX(), longueurCote + sommet1.getY());
        this.sommet4 = new Point(longueurCote + sommet3.getX(), sommet3.getY());
        this.longueurCote = longueurCote;
    }

    /**
     * Obtenir le premier sommet du carré.
     * 
     * @return Le premier sommet du carré.
     */
    public Point getSommet1() {
        return sommet1;
    }

    /**
     * Obtenir le deuxième sommet du carré.
     * 
     * @return Le deuxième sommet du carré.
     */
    public Point getSommet2() {
        return sommet2;
    }

    /**
     * Obtenir le troisième sommet du carré.
     * 
     * @return Le troisième sommet du carré.
     */
    public Point getSommet3() {
        return sommet3;
    }

    /**
     * Obtenir le quatrième sommet du carré.
     * 
     * @return Le quatrième sommet du carré.
     */
    public Point getSommet4() {
        return sommet4;
    }

    /**
     * Obtenir la longueur du côté du carré.
     * 
     * @return La longueur du côté du carré.
     */
    public double getLongueurCote() {
        return longueurCote;
    }

    /**
     * Modifier la longueur du côté du carré.
     * 
     * @param longueurCote La nouvelle longueur du côté du carré.
     */
    public void setLongueurCote(double longueurCote) {
        this.longueurCote = longueurCote;
    }
}
