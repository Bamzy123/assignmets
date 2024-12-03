import java.util.Scanner;
public class Bmi{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter weight in pounds: ");
  double pound = input.nextDouble();

  System.out.print("Enter height in inches: ");
  double inches = input.nextDouble();

  double kilogram = pound * 0.45359237;
  double meter = inches * 0.0254;

  double bmi = kilogram / (meter * meter);
  
  System.out.printf("The Bmi is %.4f", bmi);
  }
}