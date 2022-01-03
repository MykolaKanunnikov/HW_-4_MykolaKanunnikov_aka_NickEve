package education.cursor;

import java.util.Arrays;

public class Cuboid extends SpaceShape implements VolumeMeasurable, AreaMeasurable {
    private final double height;
    private final double weight;
    private final double depth;
    private double area;
    private double volume;

    public Cuboid(Point[] vertices, double height, double weight, double depth) {
        super(vertices);
        this.depth = depth;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        area = 6 * weight * weight;
        return area;
    }

    @Override
    public double getVolume() {
        volume = height * weight * depth;
        return volume;
    }

    @Override
    public String toString() {
        return "Cuboid{" + "vertices=" + Arrays.toString(getVertices()) + ",height=" + height + ",weight=" + weight + ",depth =" + depth + " ," +
                "area=" + area +
                ", volume=" + volume +
                '}';
    }
}
