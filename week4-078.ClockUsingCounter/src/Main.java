
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        //creates 3 objects
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);
        
        //collects and stores user input in variable name, s m & h
        System.out.print("Seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("Minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("Hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        //set value of the objects to user input
        minutes.setValue(m);
        hours.setValue(h);
        seconds.setValue(s);
        
        int i = 0;
        //while loop increments like a clock using object method
        while(i < 121){
            System.out.println(hours+":"+minutes+":"+seconds);
            seconds.next();
            if(seconds.getValue() == 0){
                minutes.next();
            }
            if(minutes.getValue() == 0 && seconds.getValue() == 0){
                hours.next();
            }
            i++;
        }
        
      
        

    }
}
