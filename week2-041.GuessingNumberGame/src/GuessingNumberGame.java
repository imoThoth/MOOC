
import java.util.Random; //imports random from java utilities
import java.util.Scanner; //imports scanner from java utilites

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // scanner assigned to variable name reader
        int numberDrawn = drawNumber(); //draw number from random assigned to variable name numberDrawn
        int guess = 0; //amount of guesses

        while (true) { //infinite loop
            System.out.print("Guess a number: "); //Outputs text
            int userNumber = Integer.parseInt(reader.nextLine()); //user input assigned to userNumber
            guess++; // guess incremented by 1
            if (userNumber == numberDrawn) { //checks if user number and drawn number are equal
                System.out.println("Congratulations,your guess is correct, guesses made: " + guess); // if true, prints guess and congratulations text
                break; //breaks loop
            } else if (userNumber < numberDrawn) { //checks if userNumber is less than drawn number
                System.out.println("The number is Greater, guesses made: " + guess); //tells user to increase guess and shows amount of guess
            } else {
                System.out.println("The number is lesser, guesses made: " + guess); // tells user to decrease guess and shows amount of guess
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
