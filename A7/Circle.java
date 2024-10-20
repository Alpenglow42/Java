


public class Circle extends SimpleGeometricObject implements Cloneable{
    public static final double DEFAULT_RADIUS = 1.0;

    private double radius = 1.0;

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public Circle(double radius) {
        this(radius, DEFAULT_COLOR, DEFAULT_FILLED);
    }

    public Circle(double radius, String color, boolean filled) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius * 2.0 * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o))
            return false;
        if(this.getClass() != o.getClass())
            return false;
        if(this.radius == ((Circle)o).radius)
            return true;
        return false;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(super.toString())
//                .append("\n   r=").append(radius)
//                .append(", perimeter=").append(getPerimeter())
//                .append(", area=").append(getArea());
//        return sb.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Using format specifiers for consistent and fixed-width formatting
        // %.2f - makes 2 decimal place float      %8s makes field width     %s - string place holed with s being variable for example
        //return String.format("%-12s A=%.2f      (r=%.2f)", "Circle", getArea(), getRadius());
          return String.format("%-12s A=%-8.2f      r=%-8.2f", " Circle", getArea(), getRadius());
        //return String.format("%s A=%.2f      r=%.2f", "Circle", getArea(), getRadius());

    }

    //makes object cloneable
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy using the Object class's clone method
        Circle clonedCircle = (Circle) super.clone();

        // Perform a deep copy by creating a new instance for the for mutable objects object
        //ie  clonedCircle.setDateCreated((Date) this.getDateCreated().clone());  // because date is mutable

        return clonedCircle;
    }

}// end of class
