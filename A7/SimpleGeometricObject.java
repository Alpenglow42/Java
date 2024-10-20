import java.text.SimpleDateFormat;


// Define an abstract class SimpleGeometricObject that implements Comparable<SimpleGeometricObject>
public abstract class SimpleGeometricObject implements Comparable<SimpleGeometricObject> {

    // Constants for default filled state and color
    public static final boolean DEFAULT_FILLED = false;
    public static final String DEFAULT_COLOR = "black";

    // Instance variables for color, filled state, and creation date
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    // Default constructor, initializes color and filled state with default values
    public SimpleGeometricObject() {
        this(DEFAULT_COLOR, DEFAULT_FILLED);
    }

    //Parameterized constructor, allows setting specific color and filled state
    public SimpleGeometricObject(String color, boolean filled) {
        //Initialize the creation date to current date and time
        dateCreated = new java.util.Date();
        //set color and filled as base parameters
        this.color = color;
        this.filled = filled;
    }

    //compare method to implement Comparable interface, compares based on area
    public int compareTo(SimpleGeometricObject s) {
        if (this.getArea() == s.getArea())
            return 0;
        else if (this.getArea() < s.getArea())
            return -1;
        else
            return 1;
    }
    // Getter method to retrieve the color
    public String getColor() {
        return color;
    }

    // Setter method to modify the color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method to check if the object is filled
    public boolean isFilled() {
        return filled;
    }

    // Setter method to retrieve the filled state
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter method to retrieve the creation date
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // Abstract method to be implemented by subclasses for calculating perimeter
    public abstract double getPerimeter();

    // Abstract method to be implemented by subclasses for calculating area
    public abstract double getArea();

    // Override the equals method to compare if two geometric objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (o.getClass() == this.getClass()) {
            if (this.color == ((SimpleGeometricObject) o).color
                    && this.filled == ((SimpleGeometricObject) o).filled)
                return true;
        }
        return false;
    }

    // Override the toString method to provide a string representation of the object
    @Override
    public String toString() {

        // Use a StringBuilder to construct the string representation
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ")
                .append(color).append(filled ? ", filled" : ", unfilled")
                .append(" (created ")
                .append((new SimpleDateFormat("yy:MM:dd@hh:mm:ss")).format(dateCreated))
                .append(")");
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        SimpleGeometricObject other = (SimpleGeometricObject) obj;
//
//        // Compare fields for equality
//        // You need to adjust this based on the actual fields in your class
//        return Double.compare(other.radius, radius) == 0
//                && Double.compare(other.length, length) == 0
//                && Double.compare(other.width, width) == 0
//                && Double.compare(other.side, side) == 0;
//    }

}//end of class
