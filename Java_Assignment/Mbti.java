import java.util.Arrays;
import java.util.Scanner;

public class Mbti {

    public static void main(String... args) {
        // Create a scanner for user input
        Scanner input = new Scanner(System.in);

        // Ask for the user's name
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        // Greet the user
        System.out.println("Hello " + name + ", follow the MBTI test to get your desired result.");

        // Array for storing the answers (for example, these can be score arrays)
        int[] a = new int[4];  // Example size (you can adjust this)
        int[] b = new int[4];  // Example size (you can adjust this)

        // Define the questions for the MBTI test
        String[][] question = {
            {"A. Expend energy, enjoy groups", "B. Conserve energy, enjoy one-on-one"},
            {"A. Interpret literally", "B. Look for meaning and possibilities"}
            // Add more questions here if needed
        };

        // Loop through the questions and prompt the user
        for (int option = 0; option < question.length; option++) {
            System.out.println("Question " + (option + 1) + ":");
            System.out.println(question[option][0][1]);
            //System.out.println(question[option][1]);

            // Get user's answer (A or B)
            System.out.print("Please enter A or B: ");
            String answer = input.nextLine().toUpperCase();

            // Handle the answer (in this case, increment corresponding arrays a or b)
            if (answer.equals("A")) {
                a[option]++;  // Increment the score for A
            } else if (answer.equals("B")) {
                b[option]++;  // Increment the score for B
            } else {
                System.out.println("Invalid input, please enter A or B.");
                option--;  // Repeat the same question
            }
        }

        // Output the final results (just an example of showing scores)
        System.out.println("\nYour results:");
        System.out.println("A Scores: " + Arrays.toString(a));
        System.out.println("B Scores: " + Arrays.toString(b));

        // Example: You could analyze scores here to determine MBTI result
        // For now, just printing the results
    }
}
