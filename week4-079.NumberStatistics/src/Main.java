import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        //creates 3 objects
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        //while loop takes user input until -1 is entered then loop breaks
        //if statement checks if user input is even or odd
        //sum of even, odd and numbers are all printed when loop breaks
        while(true){
            int userInput = Integer.parseInt(reader.nextLine());
            if(userInput == -1){
                break;
                
            } else if(userInput%2==0){
                even.addNumber(userInput);
                stats.addNumber(userInput);
                
            } else if(userInput%2!=0){
                odd.addNumber(userInput);
                stats.addNumber(userInput);
            }
        }
            System.out.println("sum: " + stats.sum()); 
            System.out.println("sum of even: " + even.sum());
            System.out.println("sum of odd: " + odd.sum());
    }
}
