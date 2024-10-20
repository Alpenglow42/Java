//public class SeriesSum {
//    public static void main(String[] args) {
//        // Create a table header
//        // \t is escabe tab to make space
//        System.out.println("i\ti/(i+1)");
//
//        //make a for loop from 1 to 20 and increases by 1
//        //each iteration outout the formula i/ (i+1)
//        for (int i = 1; i <= 20; i++) {
//            double result = (double) i / (i + 1);
//            // Print each value in a row
//            //%d: This is a placeholder for an integer value
//            //%.4f: It's replaced by the floating-point value
//            //%n: This is used for platform-independent line breaks, ensuring that the output ends with a newline character.
//            System.out.printf("%d\t%.4f%n", i, result);
//        }
//    }

//public class SeriesSum {
//    public static void main(String[] args) {
//        // Create a table header
//        System.out.println("I\tI/(I+1)");
//
//        // Specify the range
//        int startI = 0;
//        int endI = 0;
//
//        // Iterate through the specified range and calculate the series value for each I
//        for (int I = startI; I <= endI; I++) {
//            double result = sumSeriesValue(I);
//            System.out.printf("%d\t%.4f%n", I, result);
//        }
//    }
//
public class SeriesSum {

    public static void main(String[] args) {
        // Define the range for the loop
        int start = 1;   // You can change these values as needed
        int end = 20;    // For example, from 5 to 15

        // Call the method to calculate and print the series values
        calculateAndPrintSeries(start, end);
    }

    public static void calculateAndPrintSeries(int start, int end) {
        // Create a table header
        double result = 0;
        System.out.println("i\ti/(i+1)");

        // Iterate through the specified range and calculate the series value for each i
        for (int i = start; i <= end; i++) {
            result += (double) i / (i + 1);
            System.out.printf("%d\t%.4f%n", i, result);
        }
    }
}






//    // Custom method to calculate the series value for a given I
//    public static double sumSeriesValue(int I, startI , endI) {
//        return (double) I / (I + 1);
//    }
//}


//https://stackoverflow.com/questions/12682447/printf-f-with-4-decimals-and-the-symbol-in-the-end
//https://www.geeksforgeeks.org/java-program-to-find-sum-of-the-series-1-1-2-2-3-3-1-n/#
//https://brainly.com/question/18729404
