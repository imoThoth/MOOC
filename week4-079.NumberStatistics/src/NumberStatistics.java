
public class NumberStatistics {
    //instance variables created
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        //instance variable initialized in constructor
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        //method adds sum of all numbers entered in parameter
        //and increments amount of number each time a number is enterted in parameter
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        //method returns amount of number
        return this.amountOfNumbers;
    }

    public int sum() {
        //method returns sum
        return this.sum;
    }

    public double average() {
        //assigns double to undefined variable result
        double result;
        //if amount of numbers == 0, dont calculate average
        if (this.amountOfNumbers == 0) {
            return 0;
        //else result is defined and the average is calculated
        } else {
            result = (double) this.sum / this.amountOfNumbers;
        }
        //returns result
        return result;
    }
}
