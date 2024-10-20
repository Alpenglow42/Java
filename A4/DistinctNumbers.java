//7.5



// copy code from reverse order
// set up to check input for distinct numbers

import java.util.Scanner;
import java.util.ArrayList;

public class DistinctNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter 10 integers with spaces in between: ");
        String userInput = scanner.nextLine();

        if (readAndValidateInput(numbers, userInput)) {
            int[] distinctNumbers = findDistinctNumbers(numbers);
            System.out.println("Number of distinct numbers: " + distinctNumbers.length);
            System.out.print("Distinct numbers in input order: ");
            for (int num : distinctNumbers) {
                System.out.print(num + " ");
            }
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

        //conditional handling
        for (int i = 0; i < 10; i++) {
            try {
                numbers[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                return false; // Return false if any part is not a valid integer
            }
        }
        return true; // Input is valid
    }


    // This is the modified method for finding distinct numbers in input order
    public static int[] findDistinctNumbers(int[] numbers) {
        ArrayList<Integer> distinctList = new ArrayList<Integer>();
        for (int num : numbers) {
            if (!distinctList.contains(num)) {
                distinctList.add(num);
            }
        }

        int[] distinctArray = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            distinctArray[i] = distinctList.get(i);
        }

        return distinctArray;
    }


}
