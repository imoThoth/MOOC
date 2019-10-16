import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in); //scanner assigned to reader
        int i = 0; //variable i assigned to number 0    
        int sum = 0; //variable sum defined
        int even = 0; //varaible even defined
        int odd = 0; // variable odd defined
        System.out.println("Type numbers: "); //outputs text
        while(true){ //infinite conditional loops 
            int userNum = Integer.parseInt(reader.nextLine()); //collects user input and assigns it to userNum
            if(userNum == -1){ //checks if userNum is -1
                break; // if true the loop is broken
               } else{
                i++; // if not i is incremented by 1
            
            }
            sum = userNum + sum; //result stored in sum 
            if(userNum % 2 == 0){ //checks if i is even or odd
                even++; //if even, even incremented
            } else{
                odd++; //if odd, odd incremented
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + (double)sum/i);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: " + odd);
    }
}
