package geoanalythique.graphique;

import java.awt.Graphics;
import java.util.List;

public class GLineComposite extends Graphique{
    private List<GLine> lignes;

    public GLineComposite(List<GLine> lignes) {
        this.lignes = lignes;
    }

    @Override
    public void paint(Graphics g) {
        for (Graphique ligne : lignes) {
            ligne.paint(g);
        }
    }
}
