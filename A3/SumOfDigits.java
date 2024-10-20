// problem 6.2
import java.util.Scanner;
public class SumOfDigits {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            //find the last number of digit add to sum
            sum = (int) (sum + n % 10);

            //removes the last digit
            n = n / 10;
        }
        return sum;

        //need a code to call the method, aka driver code
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        int digitSum = sumDigits(number);
        System.out.println("The sum of digits: " + digitSum);

        // Don't forget to close the scanner when done
        scanner.close();
    }
}



