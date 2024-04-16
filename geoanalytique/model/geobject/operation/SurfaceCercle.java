package geoanalytique.model.geobject.operation;

import geoanalytique.model.Cercle;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer la surface intérieure d'un cercle.
 */
public class SurfaceCercle implements Operation {
    private Cercle cercle;

    /**
     * Constructeur de la classe SurfaceCercle.
     * @param cercle Le cercle pour lequel on souhaite calculer la surface.
     */
    public SurfaceCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer la surface du cercle";
    }

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis (dans ce cas, aucun, car le cercle est fourni dans le constructeur).
     */
    @Override
    public int getArity() {
        return 0;
    }

    /**
     * Définit un argument pour l'opération (dans ce cas, cette méthode n'est pas utilisée car le cercle est fourni dans le constructeur).
     * @param num Le numéro de l'argument.
     * @param o L'objet à définir comme argument (dans ce cas, non utilisé).
     */
    @Override
    public void setArgument(int num, Object o) {
        // Cette méthode n'est pas utilisée car le cercle est fourni dans le constructeur
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro (dans ce cas, cette méthode n'est pas utilisée car le cercle est fourni dans le constructeur).
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant (dans ce cas, non utilisée).
     */
    @Override
    public Object getClassArgument(int num) {
        return null; // Cette méthode n'est pas utilisée car le cercle est fourni dans le constructeur
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le résultat de l'opération, c'est-à-dire la surface du cercle.
     */
    @Override
    public Object calculer() {
        return Math.PI * cercle.getRayon() * cercle.getRayon(); // La surface d'un cercle est égale à pi * le rayon au carré
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro (dans ce cas, cette méthode n'est pas utilisée car le cercle est fourni dans le constructeur).
     * @param num Le numéro de l'argument.
     * @return La description de l'argument (dans ce cas, non utilisée).
     */
    @Override
    public String getDescriptionArgument(int num) {
        return null; // Cette méthode n'est pas utilisée car le cercle est fourni dans le constructeur
    }
}

