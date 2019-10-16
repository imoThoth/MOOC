
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        while(hangman.gameOn()){ //loop runs while hangman.gameOn is true
            System.out.print("Type a command: "); //outputs a text
            String command = reader.nextLine(); //collects and stores user input
            if(command.equals("quit")){ //if input is quit, code break
              break;
            } else if(command.equals("status")){ //if input is status prints status
                hangman.printStatus();
            }else if(command.length() == 1){ //if input command length is 1, input is treated as a guess
                hangman.guess(command);
            }else if(command.isEmpty()){ //if input is empty, menu is printed
                printMenu();
            } else{ //hangman is printed, along with the word at the end of the game
                hangman.printMan();
                hangman.printWord();
            }
        }


        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
