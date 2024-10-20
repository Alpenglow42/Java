//7.2  Write a program that reads 10 integers and then displays them in reverse order in which they were read.

import java.util.Scanner;




public class ReverseOrder {

        public static void main(String[] args) {
            //make and array for input and new scanner object
            int[] numbers = new int[10];
            Scanner scanner = new Scanner(System.in);

            //ask user for input and use scanner to read that input
            System.out.print("Please enter 10 integers with spaces in between: ");
            String userInput = scanner.nextLine();

            //flow control of method in main method,
            //other methods check input, and revers string and output results

            //takes readAndValidateInput as arguments
            //if readAndValidateInput is true calls other two method, but if false else is executed
            if (readAndValidateInput(numbers, userInput)) {
                reverseArray(numbers);
                printArray(numbers);
            } else {
                System.out.println("Invalid input. Please enter 10 integers with spaces in between.");
            }
        }

        // Checking input method
        public static boolean readAndValidateInput(int[] numbers, String userInput) {
            String[] parts = userInput.split(" ");

            // if the userInput is not as 10 after being in array(parts) Returns false
            if (parts.length != 10) {
                return false; // Return false if there are not exactly 10 parts
            }

            //conditional handeling
            for (int i = 0; i < 10; i++) {
                try {
                    numbers[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    return false; // Return false if any part is not a valid integer
                }
            }
            return true; // Input is valid
        }

        // Method to reverse the order of elements in the array
        public static void reverseArray(int[] arr) {
            for (int i = 0; i < 5; i++) {
                int temp = arr[i];
                arr[i] = arr[9 - i];
                arr[9 - i] = temp;
            }
        }

        // Method to print the array elements
        public static void printArray(int[] arr) {
            System.out.print("Reversed order: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

//https://www.javatpoint.com/how-to-take-array-input-in-java
//https://stackoverflow.com/questions/34016851/try-catch-block-with-an-if-statement
//https://www.w3schools.com/java/java_try_catch.asp
//https://www.javatpoint.com/try-catch-block
//https://www.javatpoint.com/java-integer-parseint-method
//https://www.geeksforgeeks.org/numberformatexception-in-java-with-examples/#
//https://rollbar.com/blog/java-numberformatexception/#
//https://www.javatpoint.com/numberformatexception-in-java
