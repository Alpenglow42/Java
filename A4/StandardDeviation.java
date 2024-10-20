// ch 7 problem 7.11 standard dev mean

import java.text.DecimalFormat;

public class StandardDeviation {

    // main method store n and array of 10 vars calls mean method and standard dev method
    public static void main(String[] args) {


        // Declare and initialize an array with 10 elements
        double[] varArray = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};

        // call mean method print
        double mean = calculateMean(varArray);

        // call standard dev method print
        double stdDev = standardDev(varArray, mean);

        // Create a DecimalFormat object for rounding to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat dfFive = new DecimalFormat("#.#####");

        // Print the mean and standard deviation
        System.out.println("Mean: " + df.format(mean));
        System.out.println("Standard Deviation: " +  dfFive.format(stdDev));

    }

    // mean method returns mean
    public static double calculateMean(double[] varArray) {
        // Initialize a variable to store the sum of elements
        double sum = 0.0;

        // Calculate the sum of all elements in the array
        for (int i = 0; i < varArray.length; i++) {
            sum += varArray[i];
        }

        // Calculate the mean by dividing the sum by the number of elements
        double mean = sum / varArray.length;

        // Return the calculated mean
        return mean;


    }


// standard dev array
    public static double standardDev(double[]varArray, double mean){
    //enhanced for loop, initialize variable
        double sumSquaredDifferences = 0;
        for (double var : varArray){
            double diff = var - mean;

            //
            sumSquaredDifferences += diff * diff;
        }
        double variance = sumSquaredDifferences / (varArray.length - 1); // For sample standard deviation
        // double variance = sumSquaredDifferences / data.length; // For population standard deviation

        return Math.sqrt(variance);
    }

//end of class
}


//https://www.programiz.com/java-programming/enhanced-for-loop
//https://www.geeksforgeeks.org/sum-of-squares-of-differences-between-all-pairs-of-an-array/#