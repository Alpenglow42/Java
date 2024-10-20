//11.1 triangle




//    // Fields specific to the Triangle class
//    private double side1;
//    private double side2;
//    private double side3;
//
//    // Constructors
//    public Triangle() {
//        super(); // Call the no-arg constructor of the parent class
//        side1 = 1.0;
//        side2 = 1.0;
//        side3 = 1.0;
//    }
//
//    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
//
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    // Accessor methods for the Triangle class
//    public double getSide1() {
//        return side1;
//    }
//
//    public double getSide2() {
//        return side2;
//    }
//
//    public double getSide3() {
//        return side3;
//    }
//
//    // Method to calculate the area of the triangle
//    public double getArea() {
//        // from 2.19
//        double s = (side1 + side2 + side3) / 2.0;
//        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//    }
//
//    // Method to calculate the perimeter of the triangle
//    public double getPerimeter() {
//        return side1 + side2 + side3;
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", " + super.toString();
//    }

public class Triangle extends SimpleGeometricObject {


    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
//    private String color;
//    private boolean filled;

    // Constructors
    public Triangle() {
        // Default constructor
//        side1 = 1.0;
//        side2 = 1.0;
//        side3 = 1.0;
        //color = "NoColor";
        //filled = false;
    }

//    public Triangle1(double side1, double side2, double side3, String color, boolean filled) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//        this.color = color;
//        this.filled = filled;
//    }
//  String color, boolean filled
    //exception handling constructor
    public Triangle(double side1, double side2, double side3 ) throws IllegalTriangleException {
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            //throw new IllegalTriangleException("Invalid triangle sides: The sum of any two sides must be greater than the third side.");
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        //this.color = color;
        //this.filled = filled;
    }

    public Triangle(double v, double v1, double v2, String red, boolean b) {
    }


    // Accessor methods for the Triangle class
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }

    // Method to calculate the area of the triangle
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the perimeter of the triangle
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }


}//end of class



