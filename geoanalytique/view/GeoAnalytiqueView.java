package geoanalytique.view;

import javax.swing.*;
import java.awt.*;
import geoanalytique.controleur.GeoAnalytiqueControleur;

public class GeoAnalytiqueView extends JPanel {
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

}
