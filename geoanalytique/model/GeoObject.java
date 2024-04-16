package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * La classe GeoObject est une classe abstraite représentant un objet géométrique dans un espace géométrique.
 * Elle est conçue pour être utilisée comme classe de base pour d'autres types d'objets géométriques.
 */
public abstract class GeoObject{
     /**
     * Méthode accept() pour permettre la visite par un visiteur.
     * Cette méthode est implémentée par les sous-classes pour accepter un visiteur spécifique
     * et lui permettre d'effectuer des opérations sur l'objet géométrique.
     * 
     * @param <Graphique> Le type de résultat retourné par le visiteur.
     * @param visitor Le visiteur qui va effectuer des opérations sur l'objet géométrique.
     * @return Le résultat de l'opération effectuée par le visiteur.
     */
    public abstract <Graphique> Graphique accept(GeoObjectVisitor<Graphique> visitor); // méthode de visiteur
}
