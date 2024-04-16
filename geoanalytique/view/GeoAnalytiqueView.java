package geoanalytique.view;

import java.util.List;
import java.awt.*;
import javax.swing.*;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.graphique.Graphique;

public class GeoAnalytiqueView extends JPanel{

    private List<Graphique> graphiques;
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
    
     //ajouter graphique
     public void ajouterGraphique(Graphique graphique) {
        graphiques.add(graphique);
        repaint(); // Rafraîchir l'affichage pour prendre en compte le nouvel objet ajouté
    }
}
