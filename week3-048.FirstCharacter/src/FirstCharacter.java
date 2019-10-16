import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("First character is: " + firstCharacter(name));
    }
    public static char firstCharacter(String text){ //method to find first character in a text
        char firstCharacter = text.charAt(3); //using method variable, store the first letter of text in first character
        return firstCharacter; //return the char in firstCharacter
    }
}
