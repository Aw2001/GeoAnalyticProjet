package geoanalytique.graphique;

import java.awt.Graphics;
import java.util.List;

/**
 * La classe GLineComposite représente un ensemble de lignes graphiques.
 * Elle hérite de la classe Graphique.
 */
public class GLineComposite extends Graphique{

    private List<GLine> lignes; //liste de lignes

     /**
     * Constructeur de la classe GLineComposite.
     * @param lignes La liste des lignes à regrouper.
     */
    public GLineComposite(List<GLine> lignes) {
        this.lignes = lignes;
    }

     /**
     * Méthode permettant de dessiner l'ensemble des lignes dans le composite.
     * @param g L'objet Graphics utilisé pour le dessin.
     */
    @Override
    public void paint(Graphics g) {
        for (Graphique ligne : lignes) {
            ligne.paint(g);
        }
    }
}
