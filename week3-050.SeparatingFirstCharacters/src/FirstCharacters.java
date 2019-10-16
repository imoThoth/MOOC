
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: "); // asks user to input name
        String name = reader.nextLine(); // collects and stores user input in name

        int i = 0; // acts as counter for position of character
        int t = 1; // acts as counter 1 2 3
        int nameL = name.length(); //finds the length of name

        if (nameL < 3) { //if length is less than 3
            //conditional loop does nothing

        } else { // if more, the while loop takes over

            while (i < 3) {  //loop runs while i is less than 3

                char nameChar = name.charAt(i); //stoes the char in nameChar
                System.out.println(t + "." + " character: " + nameChar); //outputs text and character
                i++; //counter incremented by 1
                t++; //counter incremented by 1
            }
        }

    }
}
