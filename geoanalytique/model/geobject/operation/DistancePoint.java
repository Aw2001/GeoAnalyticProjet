package geoanalytique.model.geobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;
/**
 * Cette classe représente une opération pour calculer la distance entre deux points dans un plan cartésien.
 */
public class DistancePoint implements Operation {
    
    private Point point1;
    private Point point2;

    /**
     * Constructeur de la classe DistancePoint.
     * @param point1 Le premier point.
     * @param point2 Le deuxième point.
     */
    public DistancePoint(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer la distance à un autre point";
    }

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis.
     */
    @Override
    public int getArity() {
        return 2;
    }

    /**
     * Définit un argument pour l'opération.
     * @param num Le numéro de l'argument.
     * @param o L'objet à définir comme argument .
     */
    @Override
    public void setArgument(int num, Object o) {
        if(num == 0) {
            this.point1 = (Point) o;
        } else {
            this.point2 = (Point) o;
        }
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro (dans ce cas, cette méthode n'est pas utilisée car les points sont fournis dans le constructeur).
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant (dans ce cas, non utilisée).
     */
    @Override
    public Object getClassArgument(int num) {
        if(num == 0) {
            return this.point1;
        } else if(num == 1) {
            return this.point2;
        } else {
            return null;
        }
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le résultat de l'opération, c'est-à-dire la distance entre les deux points.
     */
    @Override
    public Object calculer() {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro
     * @return La description de l'argument .
     */
    @Override
    public String getDescriptionArgument(int num) {
        if(num == 0) {
            return "premier point";
        } else if (num == 1) {
            return "second point";
        } else {
            return null;
        }
    }
}

