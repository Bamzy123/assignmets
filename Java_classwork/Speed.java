import java.util.Scanner;
public class Speed{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter take off speed in meter/sec: ");
  double speed = input.nextDouble();
 
  System.out.print("Enter acceleration: ");
  double velocity = input.nextDouble();

  double energy = speed * speed / 2 * velocity; 

  System.out.print(energy);
  }
}