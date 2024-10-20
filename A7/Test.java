



import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // Create an ArrayList to store SimpleGeometricObjects
        ArrayList<SimpleGeometricObject> geometricObjects = new ArrayList<>();

        // Create a Random object to generate random values
        Random random = new Random();

        // Create 100 objects with equal probability
        for (int i = 0; i < 100; i++) {
            double randomValue = random.nextDouble() * 9 + 1; // Random value between 1 and 10

            // Randomly choose a shape type
            int shapeType = random.nextInt(4); // 0: Circle, 1: Rectangle, 2: Hexagon, 3: Dodecagon

            // Create objects based on the randomly chosen shape type
            switch (shapeType) {
                case 0:
                    // Create a Circle with a random radius
                    geometricObjects.add(new Circle(randomValue));
                    break;
                case 1:
                    // Create a Rectangle with random length and width
                    double randomLength = random.nextDouble() * 9 + 1;
                    double randomWidth = random.nextDouble() * 9 + 1;
                    geometricObjects.add(new Rectangle(randomLength, randomWidth));
                    break;
                case 2:
                    // Create a Hexagon with a random side length
                    geometricObjects.add(new Hexagon(randomValue));
                    break;
                case 3:
                    // Create a Dodecagon with a random side length
                    geometricObjects.add(new Dodecagon(randomValue));
                    break;
                default:
                    System.out.println("Invalid shape type.");
            }
        }

        // Perform deep copy and add clones to the ArrayList
        ArrayList<SimpleGeometricObject> clonedObjects = new ArrayList<>();
        for (SimpleGeometricObject obj : geometricObjects) {
            try {
                // Use clone method to create a deep copy
                SimpleGeometricObject clonedObject = (SimpleGeometricObject) obj.clone();
                clonedObjects.add(clonedObject);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
        }

        // Add the cloned objects to the original ArrayList
        geometricObjects.addAll(clonedObjects);

        // Sort the ArrayList
        Collections.sort(geometricObjects);

        // Display information about each object
//        for (SimpleGeometricObject obj : geometricObjects) {
//            //System.out.println(obj);
//        }

        // Display information about each object and count
        int objectCount = 0;
//        for (SimpleGeometricObject obj : geometricObjects) {
//            objectCount++;
//            System.out.println(objectCount + ". " + obj);
        for (int i = 0; i < geometricObjects.size(); i += 2) {
            objectCount++;
            SimpleGeometricObject obj = geometricObjects.get(i);
            SimpleGeometricObject clone = geometricObjects.get(i + 1);

            // Display the original object
            //System.out.printf("%d. Original: %s%n", objectCount, obj);
            System.out.printf("%3d.  Original: %s %n", objectCount, obj);

            //System.out.printf(" Original: %-25s%n", obj);
            //System.out.println(objectCount);
            //System.out.println( obj);
//            // Display its clone
            System.out.printf("%3d.  Clone:    %s%n",  objectCount, clone);
            //System.out.println( clone);




        }


//        }

        // Sort the ArrayList
//        Collections.sort(geometricObjects);

        // Display the total number of objects
        System.out.println("Total number of objects: " + objectCount);
    }
}

