import java.util.Scanner;
public class Sample{
public static void main(String[] args){

   Scanner input = new Scanner(System.in);

   System.out.print("Enter a number: ");
   int num = input.nextInt();

   if (num % 2 == 0){
    System.out.print(1);
      }
  else
   System.out.print(0);
   }
}