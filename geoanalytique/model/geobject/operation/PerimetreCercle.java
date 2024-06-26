package geoanalytique.model.geobject.operation;

import geoanalytique.model.Cercle;
import geoanalytique.util.Operation;
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
        if(num == 0) {
            this.cercle = (Cercle)o;
        }
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant.
     */
    @Override
    public Object getClassArgument(int num) {
        if(num == 0) {
            return this.cercle;
        } else {
            return null;
        }
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
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if(num == 0) {
            return "C'est un cercle";
        } else {
            return null;
        }
    }
}

