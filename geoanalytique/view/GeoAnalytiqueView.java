package geoanalytique.view;

import javax.swing.*;
import java.awt.*;
import geoanalytique.controleur.GeoAnalytiqueControleur;

/**
 * La classe GeoAnalytiqueView représente une zone de dessin pour afficher les objets géométriques.
 * Cette classe étend le composant javax.swing.JPanel.
 */
public class GeoAnalytiqueView extends JPanel {
    private GeoAnalytiqueControleur controleur;

    /**
     * Constructeur par défaut de GeoAnalytiqueView.
     * Initialise le contrôleur pour gérer le dessin des axes.
     */
    public GeoAnalytiqueView() {
        this.controleur = new GeoAnalytiqueControleur();
    }

    /**
     * Méthode appelée automatiquement pour dessiner les composants de la zone de dessin.
     * Appelle la méthode recalculPoints du contrôleur pour dessiner les axes.
     * @param g Le contexte graphique dans lequel les dessins doivent être effectués.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        controleur.recalculPoints(getWidth(), getHeight(), g);
    }
}
