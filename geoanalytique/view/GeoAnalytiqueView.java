package geoanalytique.view;

import javax.swing.*;
import geoanalytique.graphique.Graphique;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GeoAnalytiqueView extends JPanel {
    private List<Graphique> graphiques;

    public GeoAnalytiqueView() {
        graphiques = new ArrayList<>();
    }

    public void ajouterGraphique(Graphique graphique) {
        graphiques.add(graphique);
        repaint(); // Actualiser l'affichage
    }

    public void supprimerGraphique(Graphique graphique) {
        graphiques.remove(graphique);
        repaint(); // Actualiser l'affichage
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dessiner les graphiques
        for (Graphique graphique : graphiques) {
            graphique.paint(g);
        }
    }
}
