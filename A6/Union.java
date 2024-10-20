//11.14



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        System.out.print("Enter 5 integers for list1: ");
        for (int i = 0; i < 5; i++) {
            one.add(in.nextInt());
        }

        System.out.print("Enter 5 integers for list2: ");
        for (int i = 0; i < 5; i++) {
            two.add(in.nextInt());
        }

        // System.out.print("array 1 is  " + one.toString());
        // System.out.print(" array 2 is  " + two.toString());

        ArrayList<Integer> combinedList = union(one, two);

        System.out.println("The combined list is " + combinedList.toString());
        in.close();
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();

        while (!list1.isEmpty() || !list2.isEmpty()) {
            if (!list1.isEmpty()) {
                int randomIndex1 = random.nextInt(list1.size());
                result.add(list1.remove(randomIndex1));
            }
            if (!list2.isEmpty()) {
                int randomIndex2 = random.nextInt(list2.size());
                result.add(list2.remove(randomIndex2));
            }
        }
        return result;
    }
} // End of class


