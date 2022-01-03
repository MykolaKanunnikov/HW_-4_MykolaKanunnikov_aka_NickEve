package education.cursor;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private final double baseWidth;
    private final double baseHeight;
    private double volume;
    private double area;

    public SquarePyramid(Point[] vertices, double baseHeight, double baseWidth) {
        super(vertices);
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
    }

    @Override
    public double getArea() {
        area = (0.5 * Math.sqrt(baseHeight * baseHeight + (baseWidth / 2) * baseWidth / 2) * 4 * baseWidth) + baseWidth * baseWidth;
        return area;
    }

    @Override
    public double getVolume() {
        volume = baseWidth * baseWidth * baseHeight / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" + "vertices=" + Arrays.toString(getVertices()) + ",baseHeight= " + baseHeight + ", baseWidth=" + baseWidth + ", " +
                "volume=" + volume +
                ", area=" + area +
                '}';
    }
}