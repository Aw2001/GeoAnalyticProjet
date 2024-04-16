package geoanalytique;

import javax.swing.SwingUtilities;

import geoanalytique.gui.GeoAnalytiqueGUI;

/**
 * La classe principale de l'application GeoAnalytique.
 * 
 * Cette classe lance l'interface graphique utilisateur (GUI) de l'application.
 */
public class Main {
    
    /**
     * Le point d'entrée de l'application.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés dans cette application).
     */
    public static void main(String[] args) {
        // Utilisation de SwingUtilities.invokeLater() pour garantir que l'initialisation de
        // l'interface graphique s'exécute sur le thread de l'interface utilisateur (UI).
        SwingUtilities.invokeLater(() -> {
            // Création d'une instance de GeoAnalytiqueGUI pour lancer l'interface graphique.
            new GeoAnalytiqueGUI();
        });
    }

}
