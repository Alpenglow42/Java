// problem 9.11




public class LinearEquation {
    // Private data fields
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Constructor
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Method to check if the equation is solvable
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // Methods to calculate and return the solutions
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

