package geoanalythique.model.geobject.operation;

import geoanalythique.model.Cercle;
import geoanalythique.util.Operation;
/**
 * Cette classe représente une opération pour calculer le périmètre d'un cercle.
 */
public class PerimetreCercle implements Operation {
    private Cercle cercle;

    /**
     * Constructeur de la classe PerimetreCercle.
     * @param cercle Le cercle pour lequel on souhaite calculer le périmètre.
     */
    public PerimetreCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer le périmètre du cercle";
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
     * @return Le résultat de l'opération, c'est-à-dire le périmètre du cercle.
     */
    @Override
    public Object calculer() {
        return 2 * Math.PI * cercle.getRayon(); // Le périmètre d'un cercle est égal à 2 * pi * le rayon
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

