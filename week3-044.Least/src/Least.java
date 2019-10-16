
public class Least {

    public static int least(int number1, int number2) { //method to display smallest number
       
        return  Math.min(number1, number2); //using math library, displays the minimum number
    }

    public static void main(String[] args) {
        int result = least(2, 7); //method least called in main menu
        System.out.println("Least: " + result); //displays text and shows result
    }
}
