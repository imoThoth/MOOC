import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
         this.random = new Random();
        this.drawNumbers();
       
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
      //creates new arrayList
      //while loop occurs array size is less than 7
      //loop draws a new random number between 1 and 39
      //if statment checks if number has already been drawn or not
      //if it is a new number, it is added into the array list
        this.numbers = new ArrayList<Integer>();
       
        while(this.numbers.size() < 7){
            int draw = 1 * random.nextInt(39)+1;
            if(containsNumber(draw)){
                //do noting
            } else{
                 this.numbers.add(draw);
            }
           
            
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        //checks number is in list of this number
        //returns true or false
        if(this.numbers.contains(number)){
            return true;
        }
        
        else{
            return false;
        }
    }
    
}
