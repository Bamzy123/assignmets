import java.util.Scanner;
public class Sum{
 public static void main(String[] args){

    Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int firstNumber = input.nextInt();

System.out.print("Enter second number: ");
double secondNumber = input.nextDouble();

System.out.print("Enter three number: ");
float threeNumber = input.nextFloat();


double result = firstNumber + secondNumber + threeNumber;

System.out.print(result);
  }
}