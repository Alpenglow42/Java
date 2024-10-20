
import java.util.Scanner;

public class SortThreeIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second Integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the Third Integer: ");
        int num3 = input.nextInt();

        //System.out.println("You entered: " + num1 + ", " + num2 + ", " + num3);

        // Display integers in non-decreasing order ( or smallest to largest or increasing
        // need to take into account permutations of 3 chances that num1, num2, or num3 is larger
        if (num1 > num2) {
            int tempNum = num1;
            num1 = num2;
            num2 = tempNum;
        }
        if (num2 > num3) {
            int tempNum = num2;
            num2 = num3;
            num3 = tempNum;
        }
        if (num1 > num2) {
            int tempNum = num1;
            num1 = num2;
            num2 = tempNum;
        }

        System.out.println("Integers displayed in Non-decreasing order" + num1 + ", " + num2 + ", " + num3);

        input.close();
    }
}
