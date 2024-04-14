package geoanalythique.model.geobject.operation;

import geoanalythique.model.Point;
import geoanalythique.util.Operation;

/**
 * Cette classe représente une opération pour déplacer un point dans un plan cartésien.
 */
public class DeplacerPoint implements Operation {
    private Point point;
    private int new_x;
    private int new_y;

    /**
     * Constructeur de la classe DeplacerPoint.
     * @param point Le point à déplacer.
     * @param new_x La nouvelle coordonnée x du point.
     * @param new_y La nouvelle coordonnée y du point.
     */
    public DeplacerPoint(Point point, int new_x, int new_y) {
        this.point = point;
        this.new_x = new_x;
        this.new_y = new_y;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Déplacer le point";
    }

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis.
     */
    @Override
    public int getArity() {
        return 3; // On a besoin de trois arguments : le point à déplacer, la nouvelle coordonnée x, la nouvelle coordonnée y
    }

    /**
     * Définit un argument pour l'opération.
     * @param num Le numéro de l'argument.
     * @param o L'objet à définir comme argument.
     */
    @Override
    public void setArgument(int num, Object o) {
        if (num == 0) {
            this.point = (Point) o;
        } else if (num == 1) {
            this.new_x = (int) o;
        } else if (num == 2) {
            this.new_y = (int) o;
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
            return Point.class; // Le premier argument est de type Point
        } else {
            return Integer.class; // Les deux autres arguments sont de type int
        }
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le résultat de l'opération (null dans ce cas, car aucune valeur de retour n'est prévue).
     */
    @Override
    public Object calculer() {
        this.point.setX(this.new_x);
        this.point.setY(this.new_y);
        return null; // On ne renvoie rien, car l'opération de déplacement ne retourne pas de résultat
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "Point à déplacer";
        } else if (num == 1) {
            return "Nouvelle coordonnée x";
        } else if (num == 2) {
            return "Nouvelle coordonnée y";
        } else {
            return ""; // On peut retourner une chaîne vide si le numéro d'argument n'est pas reconnu
        }
    }
}

