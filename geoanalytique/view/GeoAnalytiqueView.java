package geoanalytique.view;

import java.util.List;
import java.awt.*;
import javax.swing.*;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.graphique.Graphique;

/**
 * La classe GeoAnalytiqueView représente la vue de l'application de géo-analytique.
 * Elle est responsable de l'affichage des graphiques sur la zone de dessin.
 */
public class GeoAnalytiqueView extends JPanel{

    private List<Graphique> graphiques; //Liste d'objets graphiques
    private GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(graphiques);

     /**
     * Constructeur par défaut de GeoAnalytiqueView.
     * Initialise le contrôleur pour gérer le dessin des axes.
     * 
     * @param graphiques La liste des graphiques à afficher.
     */
    public GeoAnalytiqueView(List<Graphique> graphiques) {
        
        this.graphiques = graphiques;
    }

    /**
     * Méthode appelée automatiquement pour dessiner les composants de la zone de dessin.
     * Appelle la méthode recalculPoints du contrôleur pour dessiner les axes.
     * @param g Le contexte graphique dans lequel les dessins doivent être effectués.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println(graphiques);
        for(Graphique graph : graphiques){
            graph.paint(g);
        }
        controleur.recalculPoints(getWidth(), getHeight(), g);
    }
    
     /**
     * Ajoute un graphique à la liste des graphiques à afficher.
     * 
     * @param graphique Le graphique à ajouter.
     */
     public void ajouterGraphique(Graphique graphique) {
        graphiques.add(graphique);
        
    }
    /**
     * Obtient la liste des graphiques à afficher.
     * 
     * @return La liste des graphiques à afficher.
     */
    public List<Graphique> getGraphiques () {
        return graphiques;
    }
}
