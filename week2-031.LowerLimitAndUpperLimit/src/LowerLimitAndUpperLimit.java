
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first; // creates variable first
        int last; // creates variable last
        System.out.print("First: "); //prints text
        first = Integer.parseInt(reader.nextLine()); //first is used to store, user first input
        System.out.print("Last: "); //prints text
        last = Integer.parseInt(reader.nextLine()); //last is used to  store user last input
        while(first <= last){ //condition loop, which goes on while first is less than or equal to last
            System.out.println(first); // prints text
            first = first + 1; // increments first by 1
            
        }
        
       
    }
}
