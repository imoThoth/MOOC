
import java.util.Scanner; 

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0; //creates variable sum, assigned number 0
        int i = 0; // creates variabe i, assigned number 0
        int number; //variable number created of type int
        System.out.print("Until what? "); // prints text
        number = Integer.parseInt(reader.nextLine()); //user input collected and assigned to number
        while(i < number){ //conditional loop takes places while i is less than number
            i++; // i is incremented by 1
            sum = sum + i; //sum is incremented by i
        }
        
        System.out.println("Sum is "+sum); //prints sum

    }
}
