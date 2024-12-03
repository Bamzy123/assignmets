import java.util.Scanner;
public class PoundConversion{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter number of pound: ");
  double pound = input.nextDouble();

  double kilogram = pound * 0.454;

  System.out.printf("the kilogram is %s", kilogram);
  }
}