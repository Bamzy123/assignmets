import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
       
        do {
            System.out.println("Enter a positive number: ");
            number = input.nextInt();

         
            if (number <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while (number <= 0);

        System.out.println("You entered: " + number);
    }
}
