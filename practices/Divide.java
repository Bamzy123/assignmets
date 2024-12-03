import java.util.Scanner;
public class Divide{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter number: ");
  int number = input.nextInt();

  int number_one = 3;

  if (number % 3 == 0){
      System.out.printf("%d", "This number is divisible by three");
      }
  else
      System.out.print("not divisible by three");
   }
}