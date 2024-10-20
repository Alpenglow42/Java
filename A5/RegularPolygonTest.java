
//   Write a test pro-gram that creates three RegularPolygon objects, created using the no-arg
//   constructor, using RegularPolygon(6, 4), and using
//   RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.



public class RegularPolygonTest {
    public static void main(String[] args) {
        // Create RegularPolygon objects using different constructors
        RegularPolygon polygon1 = new RegularPolygon(); // No-arg constructor
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // Constructor with n and side
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8); // Constructor with n, side, x, and y

        // Display perimeter and area for each object
        System.out.println("Polygon 1 Perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 Area: " + polygon1.getArea());

        System.out.println("Polygon 2 Perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 Area: " + polygon2.getArea());

        System.out.println("Polygon 3 Perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 Area: " + polygon3.getArea());
    }
}
