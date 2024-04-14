package geoanalytique.util;

/**
 * L'interface Operation définit les opérations réalisables sur les objets géométriques.
 */
public interface Operation {
    
    /**
     * Renvoie le titre de l'opération.
     * @return Le titre de l'opération.
     */
    public String getTitle ();

    /**
     * Renvoie le nombre d'arguments requis par l'opération.
     * @return Le nombre d'arguments requis.
     */
    public int getArity ();

      /**
     * Définit un argument pour l'opération.
     * @param num Le numéro de l'argument.
     * @param o L'objet à définir comme argument.
     */
    public void setArgument (int num, Object o);

     /**
     * Renvoie la référence de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La référence de l'argument correspondant.
     */
    public Object getClassArgument (int num);

    /**
     * Exécute l'opération et renvoie son résultat.
     * @return Le résultat de l'opération.
     */
    public Object calculer ();

    /**
     * Renvoie la description de l'argument correspondant à un certain numéro.
     * @param num Le numéro de l'argument.
     * @return La description de l'argument.
     */
    public String getDescriptionArgument (int num);
}
