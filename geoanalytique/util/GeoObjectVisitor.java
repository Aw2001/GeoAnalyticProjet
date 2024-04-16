package geoanalytique.util;

import geoanalytique.model.Carre;
import geoanalytique.model.Cercle;
import geoanalytique.model.Droite;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Point;
import geoanalytique.model.Segment;
import geoanalytique.model.TriangleEquilateral;
import geoanalytique.model.TriangleIsocele;
import geoanalytique.model.TriangleRectangle;

/**
 * L'interface GeoObjectVisitor est l'interface de base pour les visiteurs du modèle.
 * @param <T> Le type de l'objet graphique à visiter.
 */
public interface GeoObjectVisitor<T> {
    
     /**
     * Visite un point.
     *
     * @param point Le point à visiter.
     * @return L'objet graphique correspondant au point visité.
     */
    T visitorPoint(Point point);

     /**
     * Visite un segment.
     *
     * @param segment Le segment à visiter.
     * @return L'objet graphique correspondant au segment visité.
     */
    T visitorSegment(Segment segment);

    /**
     * Visite une droite.
     *
     * @param droite La droite à visiter.
     * @return L'objet graphique correspondant à la droite visitée.
     */
    T visitorDroite(Droite droite);

    /**
     * Visite un cercle.
     *
     * @param cercle Le cercle à visiter.
     * @return L'objet graphique correspondant au cercle visité.
     */
    T visitorCercle(Cercle cercle);

     /**
     * Visite un carré.
     *
     * @param carre Le carré à visiter.
     * @return L'objet graphique correspondant au carré visité.
     */
    T visitorCarre(Carre carre);

     /**
     * Visite une ellipse.
     *
     * @param ellipse L'ellipse à visiter.
     * @return L'objet graphique correspondant à l'ellipse visitée.
     */
    T visitorEllipse(Ellipse ellipse);

     /**
     * Visite un triangle équilatéral.
     *
     * @param triangleEquilateral Le triangle équilatéral à visiter.
     * @return L'objet graphique correspondant au triangle équilatéral visité.
     */
    T visitorTriangleEquilateral(TriangleEquilateral triangleEquilateral);

    /**
     * Visite un triangle isocèle.
     *
     * @param triangleIsocele Le triangle isocèle à visiter.
     * @return L'objet graphique correspondant au triangle isocèle visité.
     */
    T visitorTriangleIsocele(TriangleIsocele triangleIsocele);

     /**
     * Visite un triangle rectangle.
     *
     * @param triangleRectangle Le triangle rectangle à visiter.
     * @return L'objet graphique correspondant au triangle rectangle visité.
     */
    T visitorTriangleRectangle(TriangleRectangle triangleRectangle);    

}
