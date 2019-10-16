import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        // write your code here
        int i = 0;
       
       for(int number : list){ //numbers in list printed
        if(number == searched){ //if number in list matches searched
            i++; //i increments by 1
        }
       }    
       if (i >= 2){ //if at end i is more than or equal 2
           return true; //returns true
       }
       return false; // return false
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
