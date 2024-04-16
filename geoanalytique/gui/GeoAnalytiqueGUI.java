package geoanalytique.gui;

import javax.swing.*;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.graphique.Graphique;
import geoanalytique.util.Dessinateur;
import geoanalytique.view.GeoAnalytiqueView;
import geoanalytique.model.Carre;
import geoanalytique.model.Cercle;
import geoanalytique.model.Droite;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Segment;
import geoanalytique.model.TriangleEquilateral;
import geoanalytique.model.TriangleIsocele;
import geoanalytique.model.TriangleRectangle;
import geoanalytique.model.Point;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe GeoAnalytiqueGUI représente l'interface graphique de l'application de dessin géométrique.
 */
public class GeoAnalytiqueGUI extends JFrame {
    List<Graphique> graphiques; //liste de graphiques
    private static final int TICK_SPACING = 30; // Espacement entre les graduations
    private GeoAnalytiqueView geoView = new GeoAnalytiqueView(new ArrayList<>());
    private GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(geoView.getGraphiques());

     /**
     * Constructeur de la classe GeoAnalytiqueGUI.
     * Initialise la fenêtre et les composants de l'interface graphique.
     */
    public GeoAnalytiqueGUI() {
        setTitle("Application de dessin géométrique");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        graphiques = new ArrayList<>();

        // Création de la zone de dessin
        add(geoView, BorderLayout.CENTER);

        // Création de la barre d'outils
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false); // Empêcher la barre d'outils d'être déplaçable

        // Boutons pour les différents objets géométriques
        JButton pointButton = new JButton("Point");
        JButton droiteButton = new JButton("Droite");
        JButton segmentButton = new JButton("Segment");
        JButton squareButton = new JButton("Carré");
        JButton triangleEquilateralButton = new JButton("TriangleEquilatéral");
        JButton triangleIsoceleButton = new JButton("TriangleIsocèle");
        JButton triangleRectangleButton = new JButton("TriangleRectangle");
        JButton ellipseButton = new JButton("Ellipse");
        JButton circleButton = new JButton("Cercle");
       

        // Après clique sur le bouton Point
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerPoint(e);
            }
        });

        //Après clique sur Droite
        droiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerDroite(e);
            }
        });

        //Après clique sur Segment
        segmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerSegment(e);
            }
        });

        //Après clique sur Carre
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerCarre(e);
            }
        });

        //Après clique sur Triangle Equilateral
        triangleEquilateralButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerTriangleEquilateral(e);
            }
        });

        //Après clique sur Triangle Isocèle
        triangleIsoceleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerTriangleIsocele(e);
            }
        });

        //Après clique sur Triangle Rectangle
        triangleRectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerTriangleRectangle(e);
            }
        });

         //Après clique sur Ellipse
         ellipseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerEllipse(e);
            }
        });

         //Après clique sur Cercle
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent e) {
                dessinerCercle(e);
            }
        });

        // Ajouter les boutons à la barre d'outils
        toolBar.add(pointButton);
        toolBar.add(droiteButton);
        toolBar.add(segmentButton);
        toolBar.add(squareButton);
        toolBar.add(triangleEquilateralButton);
        toolBar.add(triangleIsoceleButton);
        toolBar.add(triangleRectangleButton);
        toolBar.add(ellipseButton);
        toolBar.add(circleButton);
        
        // Ajouter un séparateur
        toolBar.addSeparator();
        toolBar.add(Box.createHorizontalGlue()); //aligner horizontalement
        
        // Ajouter la barre d'outils à la fenêtre principale
        add(toolBar, BorderLayout.NORTH);

        setVisible(true);
    }
    
    
    // Méthodes pour dessiner différents objets géométriques
    
    public void dessinerPoint(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX = JOptionPane.showInputDialog("Entrez la coordonnée x du point :");
    String inputY = JOptionPane.showInputDialog("Entrez la coordonnée y du point :");

    // Vérifier si les saisies sont valides
    try {
        double x = Double.parseDouble(inputX);
        double y = Double.parseDouble(inputY);

        // Créer un nouveau point avec les coordonnées saisies
        Point p = new Point(x, y);
        controleur.addObject(p);
        
        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerDroite(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du premier point :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du premier point :");
    String inputX2 = JOptionPane.showInputDialog("Entrez la coordonnée x2 du deuxieme point :");
    String inputY2 = JOptionPane.showInputDialog("Entrez la coordonnée y2 du deuxieme point :");

    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double x2 = Double.parseDouble(inputX2);
        double y2 = Double.parseDouble(inputY2);

        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Droite d = new Droite (p1, p2);
        controleur.addObject(d);
        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerSegment(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du premier point :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du premier point :");
    String inputX2 = JOptionPane.showInputDialog("Entrez la coordonnée x2 du deuxieme point :");
    String inputY2 = JOptionPane.showInputDialog("Entrez la coordonnée y2 du deuxieme point :");

    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double x2 = Double.parseDouble(inputX2);
        double y2 = Double.parseDouble(inputY2);

        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Segment s = new Segment(p1, p2);

        controleur.addObject(s);;

        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerCarre(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du premier point :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du premier point :");
    String inputLongueur = JOptionPane.showInputDialog("Entrez la longueur du côté");

    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double inputLongueurCote = Double.parseDouble(inputLongueur);

        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        Carre c = new Carre(p1, inputLongueurCote);

       controleur.addObject(c);

        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerTriangleEquilateral(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du premier point :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du premier point :");
    String inputLongueur = JOptionPane.showInputDialog("Entrez la longueur du côté");

    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double inputLongueurCote = Double.parseDouble(inputLongueur);

        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        TriangleEquilateral te = new TriangleEquilateral(p1, inputLongueurCote);

        controleur.addObject(te);

        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerTriangleIsocele(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du premier point :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du premier point :");
    String inputBase = JOptionPane.showInputDialog("Entrez la longueur de la base");
    String inputHauteur = JOptionPane.showInputDialog("Entrez la longueur de la hauteur");


    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double inputNewBase = Double.parseDouble(inputBase);
        double inputNewHauteur = Double.parseDouble(inputHauteur);


        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        TriangleIsocele ti = new TriangleIsocele(p1, inputNewBase, inputNewHauteur);

        controleur.addObject(ti);

        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerTriangleRectangle(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du premier point :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du premier point :");
    String inputHauteur = JOptionPane.showInputDialog("Entrez la longueur de la hauteur");
    String inputBase = JOptionPane.showInputDialog("Entrez la longueur de la base");


    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double inputNewBase = Double.parseDouble(inputBase);
        double inputNewHauteur = Double.parseDouble(inputHauteur);


        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        TriangleRectangle tr = new TriangleRectangle(p1, inputNewHauteur, inputNewBase);

       controleur.addObject(tr);

        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerEllipse(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du centre :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du centre :");
    String demiAxeX = JOptionPane.showInputDialog("Entrez la moitié du grand axe X");
    String demiAxeY = JOptionPane.showInputDialog("Entrez la moitié du petit axe Y");
    String inclinaison = JOptionPane.showInputDialog("Entrez l'inclinaison");


    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double inputNewDemiAxeX = Double.parseDouble(demiAxeX);
        double inputNewDemiAxeY = Double.parseDouble(demiAxeY);
        double newInclinaison = Double.parseDouble(inclinaison);


        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        Ellipse el = new Ellipse(p1, inputNewDemiAxeX, inputNewDemiAxeY, newInclinaison);

        controleur.addObject(el);
        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}

public void dessinerCercle(java.awt.event.ActionEvent e) {
    // Demander à l'utilisateur de saisir les coordonnées x et y
    String inputX1 = JOptionPane.showInputDialog("Entrez la coordonnée x1 du centre :");
    String inputY1 = JOptionPane.showInputDialog("Entrez la coordonnée y1 du centre :");
    String demiAxeX = JOptionPane.showInputDialog("Entrez le rayon");
    


    // Vérifier si les saisies sont valides
    try {
        double x1 = Double.parseDouble(inputX1);
        double y1 = Double.parseDouble(inputY1);
        double inputNewDemiAxeX = Double.parseDouble(demiAxeX);


        // Créer un nouveau point avec les coordonnées saisies
        Point p1 = new Point(x1, y1);
        Cercle cercle = new Cercle(p1, inputNewDemiAxeX);

        controleur.addObject(cercle);
        // Mettre à jour l'affichage
        geoView.repaint();
    } catch (NumberFormatException f) {
        // Gérer les erreurs si les saisies ne sont pas valides
        JOptionPane.showMessageDialog(null, "Les coordonnées doivent être des nombres valides.");
    }
}
}

