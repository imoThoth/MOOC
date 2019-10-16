
import java.util.Scanner; //imports scanner from java utilities


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //scanner assigned to variable reader
        int first; //variable of type int, called first created
        int last; //variable of type int called last created
        int sum = 0; //variable of type int called sum, assigned number 0
        System.out.print("First: "); //prints text
        first = Integer.parseInt(reader.nextLine()); //user input is stored in first
        System.out.print("Last: ");// prints text
        last = Integer.parseInt(reader.nextLine()); // user last input is stored in last
        while(first <= last){ //conditional loop, while first is less than or equal to last
           sum = sum + first; //adds first and sum, stores data in sum
           first++; //first is incremented by 1
            
        }
        System.out.println("The sum is " + sum); //displays text and sum
    }
}
