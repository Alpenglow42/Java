
import java.util.Scanner;

public class Triangles {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle3: Enter side 1");
        double s1 = input.nextDouble();
        System.out.println("enter side 2");
        double s2 = input.nextDouble();
        System.out.println("enter side 3");
        double s3 = input.nextDouble();

        //Checks if valid if true goes to area calc if not prints else
        if (isValid(s1, s2, s3)) {
            System.out.println("The input sides form a valid triangle.");
            System.out.println("The area of the triangle is: " + area(s1, s2, s3));
        } else {
            System.out.println("The input sides do not form a valid triangle.");
        }
    }

    // triangle formula
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //uses 2 side of any triangle added together are larger than 3rd side then triangle is valid.
    //Should check all 3 permutations of sides to be true, not just one.
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1;
    }
}


