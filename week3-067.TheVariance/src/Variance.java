import java.util.ArrayList;

public class Variance {
 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int numbers : list){ //list of numbers printed
            sum+= numbers; //sum is added to each number printed
        }
        return sum; //returns the sum of all number
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list) / list.size(); //uses method sum and list size to find average
        return average; //returns average
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double difference = 0;
        double average = average(list);
        double variance = 0; 
        
        for(double numbers: list){ //numbers in list printed
            difference = numbers - average; //numbers are taken away from average and stored in difference
           
            variance += Math.pow(difference, 2); //difference is squared, and sum of the numbers are stored in variance
            
            
            
        }
        return variance / (list.size()-1); //variance is then divided by list size -1
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("Sum of numbers " + sum(list));
        
        System.out.println("Average of numbers " + average(list));
        System.out.println("The variance is: " + variance(list));
    }

}
