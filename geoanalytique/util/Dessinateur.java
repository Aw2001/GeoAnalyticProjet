package geoanalytique.util;

import java.util.Arrays;

import geoanalytique.graphique.GCoordonnee;
import geoanalytique.graphique.GLine;
import geoanalytique.graphique.GLineDroite;
import geoanalytique.graphique.GLineComposite;
import geoanalytique.graphique.GOvale;
import geoanalytique.graphique.Graphique;
import geoanalytique.model.Carre;
import geoanalytique.model.Cercle;
import geoanalytique.model.Droite;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Point;
import geoanalytique.model.Segment;
import geoanalytique.model.Triangle;
import geoanalytique.model.TriangleEquilateral;
import geoanalytique.model.TriangleIsocele;
import geoanalytique.model.TriangleRectangle;

/**
 * La classe Dessinateur est un visiteur qui permet de créer des graphiques à partir d'objets géométriques.
 */
public class Dessinateur implements GeoObjectVisitor<Graphique>{
    
    @Override
    public Graphique visitorPoint(Point point) {
        // Retourne un objet graphique représentant le point
        return new GCoordonnee(point);
    }

    @Override
    public Graphique visitorSegment(Segment segment) {
        //Crée un graphique représentant un segment
        return new GLine(segment.getPoint1(), segment.getPoint2());
    }


    @Override
    public Graphique visitorDroite(Droite droite) {
        // Crée un graphique représentant une droite
        return new GLineDroite(droite.getPoint1(), droite.getPoint2()); 
    }

    @Override
    public Graphique visitorCercle(Cercle cercle) {
        //Crée un graphique représentant un cercle
        return new GOvale(cercle.getCentre(), (int)cercle.getRayon()*2, (int)cercle.getRayon()*2, cercle.getInclinaison()); 
    }

    @Override
    public Graphique visitorCarre(Carre carre) {
       GLine segment1 = new GLine(carre.getSommet1(), carre.getSommet2());
       GLine segment2 = new GLine(carre.getSommet1(), carre.getSommet3());
       GLine segment3 = new GLine(carre.getSommet3(), carre.getSommet4());
       GLine segment4 = new GLine(carre.getSommet4(), carre.getSommet2());
       //Retourne un objet graphique représentant un carré
       return new GLineComposite(Arrays.asList(segment1, segment2, segment3, segment4));
    }

    @Override
    public Graphique visitorEllipse(Ellipse ellipse) {
        //Retourne un objet graphique représentant une ellipse
        return new GOvale(ellipse.getCentre(), (int)(ellipse.getdemiAxeX()*2), (int)(ellipse.getdemiAxeY()*2), ellipse.getInclinaison());
    }

    @Override
    public Graphique visitorTriangleEquilateral(TriangleEquilateral triangleEquilateral) {
        GLine segment1 = new GLine(triangleEquilateral.getSommet1(), triangleEquilateral.getSommet2());
        GLine segment2 = new GLine(triangleEquilateral.getSommet1(), triangleEquilateral.getSommet3());
        GLine segment3 = new GLine(triangleEquilateral.getSommet3(),triangleEquilateral.getSommet2());
        //Retourne l'objet graphique représentant un triangle equilateral
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));
    }

    @Override
    public Graphique visitorTriangleIsocele(TriangleIsocele triangleIsocele) {
        GLine segment1 = new GLine(triangleIsocele.getSommet1(), triangleIsocele.getSommet2());
        GLine segment2 = new GLine(triangleIsocele.getSommet1(), triangleIsocele.getSommet3());
        GLine segment3 = new GLine(triangleIsocele.getSommet2(), triangleIsocele.getSommet3());
        //Retourne un objet graphique représentant un triangle Isocele
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));
    }

    @Override
    public Graphique visitorTriangleRectangle(TriangleRectangle triangleRectangle) {
        GLine segment1 = new GLine(triangleRectangle.getSommet1(), triangleRectangle.getSommet2());
        GLine segment2 = new GLine(triangleRectangle.getSommet1(), triangleRectangle.getSommet3());
        GLine segment3 = new GLine(triangleRectangle.getSommet2(), triangleRectangle.getSommet3());
        //Retourne un objet graphique représentant un triangle rectangle
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));

    }
    @Override
    public Graphique visitorTriangle(Triangle triangle) {
        GLine segment1 = new GLine(triangle.getSommet1(), triangle.getSommet2());
        GLine segment2 = new GLine(triangle.getSommet1(), triangle.getSommet3());
        GLine segment3 = new GLine(triangle.getSommet3(),triangle.getSommet2());
        //Retourne un objet graphique représentant un triangle
        return new GLineComposite(Arrays.asList(segment1, segment2, segment3));
    }
}
