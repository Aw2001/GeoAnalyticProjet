package geoanalytique.gui;

import javax.swing.*;

import geoanalytique.view.GeoAnalytiqueView;

import java.awt.*;

public class GeoAnalytiqueGUI extends JFrame {
    private GeoAnalytiqueView geoView;

    public GeoAnalytiqueGUI() {
        setTitle("Application de dessins géométriques");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Création de la zone de dessin
        geoView = new GeoAnalytiqueView();
        add(geoView, BorderLayout.CENTER);

        // Création de la barre d'outils
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false); // Empêcher la barre d'outils d'être déplaçable

        // Boutons pour les différents objets géométriques
        JButton circleButton = new JButton("Cercle");
        JButton squareButton = new JButton("Carré");
        JButton triangleButton = new JButton("Triangle");
        // Ajouter d'autres boutons pour les différents objets géométriques

        // Menu déroulant pour les opérations possibles pour chaque objet géométrique
        JPopupMenu circleMenu = new JPopupMenu();
        circleMenu.add(new JMenuItem("Déplacer"));
        circleMenu.add(new JMenuItem("Modifier rayon"));
        // Ajouter d'autres options pour le cercle

        circleButton.setComponentPopupMenu(circleMenu);

        JPopupMenu squareMenu = new JPopupMenu();
        squareMenu.add(new JMenuItem("Déplacer"));
        squareMenu.add(new JMenuItem("Modifier côté"));
        // Ajouter d'autres options pour le carré

        squareButton.setComponentPopupMenu(squareMenu);

        // Ajouter les boutons à la barre d'outils
        toolBar.add(circleButton);
        toolBar.add(squareButton);
        toolBar.add(triangleButton);
        // Ajouter d'autres boutons pour les différents objets géométriques

        // Ajouter un séparateur
        toolBar.addSeparator();

        // Menu déroulant pour les options supplémentaires
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Fichier");
        fileMenu.add(new JMenuItem("Nouveau"));
        fileMenu.add(new JMenuItem("Ouvrir"));
        fileMenu.add(new JMenuItem("Enregistrer"));
        // Ajouter d'autres options pour le menu "Fichier"

        JMenu editMenu = new JMenu("Édition");
        editMenu.add(new JMenuItem("Annuler"));
        editMenu.add(new JMenuItem("Rétablir"));
        // Ajouter d'autres options pour le menu "Édition"

        JMenu viewMenu = new JMenu("Affichage");
        viewMenu.add(new JMenuItem("Zoom avant"));
        viewMenu.add(new JMenuItem("Zoom arrière"));
        // Ajouter d'autres options pour le menu "Affichage"

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        toolBar.add(Box.createHorizontalGlue()); // Pour aligner le menu déroulant à droite
        toolBar.add(menuBar);

        // Ajouter la barre d'outils à la fenêtre principale
        add(toolBar, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GeoAnalytiqueGUI();
        });
    }
}
