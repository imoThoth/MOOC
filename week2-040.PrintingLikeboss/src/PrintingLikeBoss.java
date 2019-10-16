public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0; //variable i assigned to 0
        while(i < amount){ //loops run while i is less than amount
            System.out.print("*"); //prints star
            i++;// increments i by 1
        }
        System.out.println(""); //orints a line break
    }

    public static void printWhitespaces(int amount) {
        int i = 0; //variable i assigned to 0
        while(i < amount){ //loops run while i is less than amount
            System.out.print(" "); //prints white space
            i++; //increments i by 1
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1; //variable i assigned to 1
        while(i <= size){ //loop runs while i is less than or equal to size
          printWhitespaces(size - i); //prints whitespace using size - i
          printStars(i); //prints i amount stars 
          i++; //increments i by 1
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1; //i incremented by 1
        int z = 1; //z incremented by 1
        while(i <= height){ //loop runs while i is less than or equal to height
           printWhitespaces(height - i); //prints white spaces using height - 1
           printStars(z); //prints stars using formula z
           i++; // i increments and number of spaces decrements
           z+=2; // z is incremented by 2
          // z++;
        }
       int s = 0; //s is assigned value 0
       while (s < 2){ //checks if s is less than 2
        printWhitespaces(height - 2); //prints whitepsaces using height - 2
        printStars(3); //prints three stars
        s++; // s is incremented by 1
       }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(1);
        //System.out.println("---");
       // xmasTree(4);
       // System.out.println("---");
       // xmasTree(10);
    }
}
