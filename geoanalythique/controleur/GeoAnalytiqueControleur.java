package geoanalythique.controleur;

import java.awt.Graphics;

import geoanalythique.graphique.Graphique;
import geoanalythique.model.GeoObject;
import geoanalythique.model.Point;
import geoanalythique.util.Dessinateur;
import geoanalythique.view.GeoAnalytiqueView;

import java.awt.Color;

public class GeoAnalytiqueControleur {

    private static final int TICK_SIZE = 5; // Taille des marques de graduation
    private static final int TICK_LABEL_MARGIN = 5; // Marge pour les labels de graduation
    private static final int TICK_SPACING = 30; // Espacement entre les graduations

    public GeoAnalytiqueControleur(){};

    public void recalculPoints(int width, int height, Graphics g) {

        // Dessiner l'axe des X avec les graduations
        drawXAxis(g, width, height);

        // Dessiner l'axe des Y avec les graduations
        drawYAxis(g, width, height);

    }

    private void drawXAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);

        // Dessiner l'axe des X
        g.drawLine(0, height / 2, width, height / 2);

        // Dessiner les graduations de l'axe des X
        for (int x = TICK_SPACING; x < width; x += TICK_SPACING) {
            int value = (x - width / 2) / TICK_SPACING;
            if (value != 0) { // Exclure le zéro
                g.drawLine(x, height / 2 - TICK_SIZE / 2, x, height / 2 + TICK_SIZE / 2);
                g.drawString(Integer.toString(value), x - TICK_LABEL_MARGIN, height / 2 - TICK_LABEL_MARGIN);
            }
        }
    }

    private void drawYAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);

        // Dessiner l'axe des Y
        g.drawLine(width / 2, 0, width / 2, height);

        // Dessiner les graduations de l'axe des Y
        for (int y = TICK_SPACING; y < height; y += TICK_SPACING) {
            int value = (height / 2 - y) / TICK_SPACING;
            if (value != 0) { // Exclure le zéro
                g.drawLine(width / 2 - TICK_SIZE / 2, y, width / 2 + TICK_SIZE / 2, y);
                g.drawString(Integer.toString(value), width / 2 + TICK_LABEL_MARGIN, y + TICK_LABEL_MARGIN);
            }
        }
    }

    public void addObjet(Point objet) {
        // Créer une instance de la classe Dessinateur
        Dessinateur dessinateur = new Dessinateur();

        // Utiliser le visiteur pour convertir l'objet en un objet graphique
        Graphique g = objet.accept(dessinateur);

        //ajouter graphique

        GeoAnalytiqueView graphiques = new GeoAnalytiqueView();
        graphiques.ajouterGraphique(g);
    }
}