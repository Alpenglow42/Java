
//add Scanner

//public class FanTest {
//
//    public static void main(String[] args) {
//        Fan fan1 = new Fan();
//        Fan fan2 = new Fan();
//
//        fan1.setSpeed(Fan.FAST);
//        fan1.setRadius(10);
//        fan1.setColor("yellow");
//        fan1.turnON();
//
//        fan2.setSpeed(Fan.FAST);
//        fan2.setRadius(5);
//        fan2.setColor("blue");
//        fan2.turnOff();
//        System.out.println("Fan 1 toString: " + fan1.toString());
//        System.out.println("Fan 2 toString: " + fan2.toString());
//    }


//        Triangle regularTriangle = new Triangle();
//
//        double side1Value = 3.0;
//        double side2Value = 4.0;
//        double side3Value = 5.0;
//        String colorValue = "Red";
//        boolean filledValue = true;
//
//        Triangle triangle1 = new Triangle(side1Value, side2Value, side3Value, colorValue, filledValue);
//
//
//        double area = triangle1.getArea(); // Call the getArea method
//        System.out.println("The area of the triangle1 is: " + area);
//
//        double perimeter = triangle1.getPerimeter();//call get perimeter method
//        System.out.println("The perimeter of the triangle1 is: " + perimeter);
//
//
//        String triangleString = triangle1.toString(); // Call the toString method
//        System.out.println(triangleString);
//
//
//    }

//import java.util.Scanner;
//
//public class TriangleTest {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        try {
//            // Prompt the user to enter the three sides of the triangle
//            System.out.print("Enter the three sides of the triangle: ");
//            double side1 = input.nextDouble();
//            double side2 = input.nextDouble();
//            double side3 = input.nextDouble();
//
//            // Prompt the user to enter the color of the triangle
//            System.out.print("Enter the color of the triangle: ");
//            String color = input.next();
//
//            // Prompt the user to specify if the triangle is filled
//            System.out.print("Is the triangle filled? (True/false): ");
//            String fillInput = input.next();
//            boolean filled = fillInput.equalsIgnoreCase("True");
//
//            // Create a Triangle object with the user input
//            // Triangle triangle = new Triangle(side1, side2, side3, color, filled);
//            Triangle triangle = new Triangle();
//            // Calculate and display the area and perimeter
//            System.out.println("For " + triangle.toString() + " the area is " + triangle.getArea()
//                    + " square units.");
//            System.out.println("The perimeter is " + triangle.getPerimeter() + " units.");
//
//            // Display the current color and whether the triangle is filled
//            System.out.println("The current color is " + triangle.getColor());
//            System.out.println("Is the triangle filled? " + (triangle.isFilled() ? "Yes" : "No"));
//        } catch (IllegalTriangleException e) {
//            // Close the input scanner
//            System.out.println(e.getMessage());
////        } catch (IllegalTriangleException exception) {
////            System.out.println(exception.getMessage());
//        } finally {
//
//        }
//    }
//        //input.close();
//    }
//
//
//}

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Please enter three sides of the triangle: ");
            double side1 = in.nextDouble();
            double side2 = in.nextDouble();
            double side3 = in.nextDouble();

            System.out.println("Please enter a color");
            String color = in.next();

            System.out.println("Is the triangle filled? (true/false");
            boolean filled = in.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println("Triangle Area " + triangle.getArea());
            System.out.println("Triangle Perimeter " + triangle.getPerimeter());
            System.out.println("Triangle Color " + triangle.getColor());
            System.out.println("Triangle Filled " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}

