
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int numbers : second) { //prints numbers in second list individually
            
            if (first.contains(numbers)) { //checks if the numbers are included in first list
                //do nothing if numbers are in first list
                
            } else {
                first.add(numbers); //add the numbers into the list
            }

        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
