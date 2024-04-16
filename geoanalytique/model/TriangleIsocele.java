package geoanalytique.model;

/**
 * Représente un triangle isocèle, un type de triangle où deux côtés sont de longueur égale.
 * Hérite de la classe Triangle.
 */
public class TriangleIsocele extends Triangle {

    private double base;
    private double hauteur;

    /**
     * Construit un objet TriangleIsocele avec le sommet donné, la base et la hauteur.
     * 
     * @param sommet1 Le sommet du triangle.
     * @param base La longueur de la base du triangle.
     * @param hauteur La hauteur du triangle.
     */
    public TriangleIsocele (Point sommet1, double base, double hauteur) {
        super(sommet1, 
        new Point(sommet1.getX() + base, sommet1.getY()),
        new Point(sommet1.getX() + (base/2),sommet1.getY() + hauteur));
        this.base = base;
        this.hauteur = hauteur;
    }

    /**
     * Retourne la longueur de la base du triangle.
     * 
     * @return La longueur de la base du triangle.
     */
    public double getBase () {
        return this.base;
    }

    /**
     * Modifie la longueur de la base du triangle.
     * 
     * @param base La nouvelle longueur de la base du triangle.
     */
    public void setBase (double base) {
        this.base = base;
    }

    /**
     * Retourne la hauteur du triangle.
     * 
     * @return La hauteur du triangle.
     */
    public double getHauteur () {
        return this.hauteur;
    }

    /**
     * Modifie la hauteur du triangle.
     * 
     * @param hauteur La nouvelle hauteur du triangle.
     */
    public void setHauteur (double hauteur) {
        this.hauteur = hauteur;
    }
}