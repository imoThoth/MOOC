
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: "); //outputs text
        int number = Integer.parseInt(reader.nextLine()); //stores userinput in variable number
        int i = 0; //assigns 0 to variable i, acts as counter
        int sum = 0; // assigns sum to variable 0
        int result = 0; //assigns result to variable 0
       while(i <= number){ //conditional loop goes on while i is less than or equal to number
        sum = (int)Math.pow(2, i); //stores power in sum
        result = sum + result; //stores result of sum and result
            i++; //increments counter by 1
                   }
        System.out.println("The result is " + result); //outputs result
    }
}
