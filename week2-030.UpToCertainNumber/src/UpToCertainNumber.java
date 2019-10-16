
import java.util.Scanner; //scanner imported from java utilities


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //scanner is assigned to reader
        int number; //variable number created of interger type
        int i = 0; //variable i created, stored infomation is 0
        System.out.println("Up to what number? "); // prints text
        number = Integer.parseInt(reader.next()); //number is used to store user input
        while(i < number){ //loop occurs while i is less than number
            i++; //i is incremented, stops infinite loop
            System.out.println(i); //prints i
        }
        
        
        
    }
}
