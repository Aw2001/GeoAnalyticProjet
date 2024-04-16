package geoanalytique.model.geobject.operation;

import geoanalytique.model.Carre;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un carré.
 */
public class PerimetreCarre implements Operation {
    private Carre carre;

    /**
     * Constructeur de la classe PerimetreCarre.
     * @param carre Le carré pour lequel on souhaite calculer le périmètre.
     */
    public PerimetreCarre(Carre carre) {
        this.carre = carre;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer le périmètre du carré";
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
            this.carre = (Carre)o;
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
            return this.carre;
        } else {
            return null;
        }
    }

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le résultat de l'opération, c'est-à-dire le périmètre du carré.
     */
    @Override
    public Object calculer() {
        return 4 * carre.getLongueurCote(); // Le périmètre d'un carré est égal à 4 fois la longueur d'un côté
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro (dans ce cas, cette méthode n'est pas utilisée car le carré est fourni dans le constructeur).
     * @param num Le numéro de l'argument.
     * @return La description de l'argument (dans ce cas, non utilisée).
     */
    @Override
    public String getDescriptionArgument(int num) {
        if(num == 0) {
            return "C'est un carre";
        } else {
            return null;
        }
    }
}

