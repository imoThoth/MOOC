
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> word = new ArrayList<String>();
        
        while (true) { //infinite conditional loopp
            
            System.out.print("Type a word: "); //outputs text
        String wordInput = reader.nextLine(); //stores userinput in wordInput
            if (word.contains(wordInput)) { //checks if word and wordInput matches
                System.out.println("You gave the word " + wordInput + " twice");
                break; //if true the loop is broken
            } else {
                word.add(wordInput); //if false, the word is added into the array
            }
            
        }
    }
}
