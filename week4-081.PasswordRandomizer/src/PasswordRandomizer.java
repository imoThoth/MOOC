import java.util.Random;

public class PasswordRandomizer {
   //instance variables created
    private Random random;
    private int length;
    

    public PasswordRandomizer(int length) {
        // variables initialized
        this.random = new Random();
        this.length = length;
       
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String symbols = "abcdefghijklmnopqrstuvwxyz"; //acts as symbol for potential password
        String password = ""; //password will be returned at the end of method
        
        while(i < length){
           char character = symbols.charAt(random.nextInt(symbols.length()));//selects a random number, the number position is symbol, is used to select a character
           password+=character; //each character is stored in password
           i++; 
        }
        
        return password;
    }
}
