
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) { //method sum with 4 parameters
         int sum = number1 + number2 + number3 + number4; //adds up the parameter, and saves result in sum
         return sum; // returns sum
    }

    public static double average(int number1, int number2, int number3, int number4) { //find the average of 4 numbers and shows result in double
        int result; //variable result defined
        result = sum(number1, number2, number3, number4); //method sum is called, and answer stored in result
        double average = (double)result / 4; //result is converted to double, and used to find the average of the 4 parameters
        return average; //returns the average
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
