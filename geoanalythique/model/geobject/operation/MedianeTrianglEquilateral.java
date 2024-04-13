package geoanalythique.model.geobject.operation;

import geoanalythique.model.Point;
import geoanalythique.model.Segment;
import geoanalythique.model.TriangleEquilateral;
import geoanalythique.util.Operation;

/**
 * La classe MedianeTrianglEquilateral implémente l'opération de calcul des médianes d'un triangle équilatéral.
 */
public class MedianeTrianglEquilateral implements Operation {

    private TriangleEquilateral triangleEquilateral; // Le triangle équilatéral pour lequel on calcule les médianes

    /**
     * Constructeur de la classe MedianeTrianglEquilateral.
     * @param triangleEquilateral Le triangle équilatéral pour lequel on calcule les médianes.
     */
    public MedianeTrianglEquilateral(TriangleEquilateral triangleEquilateral) {
        this.triangleEquilateral = triangleEquilateral;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer les médianes d'un triangle équilatéral";
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
            this.triangleEquilateral = (TriangleEquilateral) o;
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
            return this.triangleEquilateral;
        }
        return null;
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Les médianes du triangle équilatéral.
     */
    @Override
    public Segment[] calculer() {
        // Récupérer les sommets du triangle
        Point sommet1 = triangleEquilateral.getSommet1();
        Point sommet2 = triangleEquilateral.getSommet2();
        Point sommet3 = triangleEquilateral.getSommet3();

        // Calculer les milieux des côtés opposés
        Point milieu12 = new Point((sommet1.getX() + sommet2.getX()) / 2, (sommet1.getY() + sommet2.getY()) / 2);
        Point milieu23 = new Point((sommet2.getX() + sommet3.getX()) / 2, (sommet2.getY() + sommet3.getY()) / 2);
        Point milieu31 = new Point((sommet3.getX() + sommet1.getX()) / 2, (sommet3.getY() + sommet1.getY()) / 2);

        // Créer les médianes
        Segment mediane1 = new Segment(sommet1, milieu23);
        Segment mediane2 = new Segment(sommet2, milieu31);
        Segment mediane3 = new Segment(sommet3, milieu12);

        // Retourner les médianes
        return new Segment[] {mediane1, mediane2, mediane3};
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "Triangle équilatéral pour lequel on doit calculer les médianes";
        }
        return null;
    }
}
