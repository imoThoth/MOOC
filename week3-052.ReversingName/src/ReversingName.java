import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: "); // asks user for name
        String name = reader.nextLine(); //collect and stores user input in name
        int nameL = name.length(); //finds the length of the name
        char nameChar; //defines a variable named nameChar
        int i = 0;//defines variable i and assigns 0 to variable
        String wordStorage = ""; //String defined and assigneded
        while(nameL != i){ //loop runs while length of name does not equal to i
            i++; // i is incremented by 1
            nameChar = name.charAt(name.length() -i); //finds the last letter and prints it out
            wordStorage = wordStorage + nameChar; //the letter is then stored in wordStorage
          }
          System.out.println("In reverse order: " + wordStorage); //prints out what is in wordStorage as well as text
    }
}
