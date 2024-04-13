package geoanalythique.model.geobject.operation;

import geoanalythique.model.Ellipse;

/**
 * Classe SurfaceEllipse qui implémente l'interface Operation.
 * Cette classe est utilisée pour calculer la surface d'une ellipse.
 */
public class SurfaceEllipse implements Operation {
    
    /**
     * L'ellipse pour laquelle la surface doit être calculée.
     */
    private Ellipse ellipse;

    /**
     * Constructeur de la classe.
     * @param ellipse L'ellipse pour laquelle la surface doit être calculée.
     */
    public SurfaceEllipse(Ellipse ellipse){
        this.ellipse = ellipse;
    }

    /**
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer la surface de l'ellipse";
    }

    /**
     * @return Le nombre d'arguments que l'opération attend. Ici, c'est 1.
     */
    @Override
    public int getArity() {
        return 1;
    }

    /**
     * Définit l'argument pour l'opération.
     * @param num Le numéro de l'argument.
     * @param o L'objet à utiliser comme argument.
     */
    @Override
    public void setArgument(int num, Object o) {
        if (num == 0) {
            this.ellipse = (Ellipse) o;
        }
    }

    /**
     * Renvoie la référence de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return L'argument à la position spécifiée.
     */
    @Override
    public Object getClassArgument(int num) {
        if (num == 0) {
            return this.ellipse;
        }
        return null;
    }

    /**
     * Calcule la surface de l'ellipse.
     * @return La surface de l'ellipse.
     */
    @Override
    public Object calculer() {
        return Math.PI * ellipse.getdemiAxeX() * ellipse.getdemiAxeY(); // Calcul de la surface
    }

    /**
     * @param num Le numéro de l'argument.
     * @return La description de l'argument à la position spécifiée.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "Ellipse pour laquelle on doit calculer la surface";
        }
        return null;
    }
}