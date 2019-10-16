import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
       
        ArrayList<String> words = new ArrayList<String>(); //defined array list, named words
        while(true){ //infinite conditional loop
            System.out.println("Type a word: "); //outputs text for user
            String userWord = reader.nextLine(); //reads texts from user, and stores in userWord
            if(userWord.isEmpty()){ //checks if user text is empty
                break; //if true loop ends
            }else{
                words.add(userWord); // else, the word is added into array
            }
        }
        Collections.reverse(words); //collections method reverse items in array list
        for(String word: words){ 
             System.out.println(word);
        }
        
    }
}

