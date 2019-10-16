
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        // Write your code here
        System.out.println("In the beginning there were the swamp, the hoe and Java.");//outputs text
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in); //scanner assigned to varaible reader
        int i = 0; //variable i defined and assigned to 1
        System.out.println("How many?"); //outputs text
        int userNum = Integer.parseInt(reader.nextLine()); //user input collected and assigned to userNum
        while(i < userNum){ //loops until i reaches 7
            printText(); //prints text
            i++; //i is incremented by 1
        }
    }
}
