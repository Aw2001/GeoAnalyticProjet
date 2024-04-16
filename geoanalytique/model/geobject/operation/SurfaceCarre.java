package geoanalytique.model.geobject.operation;

import geoanalytique.model.Carre;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer la surface d'un carré.
 */
public class SurfaceCarre implements Operation {
    private Carre carre;

    /**
     * Constructeur de la classe SurfaceCarre.
     * @param carre Le carré pour lequel on souhaite calculer la surface.
     */
    public SurfaceCarre(Carre carre) {
        this.carre = carre;
    }

    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer la surface du carré";
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
            this.carre = (Carre) o;
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
     * @return Le résultat de l'opération, c'est-à-dire la surface du carré.
     */
    @Override
    public Object calculer() {
        return carre.getLongueurCote() * carre.getLongueurCote(); // La surface d'un carré est égale au carré de la longueur d'un côté
    }

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if(num == 0) {
            return ("C'est un carre");
        } else {
            return null;
        }
    }
}
