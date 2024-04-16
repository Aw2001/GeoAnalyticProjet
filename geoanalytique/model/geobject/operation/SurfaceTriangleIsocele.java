package geoanalytique.model.geobject.operation;

import geoanalytique.model.TriangleIsocele;
import geoanalytique.util.Operation;

/**
 * Classe SurfaceTriangleIsocele qui implémente l'interface Operation.
 * Cette classe est utilisée pour calculer la surface d'un triangle isocèle.
 */
public class SurfaceTriangleIsocele implements Operation {

    /**
     * Le triangle isocèle pour lequel la surface doit être calculée.
     */
    private TriangleIsocele triangleIsocele;

    /**
     * Constructeur de la classe.
     * @param triangleIsocele Le triangle isocèle pour lequel la surface doit être calculée.
     */
    public SurfaceTriangleIsocele(TriangleIsocele triangleIsocele){
        this.triangleIsocele = triangleIsocele;
    }

    /**
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer la surface d'un triangle isocèle";
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
            this.triangleIsocele = (TriangleIsocele) o;
        }
    }

    /**
     * @param num Le numéro de l'argument.
     * @return L'argument à la position spécifiée.
     */
    @Override
    public Object getClassArgument(int num) {
        if (num == 0) {
            return this.triangleIsocele;
        }
        return null;
    }

    /**
     * Calcule la surface du triangle isocèle.
     * @return La surface du triangle isocèle.
     */
    @Override
    public Object calculer() {
        double base = triangleIsocele.getBase();
        double hauteur = triangleIsocele.getHauteur();
        return 0.5 * base * hauteur; // Calcul de la surface
    }

    /**
     * @param num Le numéro de l'argument.
     * @return La description de l'argument à la position spécifiée.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "Le triangle isocèle pour lequel la surface doit être calculée.";
        }
        return null;
    }
}