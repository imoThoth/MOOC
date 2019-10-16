public class SumOfNumbers {

    public static int sum(int number1, int number2, int number3, int number4) {
        // write your code here
       int sum = number1 + number2 + number3 + number4; //using method variable sum, adds up numbers within parameter
        
        
        return sum; //returns sum in main method
    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1); //method sum is called in main menu, and given parameters
        System.out.println("Sum: " + answer); // the parameters are added up, and printed out
    }
}

