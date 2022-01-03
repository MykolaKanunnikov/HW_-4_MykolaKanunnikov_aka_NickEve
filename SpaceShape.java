package education.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    public SpaceShape(Point[] vertices) {
        super(vertices);
    }
}