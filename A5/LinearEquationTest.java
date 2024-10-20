




import java.util.Scanner;

public class LinearEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        System.out.print("Enter the value of d: ");
        double d = input.nextDouble();
        System.out.print("Enter the value of e: ");
        double e = input.nextDouble();
        System.out.print("Enter the value of f: ");
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            double x = equation.getX();
            double y = equation.getY();
            System.out.println("Solution for x: " + x);
            System.out.println("Solution for y: " + y);
        } else {
            System.out.println("The equation has no solution.");
        }

        input.close();
    }
}// end of class


//    Enter a, b, c, d, e, f: 9.0 4.0 3.0 −5.0 −6.0 −21.0
//        x is −2.0 and y is 3.0
//
//        Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
//        The equation has no solution



