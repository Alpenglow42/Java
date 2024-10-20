// problem 9.9

import java.lang.Math;



public class RegularPolygon {

    private int n = 3; //number of sides
    private double side = 1; //length of side
    private double x = 0; //x- coordinate of polygons center
    private double y = 0; //x- coordinate of polygons center


    //constructor method defines coordinates (x, y)
    //no arg constructor
    public RegularPolygon() {
        x = 0;
        y= 0;
        side =1; // default
        n =3 ;   //default
    }

    //constructor with sides(n) and side length(side), x, y (0, 0)
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    //constructor with sides(n), side length(side), x and y (this.x, this.y)
    public RegularPolygon(int n, double side,double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // accessor (get, status) method
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //mutator (set, change) method
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //method to return perimeter of polygon
    public double getPerimeter() {
        double perimeter = n * side;
        return perimeter;
    }

    // method to return area of polygon
    public double getArea() {
        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return area;
    }



} //end of class
