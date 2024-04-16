package geoanalytique.model.geobject.operation;

import geoanalytique.model.Point;
import geoanalytique.model.Segment;
import geoanalytique.util.Operation;

public class MediatriceSegment implements Operation{

    private Segment segment;

    /**
     * Constructeur de la classe MediatriceSegment.
     * @param segment Le segment pour lequel on souhaite calculer la médiatrice.
     */
    public MediatriceSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer la médiatrice du segment";
    }

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis .
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
        if(num == 0) {
            this.segment = (Segment) o;
        }
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro 
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant.
     */
    @Override
    public Object getClassArgument(int num) {
        if(num == 0) {
            return this.segment;
        } else {
            return null;
        }
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * Dans ce cas, l'opération consiste à calculer la médiatrice du segment.
     * @return Le résultat de l'opération, c'est-à-dire la médiatrice du segment.
     */
    @Override
    public Segment calculer () {
        // Récupérer les points du segment
        Point point1 = segment.getPoint1();
        Point point2 = segment.getPoint2();

        // Calculer le milieu du segment
        MilieuPoint milieuCalculator = new MilieuPoint(point1, point2);
        Point milieu = (Point) milieuCalculator.calculer();

        // Calculer le vecteur directeur du segment
        double vecteurX = point2.getX() - point1.getX();
        double vecteurY = point2.getY() - point1.getY();

        // Calculer un vecteur normal à partir du vecteur directeur
        double vecteurNormalX = -vecteurY;
        double vecteurNormalY = vecteurX;

        // Créer deux points pour définir la médiatrice
        Point pointA = new Point(milieu.getX() + vecteurNormalX, milieu.getY() + vecteurNormalY);
        Point pointB = new Point(milieu.getX() - vecteurNormalX, milieu.getY() - vecteurNormalY);

        // Créer et retourner la médiatrice sous forme de segment
        return new Segment(pointA, pointB);
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro 
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "C'est un segment";
        } else {
            return null;
        }
    }
   
}
   