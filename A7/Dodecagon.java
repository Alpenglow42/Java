



public class Dodecagon extends SimpleGeometricObject implements Cloneable{


    public static final double DEFAULT_SIDE = 1.0;

    // Instance variable to store the side length of the hexagon
    private double side;

    // Default constructor that sets the side length to the default value
    public Dodecagon() {
        this(DEFAULT_SIDE);

    }

    // Parameterized constructor that allows setting a specific side length
    public Dodecagon(double side) {
        // Call the constructor of the superclass (SimpleGeometricObject)
        super();
        // Set the side length of the hexagon
        this.side = side;
    }

    // Getter method to retrieve the side length
    public double getSide() {
        return side;
    }

    // Setter method to modify the side length
    public void setSide(double side) {
        this.side = side;
    }

    // Override the method to calculate the perimeter of the dodecagon
    @Override
    public double getPerimeter() {
        // Perimeter of a hexagon is 6 times the side length
        return 12 * side;
    }

    // Override the method to calculate the area of the dodecagon
    @Override
    public double getArea() {
        // Area of a regular hexagon formula: (3 * sqrt(3) * side^2) / 2
        //return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;

        // Dodecagon A = 3 × ( 2 + √3 ) × s^2 .

        return ( 3 * (2 + Math.sqrt(3) * Math.pow(side, 2)));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Using format specifiers for consistent and fixed-width formatting
        // %.2f - makes 2 decimal place float      %8s makes field width     %s - string place holed with s being variable for example
        //return String.format("%-12s A=%-8.2f      s=%-8.2f", "Dodecagon", getArea(), getSide());
        return String.format("%-12s A=%-8.2f      s=%-8.2f", " Dodecagon", getArea(), getSide());
        //return String.format("%s A=%.2f      s=%.2f", "Dodecagon", getArea(), getSide());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy using the Object class's clone method
        Dodecagon clonedDodecagon = (Dodecagon) super.clone();

        // Perform a deep copy by creating a new instance for the for mutable objects object
        //ie  clonedCircle.setDateCreated((Date) this.getDateCreated().clone());  // because date is mutable

        return clonedDodecagon;
    }

}//end of class
