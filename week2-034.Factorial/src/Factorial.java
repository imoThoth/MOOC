import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number; //variable name number defined as int
        int i = 0; //varaible i defined as integer, assigned number 0
        int sum = 1; // variable sum defined as integer, defined as 1
        System.out.print("Type a number: "); // type a text
        number = Integer.parseInt(reader.nextLine()); //userinput is assigned to number
        while(i < number){ //conditionally loop which continues while i is less than number
            i++; // i is incremented
            sum *= i; // sum is multiplied by i and answered stored in sum
        }
        System.out.println("Factorial is " + sum); // outputs text and sum
    }
}
