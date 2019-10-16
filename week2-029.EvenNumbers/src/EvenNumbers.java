
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int i = 1; //creates a counter starting at 1
        while(i <= 100){ //checks if counter is less than or equal to 100
            if(i % 2 == 0){ //checkks if i is even
                System.out.println(i);// if i is even, its displayed
            } else{
                //nothing is shown
            }
            i++; //counter is incremented by 1
        }
    }
}
