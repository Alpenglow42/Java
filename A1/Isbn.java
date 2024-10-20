// this can be solved best using for loops however since most likely want us to do it the long way or manual iteration.
// similar to before user input and scanner will

import java.util.*;


    public class Isbn {
        public static <string> void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter the first 9 digits of an ISBN as integer: ");

            //wanted to use if statement here but ran into local global variable issues.
            int numb = in.nextInt();

            int d1 = numb / 100000000;

            int d2 = numb / 10000000;

            int d3 = numb / 1000000 % 10;

            int d4 = numb / 100000 % 10;

            int d5 = numb / 10000 % 10;

            int d6 = numb / 1000 % 10;

            int d7 = numb / 100 % 10;

            int d8 = numb / 10 % 10;

            int d9 = numb % 10;

            String isbnNum = "" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;

            int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

            if (d10 == 10)
                System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + (d10 - 1));
            else
                System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);

            //System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);



            in.close();
        }

    }







            // wrong path watched video on 3.8
            /*Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the 1st digit: ");
            int d1 = scanner.nextInt();
            String dig1 = String.valueOf(d1);

            System.out.print("Enter the 2nd digit: ");
            int d2 = scanner.nextInt();
            String dig2 = String.valueOf(d2);

            System.out.print("Enter the 3rd digit: ");
            int d3 = scanner.nextInt();
            String dig3 = String.valueOf(d3);

            System.out.print("Enter the 4th digit: ");
            int d4 = scanner.nextInt();
            String dig4 = String.valueOf(d4);

            System.out.print("Enter the 5th digit: ");
            int d5 = scanner.nextInt();
            String dig5 = String.valueOf(d5);

            System.out.print("Enter the 6th digit: ");
            int d6 = scanner.nextInt();
            String dig6 = String.valueOf(d6);

            System.out.print("Enter the 7th digit: ");
            int d7 = scanner.nextInt();
            String dig7 = String.valueOf(d7);

            System.out.print("Enter the 8th digit: ");
            int d8 = scanner.nextInt();
            String dig8 = String.valueOf(d8);

            System.out.print("Enter the 9th digit: ");
            int d9 = scanner.nextInt();
            String dig9 = String.valueOf(d9);
            */

            //int sum = digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9;
            //int tenthDigit = sum % 10;

            //double d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
            //System.out.print(d10 + " digit 10");

            //String dig10 = String.valueOf(d10);



            //String isbnNum = (dig1 + dig2 + dig3 + dig4 + dig5 + dig6+ dig7 +dig8 + dig9 + dig10);

            //System.out.println("The ISBN-10 number is: " + isbnNum );

            //scanner.close();


//
// used https://www.geeksforgeeks.org/how-to-concatenate-two-integer-values-into-one/#
// https://stackoverflow.com/questions/2674707/how-to-concatenate-int-values-in-java
