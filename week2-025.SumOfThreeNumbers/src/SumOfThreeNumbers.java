
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        // store numbers read form user in this variable
        // Write your program here
        // Use only variables sum and read
        System.out.print("Type your first number: "); //displays text to user
        read = Integer.parseInt(reader.nextLine()); // collects user number and stores in read
        sum = sum + read; //data in read and sum are added and stored in sum
        System.out.print("Type your second number: "); 
        read = Integer.parseInt(reader.nextLine()); 
        sum = sum + read;                          
        System.out.print("Type your third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        

        System.out.println("Sum: " + sum); //displays sum 
    }
}
