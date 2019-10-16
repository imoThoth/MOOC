public class Printing {

    public static void printStars(int amount) {
        int i = 0; //acts as counter
        while(i < amount){ //while counter is less than amount loop runs
            System.out.print("*"); //prints a star
            i++; //increments i by 1
        }
        System.out.println(""); //prints line break
        
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = 0; //acts as a counter
        while(i < sideSize){ //while counter is less than sideSize, loop runs
            printStars(sideSize); //prints stars incrementing by sideSize
            i++; // i incremented by 1
        }
        
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int i = 0; //acts as counter
        while(i < height){ //loop runs while i is less than height
            printStars(width); //prints stars incrementing by width
            i++; //i is incremented by 1
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int i = 0; // acts as a counter
        while(i < size){ //loop runs while size is less than i
            printStars(i + 1); //prints stars using i+1 formula
            i++; // increments i by 1
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
