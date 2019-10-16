
import java.util.ArrayList;

public class AverageOfNumbers {

    
    public static int sum(ArrayList<Integer> list) {
          // adds content of array list and store answer in sum
        int sum = 0;
        for (Integer list1 : list) {  // adds content of array list and store answer in sum
            sum+=list1; //takes first number that comes out and adds it to sum
        }
        return sum; // sum is returned 
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        //calcualtes average using sum method and list size
        double average = (double)sum(list) / list.size();
        
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
