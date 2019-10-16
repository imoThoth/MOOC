
public class Main {

    public static void main(String[] args) {
        //new object is created
        Dice dice = new Dice(6);
        
        //uses while loop to generate 10 random rolls
        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }

    }
}
