import java.util.Scanner;
import java.util.Arrays;

public class ThreeCities {
    public static void main(String[] args) {

        //instantiates and use constructor method for scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First City: ");
        String firstCity = input.nextLine();

        System.out.print("Enter the Second City: ");
        String secondCity = input.nextLine();

        System.out.print("Enter the Third City: ");
        String thirdCity = input.nextLine();

//        String inputCity = firstCity + secondCity + thirdCity;
//        char[] orderCityArray = inputCity.toCharArray();
//        Arrays.sort(orderCityArray);
//        System.out.println(new String(orderCityArray));


        String[] cities = {firstCity, secondCity, thirdCity};
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(cities));


        input.close();


    }
}

/*I want to say being a python guy I'm like python does this better however I was wrong, and it's super cool to know
that this is converting string to char and then using ascii number to compare. I always wondered stuff like this and none of my
so called programmer friends or things could teach me. Plus it makes so much more sense.
 */
//https://www.tutorialspoint.com/java-program-to-sort-an-array-in-case-insensitive-order

/* String[] confused me as to why it worked and I didn't need to instantiate it. Until I found it was a short cut
for:
String[] cities = new String[3];
cities[0] = firstCity;
cities[1] = secondCity;
cities[2] = thirdCity;
//https://stackoverflow.com/questions/20348818/is-it-faster-or-better-to-declare-an-array-inline-in-java
note that the method used doesn't hold the array in memory like it would be in above instantiate method
 */