package education.cursor;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Point[] vertices) {
        super(vertices);
    }
}