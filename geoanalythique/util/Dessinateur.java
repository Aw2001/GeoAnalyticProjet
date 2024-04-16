package geoanalythique.util;

import java.util.Arrays;

import geoanalythique.graphique.GCoordonnee;
import geoanalythique.graphique.GLine;
import geoanalythique.graphique.GLineComposite;
import geoanalythique.graphique.GOvale;
import geoanalythique.graphique.Graphique;
import geoanalythique.model.Carre;
import geoanalythique.model.Cercle;
import geoanalythique.model.Droite;
import geoanalythique.model.Ellipse;
import geoanalythique.model.Point;
import geoanalythique.model.Segment;
import geoanalythique.model.TriangleEquilateral;
import geoanalythique.model.TriangleIsocele;
import geoanalythique.model.TriangleRectangle;


public class Dessinateur implements GeoObjectVisitor<Graphique>{
    
    @Override
    public GCoordonnee visitorPoint(Point point) {
        // Implémentation pour dessiner un point
        return new GCoordonnee(point); // Retourne un objet graphique représentant le point
    }

    @Override
    public GLine visitorSegment(Segment segment) {
        return new GLine(segment.getPoint1(), segment.getPoint2()); 
    }


    @Override
    public GLine visitorDroite(Droite droite) {
        return new GLine(droite.getPoint1(), droite.getPoint2());
    }

    @Override
    public GOvale visitorCercle(Cercle cercle) {
        return new GOvale(cercle.getCentre(), (int)cercle.getRayon()*2, (int)cercle.getRayon()*2);
    }

    @Override
    public GLineComposite visitorCarre(Carre carre) {
       GLine segment1 = new GLine(carre.getSommet1(), carre.getSommet2());
       GLine segment2 = new GLine(carre.getSommet1(), carre.getSommet3());
       GLine segment3 = new GLine(carre.getSommet3(), carre.getSommet4());
       GLine segment4 = new GLine(carre.getSommet4(), carre.getSommet2());
       return new GLineComposite(Arrays.asList(segment1, segment2, segment3, segment4));
    }

    @Override
    public GOvale visitorEllipse(Ellipse ellipse) {
        return new GOvale(ellipse.getCentre(), (int)ellipse.getdemiAxeX(), (int)ellipse.getdemiAxeY());
    }

    @Override
    public GLineComposite visitorTriangleEquilateral(TriangleEquilateral triangleEquilateral) {
        GLine segment1 = new GLine(triangleEquilateral.getSommet1(), triangleEquilateral.getSommet2());
        GLine segment2 = new GLine(triangleEquilateral.getSommet1(), triangleEquilateral.getSommet3());
        GLine segment3 = new GLine(triangleEquilateral.getSommet3(),triangleEquilateral.getSommet2());
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));
    }

    @Override
    public GLineComposite visitorTriangleIsocele(TriangleIsocele triangleIsocele) {
        GLine segment1 = new GLine(triangleIsocele.getSommet1(), triangleIsocele.getSommet2());
        GLine segment2 = new GLine(triangleIsocele.getSommet1(), triangleIsocele.getSommet3());
        GLine segment3  = new GLine(triangleIsocele.getSommet2(), triangleIsocele.getSommet3());
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));
    }

    @Override
    public GLineComposite visitorTriangleRectangle(TriangleRectangle triangleRectangle) {
        GLine segment1 = new GLine(triangleRectangle.getSommet1(), triangleRectangle.getSommet2());
        GLine segment2 = new GLine(triangleRectangle.getSommet1(), triangleRectangle.getSommet3());
        GLine segment3  = new GLine(triangleRectangle.getSommet2(), triangleRectangle.getSommet3());
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));

    }
}
