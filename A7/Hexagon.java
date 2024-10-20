// Define the Hexagon class that extends SimpleGeometricObject and implements Comparable<Hexagon>
public class Hexagon extends SimpleGeometricObject implements Cloneable{

    public static final double DEFAULT_SIDE = 1.0;

    // Instance variable to store the side length of the hexagon
    private double side;

    // Default constructor that sets the side length to the default value
    public Hexagon() {
        this(DEFAULT_SIDE);
    }


    // Parameterized constructor that allows setting a specific side length
    public Hexagon(double side) {
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

    // Override the method to calculate the perimeter of the hexagon
    @Override
    public double getPerimeter() {
        // Perimeter of a hexagon is 6 times the side length
        return 6 * side;
    }

    // Override the method to calculate the area of the hexagon
    @Override
    public double getArea() {
        // Area of a regular hexagon formula: (3 * sqrt(3) * side^2) / 2
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }

    // Override the equals method to compare if two hexagons are equal
    @Override
    public boolean equals(Object o) {
        // Check if the superclass equals method returns true
        if (!super.equals(o))
            return false;
        // Check if the class of the object is the same as the Hexagon class
        if (this.getClass() != o.getClass())
            return false;
        // Check if the side lengths are equal
        if (this.side == ((Hexagon) o).side)
            return true;
        return false;
    }

    // Override the toString method to provide a string representation of the hexagon
//    @Override
//    public String toString() {
//        // Use a StringBuilder to construct the string representation
//        StringBuilder sb = new StringBuilder();
//        sb.append(super.toString()) // Include the superclass string representation
//                .append("\n   side=").append(side) // Add the side length
//                .append(", perimeter=").append(getPerimeter()) // Add the perimeter
//                .append(", area=").append(getArea()); // Add the area
//        return sb.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Using format specifiers for consistent and fixed-width formatting
        // %.2f - makes 2 decimal place float      %8s makes field width     %s - string place holed with s being variable for example
        //return String.format("%-12s A=%.2f      (s=%.2f)", "Hexagon", getArea(), getSide());
        return String.format("%-12s A=%-8.2f      s=%-8.2f", " Hexagon", getArea(), getSide());
        //return String.format("%s A=%.2f s=%.2f", "Hexagon", getArea(), getSide());

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy using the Object class's clone method
        Hexagon clonedHexagon = (Hexagon) super.clone();

        // Perform a deep copy by creating a new instance for the for mutable objects object
        //ie  clonedCircle.setDateCreated((Date) this.getDateCreated().clone());  // because date is mutable

        return clonedHexagon;
    }

}//end of class
