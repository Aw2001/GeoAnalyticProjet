package geoanalythique.model.geobject.operation;

import geoanalythique.model.TriangleEquilateral;

/**
 * Classe PerimetreTriangleEquilateral qui implémente l'interface Operation.
 * Cette classe est utilisée pour calculer le périmètre d'un triangle équilatéral.
 */
public class PerimetreTriangleEquilateral implements Operation {

    /**
     * Le triangle équilatéral pour lequel le périmètre doit être calculé.
     */
    private TriangleEquilateral triangleEquilateral;

    /**
     * Constructeur de la classe.
     * @param triangleEquilateral Le triangle équilatéral pour lequel le périmètre doit être calculé.
     */
    public PerimetreTriangleEquilateral(TriangleEquilateral triangleEquilateral){
        this.triangleEquilateral = triangleEquilateral;
    }

    /**
     * @return Le titre de l'opération.
     */
    @Override
    public String getTitle() {
        return "Calculer le périmètre d'un triangle équilatéral";
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
            this.triangleEquilateral = (TriangleEquilateral) o;
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
            return this.triangleEquilateral;
        }
        return null;
    }

    /**
     * Calcule le périmètre du triangle équilatéral.
     * @return Le périmètre du triangle équilatéral.
     */
    @Override
    public Object calculer() {
        return 3 * triangleEquilateral.getLongueurCote(); // Calcul du périmètre
    }

    /**
     * @param num Le numéro de l'argument.
     * @return La description de l'argument à la position spécifiée.
     */
    @Override
    public String getDescriptionArgument(int num) {
        if (num == 0) {
            return "Triangle équilatéral pour lequel on doit calculer le périmètre";
        }
        return null;
    }
}