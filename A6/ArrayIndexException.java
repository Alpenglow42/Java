//12.3

import java.util.Random;
import java.util.Scanner;


public class ArrayIndexException {

public static void main(String[] args) {
    // Create an array with 100 randomly chosen integers
    int[] arr = new int[100];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(1000); // You can change the range as per your requirements
    }

    // Prompt the user to enter the index
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an index to retrieve the corresponding element: ");

    // Read the user's input
    int index = scanner.nextInt();

    try {
        // Try to access the array at the specified index
        int element = arr[index];
        System.out.println("Element at index " + index + " is: " + element);
    } catch (ArrayIndexOutOfBoundsException e) {
        // Catch the exception and handle it
        System.out.println("Out of Bounds");
    }
}

}//end of class


//https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java