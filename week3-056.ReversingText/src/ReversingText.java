
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        //method used to reverse text
        int i = 0;
        int z = 1;
        String reverse = "";
        while(i < text.length()){ //using a conditional while loop 
            char name = text.charAt(text.length()-z); //finds and stores letter relative to z(1)
            reverse = reverse + name; //takes the letter stored in name, and adds it to reverse
            i++;
            z++;
        }
        return reverse ; //reverse is returned
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
