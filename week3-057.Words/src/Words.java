import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Stores users word in array list
        //if yser types no words, the loops break and content of array is displayed using for loop
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("Type a word: ");
            String userWord = reader.nextLine();
            if(userWord.isEmpty()){
                break;
            }else{
                words.add(userWord);
            }
        }
        for(String word: words){
            System.out.println(word);
        }
    }
}
