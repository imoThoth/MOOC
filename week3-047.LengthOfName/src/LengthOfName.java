
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: "); //asks user for name
        String name = reader.nextLine(); //collects name and stores in name 
        System.out.println("Number of Characters: " +  calculateCharacters(name)); //prints out text and length of user name
    }
    
    
    public static int calculateCharacters(String text){
        int calculateCharacters = text.length(); //finds length of text, and stores it in claculateCharacters
        
        return calculateCharacters; //method returns calculateCharacters
    }
    
}
