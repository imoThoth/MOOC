
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: "); //asks user for name
        String name = reader.nextLine(); //reads user input and stores in name
        System.out.println("Length of the fist part: "); //aks user for length
        int upTo = Integer.parseInt(reader.nextLine()); //reads user input and stores in first
       
        System.out.println("Result: "+name.substring(0, upTo)); //prints out result and letters upTo what user asks
        
    }
}
