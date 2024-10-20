import java.text.SimpleDateFormat;

public class SimpleGeometricObject {

    public static final boolean DEFAULT_FILLED = false;
    public static final String DEFAULT_COLOR = "black";

    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject() {
        this(DEFAULT_COLOR, DEFAULT_FILLED);
    }

    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getPerimeter() {
        System.out.println("WARNING: getPerimeter should be overridden by the subclass!");
        return 0.0;
    }

    public double getArea() {
        System.out.println("WARNING: getArea should be overridden by the subclass!");
        return 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null)
            return false;
        if(o.getClass() == this.getClass()) {
            if (this.color == ((SimpleGeometricObject) o).color
                    && this.filled == ((SimpleGeometricObject) o).filled)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ")
                .append(color).append(filled ? ", filled" : ", unfilled")
                .append(" (created ")
                .append((new SimpleDateFormat("yy:MM:dd@hh:mm:ss")).format(dateCreated))
                .append(")");
        return sb.toString();
    }
}
