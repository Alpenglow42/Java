// problem 9.8 (next 9.9, 9.11)




public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW; //speed of fan default
    private boolean ON;
    private double radius;
    private String color;

    // constructor
    public Fan() {
        ON = false;
        color = "blue";
        radius = 5.0;
        speed = SLOW;
    }

    // accessor method
    public void turnON() {
        ON = true;
    }

    public void turnOff() {
        ON = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    // mutator method
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //toString method returns string description of the fain, and all settings
    public String toString() {
        if (ON) {
            return "Fan is on with speed " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan is off. Please turn it on first. But the fan has following settings:"
                    + "speed " + speed + ", color: " + color + ", radius: " + radius;
        }
    }

}//end of class
