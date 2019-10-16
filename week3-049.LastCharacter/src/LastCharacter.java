import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: "); //asks user for name
        String name = reader.nextLine();// reads user input and stores in name
        System.out.println("Last Character: " + lastCharacter(name)); //calls method lastCharacter and outputs text
    }
    public static char lastCharacter(String text){ //method to print out last character
        char lastCharacter = text.charAt(text.length() -1); //to find last character, find size of word and take away 1, answer is stored in lastCharacter
        return lastCharacter; //returns the last character
    }
}
