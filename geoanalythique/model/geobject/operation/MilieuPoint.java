package geoanalythique.model.geobject.operation;

import geoanalythique.model.Point;
import geoanalythique.util.Operation;
/**
 * Cette classe représente une opération pour calculer le milieu entre deux points dans un plan cartésien.
 */
public class MilieuPoint implements Operation {

    private Point point1;
    private Point point2;

    /**
     * Constructeur de la classe MilieuPoint.
     * @param point1 Le premier point.
     * @param point2 Le deuxième point.
     */
    public MilieuPoint(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer le milieu de deux points";
    }

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis (dans ce cas, aucun, car les points sont fournis dans le constructeur).
     */
    @Override
    public int getArity() {
        return 0;
    }

    /**
     * Définit un argument pour l'opération (dans ce cas, cette méthode n'est pas utilisée car les points sont fournis dans le constructeur).
     * @param num Le numéro de l'argument.
     * @param o L'objet à définir comme argument (dans ce cas, non utilisé).
     */
    @Override
    public void setArgument(int num, Object o) {
        // Cette méthode n'est pas utilisée car les points sont fournis dans le constructeur
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro (dans ce cas, cette méthode n'est pas utilisée car les points sont fournis dans le constructeur).
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant (dans ce cas, non utilisée).
     */
    @Override
    public Object getClassArgument(int num) {
        return null; // Cette méthode n'est pas utilisée car les points sont fournis dans le constructeur
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le résultat de l'opération, c'est-à-dire le point milieu entre les deux points.
     */
    @Override
    public Object calculer() {
        double x = (point1.getX() + point2.getX()) / 2;
        double y = (point1.getY() + point2.getY()) / 2;
        return new Point(x, y);
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro (dans ce cas, cette méthode n'est pas utilisée car les points sont fournis dans le constructeur).
     * @param num Le numéro de l'argument.
     * @return La description de l'argument (dans ce cas, non utilisée).
     */
    @Override
    public String getDescriptionArgument(int num) {
        return null; // Cette méthode n'est pas utilisée car les points sont fournis dans le constructeur
    }
}

