//6.36
import java.util.Scanner;

public class PolygonArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of sides and side length
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the length of each side: ");
        double side = input.nextDouble();

        // Calculate the area of the regular polygon
        double area = area(n, side);

        // Display the result
        System.out.println("The area of the regular polygon is: " + area);

        input.close();
    }

    public static double area(int n, double side) {
        // Calculate the area using the formula
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
    }



