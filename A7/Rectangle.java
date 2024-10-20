public class Rectangle extends SimpleGeometricObject implements Cloneable{

    public static final double DEFAULT_LENGTH = 1.0;
    public static final double DEFAULT_WIDTH = 1.0;

    private double length, width;

    public Rectangle() {
        this(DEFAULT_LENGTH, DEFAULT_WIDTH);
    }

    public Rectangle(double length, double width) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o))
            return false;
        if(this.getClass() != o.getClass())
            return false;
        if(this.length == ((Rectangle)o).length
            && this.width == ((Rectangle)o).width)
            return true;
        return false;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(super.toString())
//                .append("\n   l=").append(length).append(", w=").append(width)
//                .append(", perimeter=").append(getPerimeter())
//                .append(", area=").append(getArea());
//        return sb.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Using format specifiers for consistent and fixed-width formatting
        // %.2f - makes 2 decimal place float      %8s makes field width     %s - string place holed with s being variable for example
        //return String.format("%-10s A=%.2f      (l=%.2f) (w =%.2f)", "Rectangle", getArea(), getWidth(), getLength());
          return String.format("%-12s A=%-12.2f  L=%-4.2f  w=%-4.2f",
                    " Rectangle", getArea(), getLength(), getWidth());
        //return String.format("%s A=%.2f      L=%.2f w=%.2f", "Rectangle", getArea(), getLength(), getWidth());
    }

    //makes object cloneable
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy using the Object class's clone method
        Rectangle clonedRectangle = (Rectangle) super.clone();

        return clonedRectangle;
    }
}//end of class

