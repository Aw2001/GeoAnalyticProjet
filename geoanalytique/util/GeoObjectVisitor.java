package geoanalytique.util;

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
 * L'interface GeoObjectVisitor est l'interface de base pour les visiteurs du modèle.
 * @param <Graphique> Le type de l'objet graphique à visiter.
 */
public interface GeoObjectVisitor<Graphique> {
    
     /**
     * Visite un point.
     *
     * @param point Le point à visiter.
     * @return L'objet graphique correspondant au point visité.
     */
    Graphique visitorPoint(Point point);

     /**
     * Visite un segment.
     *
     * @param segment Le segment à visiter.
     * @return L'objet graphique correspondant au segment visité.
     */
    Graphique visitorSegment(Segment segment);

    /**
     * Visite une droite.
     *
     * @param droite La droite à visiter.
     * @return L'objet graphique correspondant à la droite visitée.
     */
    Graphique visitorDroite(Droite droite);

    /**
     * Visite un cercle.
     *
     * @param cercle Le cercle à visiter.
     * @return L'objet graphique correspondant au cercle visité.
     */
    Graphique visitorCercle(Cercle cercle);

     /**
     * Visite un carré.
     *
     * @param carre Le carré à visiter.
     * @return L'objet graphique correspondant au carré visité.
     */
    Graphique visitorCarre(Carre carre);

     /**
     * Visite une ellipse.
     *
     * @param ellipse L'ellipse à visiter.
     * @return L'objet graphique correspondant à l'ellipse visitée.
     */
    Graphique visitorEllipse(Ellipse ellipse);

     /**
     * Visite un triangle équilatéral.
     *
     * @param triangleEquilateral Le triangle équilatéral à visiter.
     * @return L'objet graphique correspondant au triangle équilatéral visité.
     */
    Graphique visitorTriangleEquilateral(TriangleEquilateral triangleEquilateral);

    /**
     * Visite un triangle.
     *
     * @param triangle Le triangle à visiter.
     * @return L'objet graphique correspondant au triangle visité.
     */
    Graphique visitorTriangle(Triangle triangle);


    /**
     * Visite un triangle isocèle.
     *
     * @param triangleIsocele Le triangle isocèle à visiter.
     * @return L'objet graphique correspondant au triangle isocèle visité.
     */
    Graphique visitorTriangleIsocele(TriangleIsocele triangleIsocele);

     /**
     * Visite un triangle rectangle.
     *
     * @param triangleRectangle Le triangle rectangle à visiter.
     * @return L'objet graphique correspondant au triangle rectangle visité.
     */
    Graphique visitorTriangleRectangle(TriangleRectangle triangleRectangle);    

}
