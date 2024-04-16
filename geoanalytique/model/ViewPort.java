package geoanalytique.model;

import java.util.ArrayList;


/**
 * La classe ViewPort représente une zone de dessin virtuelle qui convertit les coordonnées réelles du repère mathématique en coordonnées d'affichage et vice versa.
 */
public class ViewPort {
        private static final int TICK_SPACING = 30; // Espacement entre les graduations
        private double x; //Coordonnée réelle x
        private double y; //Coordonnée réelle y

    public ViewPort(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Convertit la coordonnée réelle x en coordonnée d'affichage.
     * @return La coordonnée d'affichage correspondante.
     */
    public int convertX() {
        return (int) ((1920/2) + (this.x * TICK_SPACING));
    }

    /**
     * Convertit la coordonnée réelle y en coordonnée d'affichage.
     * @return La coordonnée d'affichage correspondante.
     */
    public int convertY() {
        return (int) ((950/2) - (this.y * TICK_SPACING));
    }

    /**
     * Convertit la coordonnée d'affichage en coordonnée réelle x.
     * @return La coordonnée réelle x correspondante.
     */
    

    /**
     * Convertit la coordonnée d'affichage en coordonnée réelle y.
     * @return La coordonnée réelle y correspondante.
     */
   
}
