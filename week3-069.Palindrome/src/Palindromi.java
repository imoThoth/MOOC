import java.util.Scanner;

public class Palindromi {
    public static String reverse(String text){
        int i = 0;
        int z = 1;
        String reverse = "";
        
        while(i < text.length()){
            char name = text.charAt(text.length()-z); //stores a character from text length, using z as the current position, and saves it in name
            reverse = reverse + name; //each character is added into the variable reverse
            i++;
            z++;
        }
        return reverse ; //reverse is returned
       
    }

    public static boolean palindrome(String text) {
        // write code here
        String compare = reverse(text); //method reverse is called, and stores reversed text in compare
        
        if(compare.contentEquals(text)){ //contents of compare and text are checked to see if they macthed
            return true; 
            
        } else{
            return false;
        }
       
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
