import java.util.Random;

public class RandomCharacter {
    public static void main(String[] args) {

// Create a Random object
// this is java constructor and instantiates the object
        Random random = new Random();

// Generate a random integer between 0 and 255
//65 to 91 are the place where ASCII store uper case characters between A and Z
// We could make an array of string with alphabet but that take more effort.
        int asciiInt = random.nextInt(65, 91);

// Convert the integer to a character
//This is essentially converting that number to is corresponding Char
        char randomAsciiChar = (char) asciiInt;

// Print the random character
        System.out.println(randomAsciiChar);
    }
}

        /* if I wanted to build a check I could make a list to add to, have java check
        that list to see if character already exist and keep going using a while loop.
        Similar to vocab definition games I did in python.
        */




//https://www.ascii-code.com/
//https://stackoverflow.com/questions/2626835/is-there-functionality-to-generate-a-random-character-in-java


