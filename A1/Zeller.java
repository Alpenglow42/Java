
import java.util.Scanner;

public class Zeller {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year (e.g. 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day of the month (1-31): ");
        int day = input.nextInt();

        //March = 3 so if less than 3 ( 1 or 2 ie Jan or feb)
        if (month < 3) {
            month += 12;
            year = year - 1;
        }

        int q = day;
        int m = month;
        int j = year / 100;
        int k = year % 100;

        //Zeller algorithm
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        //Make array or list in python for days of the week because array start count at 0 for sat, 1 for sun, ect
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is: " + daysOfWeek[h]);
        }
    }

//geeks for geeks zellers congruence
//stackoverflow determining day of the week using zeller congruence
//codedrome.com calculating the day of the wekk with zellers congruence in js

