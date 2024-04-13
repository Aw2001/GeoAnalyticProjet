package geoanalythique.model.geobject.operation;

import geoanalythique.model.Cercle;
import geoanalythique.model.Point;
import geoanalythique.model.TriangleRectangle;

/**
 * La classe CCirconscriTriangleRect implémente l'opération de calcul du cercle circonscrit d'un triangle rectangle.
 */
public class CCirconscriTriangleRect implements Operation {

    private TriangleRectangle triangleRectangle; // Le triangle rectangle pour lequel on calcule le cercle circonscrit

    /**
     * Constructeur de la classe CCirconscriTriangleRect.
     * @param triangleRectangle Le triangle rectangle pour lequel on calcule le cercle circonscrit.
     */
    public CCirconscriTriangleRect(TriangleRectangle triangleRectangle) {
        this.triangleRectangle = triangleRectangle;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer le cercle circonscrit d'un triangle rectangle";
    }

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis.
     */
    @Override
    public int getArity() {
        return 1;
    }

    /**
     * Définit un argument pour l'opération.
     * @param num Le numéro de l'argument.
     * @param o L'objet à définir comme argument.
     */
    @Override
    public void setArgument(int num, Object o) {
        if (num == 0) {
            this.triangleRectangle = (TriangleRectangle) o;
        }
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant.
     */
    @Override
    public Object getClassArgument(int num) {
        if (num == 0) {
            return this.triangleRectangle;
        }
        return null;
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le cercle circonscrit du triangle rectangle.
     */
    @Override
    public Cercle calculer() {
        // Calculer la longueur de l'hypoténuse
        double hypotenuse = Math.sqrt(Math.pow(triangleRectangle.getBase(), 2) + Math.pow(triangleRectangle.getHauteur(), 2));

        // Calculer le centre du cercle
        Point sommet1 = triangleRectangle.getSommet1();
        Point sommet2 = triangleRectangle.getSommet2();
        double xCentre = (sommet1.getX() + sommet2.getX()) / 2;
        double yCentre = (sommet1.getY() + sommet2.getY()) / 2;
        Point centre = new Point(xCentre, yCentre);

        // Créer et retourner le cercle
        return new Cercle(centre, hypotenuse / 2);
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "Triangle rectangle pour lequel le cercle circonscrit doit être calculé.";
        }
        return null;
    }
}
