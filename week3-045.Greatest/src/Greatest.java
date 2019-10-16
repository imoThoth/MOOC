
public class Greatest {

    public static int greatest(int number1, int number2, int number3) { //checks the greatest number within the parameter
        int first = Math.max(number1, number2); //compares the first and second, and greatest is stored in first
        int last = Math.max(first, number3); //greatest stored in first, compared with number 3, biggest number stored in last
        return last; // last is returned 
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3); //calls method, to check the greatest of the numbers
        System.out.println("Greatest: " + result); //oututs text and result
    }
}
