//test exception code by passing illegal triangle


import java.util.Scanner;

//public class IllegalTriangleTest {



//        public static void main(String[] args) {
//            try {
//                // Create a Triangle object with sides that violate the triangle rule
//                Triangle illegalTriangle = new Triangle(1.0, 2.0, 3.0, "Red", true);
//            } catch (IllegalTriangleException e) {
//                System.out.println("Caught an illegal triangle exception: " + e.getMessage());
//            }
//        }



//        public static void main(String[] args) {
//            try {
//                Triangle illegalTriangle = new Triangle(1.0, 2.0, 3.0, "red", true); // This should throw an exception
//            } catch (IllegalTriangleException e) {
//                System.out.println("Caught an exception: " + e.getMessage());
//            }
//        }

//import java.util.Scanner;

public class IllegalTriangleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Please enter and illegal triangle 1, 2 ,3 : ");
            double side1 = in.nextDouble();
            double side2 = in.nextDouble();
            double side3 = in.nextDouble();

//            System.out.println("Please enter a color");
//            String color = in.next();

//            System.out.println("Is the triangle filled? (true/false");
//            boolean filled = in.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3);
//            triangle.setColor(color);
//            triangle.setFilled(filled);

            System.out.println("Triangle Area " + triangle.getArea());
            System.out.println("Triangle Perimeter " + triangle.getPerimeter());
            System.out.println("Triangle Color " + triangle.getColor());
            System.out.println("Triangle Filled " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}










