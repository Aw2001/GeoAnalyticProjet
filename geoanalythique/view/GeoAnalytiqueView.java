package geoanalythique.view;

import java.util.List;

import geoanalythique.controleur.GeoAnalytiqueControleur;
import geoanalythique.graphique.Graphique;
import java.awt.*;
import javax.swing.*;
public class GeoAnalytiqueView extends JPanel{

    private List<Graphique> graphiques;
    private GeoAnalytiqueControleur controleur;

    public GeoAnalytiqueView() {
        this.controleur = new GeoAnalytiqueControleur();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Appeler la méthode recalculPoints du contrôleur pour dessiner les axes
        controleur.recalculPoints(getWidth(), getHeight(), g);
    }
    //ajouter graphique
    public void ajouterGraphique(Graphique graphique) {
        graphiques.add(graphique);
        repaint(); // Rafraîchir l'affichage pour prendre en compte le nouvel objet ajouté
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test de GeoAnalytiqueView");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        GeoAnalytiqueView geoView = new GeoAnalytiqueView();
        frame.add(geoView);

        frame.setVisible(true);
    }
    
}
