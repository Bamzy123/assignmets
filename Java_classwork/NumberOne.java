import java.util.Scanner;

public class NumberOne {
    public static void main(String... args) {
  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        for (int digit = 1; digit <= number; digit++) {
            for (int count = 1; count <= digit; count++) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
        
        for (int digit = number; digit >= 1; digit--) {
            for (int count = 1; count <= digit; count++) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
