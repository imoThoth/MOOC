import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: "); //asks user for name
        String name = reader.nextLine(); //reads user input and stores in name
        System.out.println("Length of the end part: "); //aks user for length
        int endPart = Integer.parseInt(reader.nextLine()); //reads user input and stores in first
       
        System.out.println("Result: "+name.substring(name.length() - endPart)); //finds difference between length of word and endpart
                                                                                //difference acts as subString
        
    }
    
}
