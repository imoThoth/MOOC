
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       //Stores users word in array list
        //if user types no words, the loops break and content of array is displayed using for loop
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String userWord = reader.nextLine();
             if(userWord.isEmpty()){
                break;
            }else{
                words.add(userWord);
            }
           
            }
        //collection sorts the array list in alphabetical order
        //array list printed out in order using for looop
        Collections.sort(words);
        for(String word: words){
            System.out.println(word);
           
        }
    }
}
