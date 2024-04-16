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
     * @return Le résultat de l'opération, c'est-à-dire la surface du cercle.
     */
    @Override
    public Object calculer() {
        return Math.PI * cercle.getRayon() * cercle.getRayon(); // La surface d'un cercle est égale à pi * le rayon au carré
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument (dans ce cas, non utilisée).
     */
    @Override
    public String getDescriptionArgument(int num) {
        if(num == 0) {
            return "Un objet Cercle.";
        } else {
            return null;
        }
    }
}

