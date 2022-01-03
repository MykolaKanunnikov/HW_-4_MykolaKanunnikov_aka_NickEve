package education.cursor;

public class Main {

    public static void main(String[] args) {
        Point[] point2d = new Point[3];
        point2d[0] = new Point(5, 7);
        point2d[1] = new Point(6, 9);
        point2d[2] = new Point(2, 5);

        Point[] point3d = new Point[3];
        point3d[0] = new Point(2, 4, 6);
        point3d[1] = new Point(8, 10, 12);
        point3d[2] = new Point(14, 16, 18);

        Circle circle = new Circle(new Point[]{point2d[0]}, 10);
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle(point2d);
        triangle.getPerimeter();
        triangle.getArea();

        Rectangle rectangle = new Rectangle(new Point[]{point2d[1]}, 5, 6);
        rectangle.getArea();
        rectangle.getPerimeter();

        SquarePyramid squarePyramid = new SquarePyramid(new Point[]{point3d[0]}, 5, 6);
        squarePyramid.getArea();
        squarePyramid.getVolume();

        Cuboid cuboid = new Cuboid(new Point[]{point3d[1]}, 5, 10, 15);
        cuboid.getArea();
        cuboid.getVolume();

        Sphere sphere = new Sphere(new Point[]{point3d[2]}, 15);
        sphere.getArea();
        sphere.getVolume();

        Shape[] figures = new Shape[6];
        figures[0] = triangle;
        figures[1] = rectangle;
        figures[2] = circle;
        figures[3] = squarePyramid;
        figures[4] = cuboid;
        figures[5] = sphere;
        for (Shape figure : figures) {
            System.out.println(figure);
        }

    }
}
