
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        //assigns scanner to reader
        //asks and stores user for 2 wirds
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
        
        //checks if the firstword can be found in the second word, using indexOf
        if (firstWord.indexOf(secondWord) != -1) {
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
        } else {
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
        }
    }

}

