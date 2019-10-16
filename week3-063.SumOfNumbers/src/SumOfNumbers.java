import java.util.ArrayList;

public class SumOfNumbers {
    public static int sum(ArrayList<Integer> list) {
        // adds content of array list and store answer in sum
        int sum = 0;
        for (Integer list1 : list) { //prints numbers in array list individually
            sum+=list1; //takes first number that comes out and adds it to sum
        }
        return sum; // sum is returned 
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum: " + sum(list));

        list.add(10);
        
        System.out.println("The sum: " + sum(list));
    }

}
