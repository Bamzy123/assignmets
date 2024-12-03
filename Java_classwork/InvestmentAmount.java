import java.util.Scanner;
public class InvestmentAmount{
   public static void main(String[] args){

   Scanner input = new Scanner(System.in);

   System.out.print("Enter investment amount: ");
   double investment = input.nextDouble(); 

   System.out.print("Enter annual interest rate: ");
   double interestRate = input.nextDouble(); 

   System.out.print("Enter number of years: ");
   double years = input.nextDouble();

   double monthlyInterestRate = interestRate / 100; 

   double futureInvestment = investment * Math.pow((1 + monthlyInterestRate), years);

   System.out.printf("The future investment is %.2f", futureInvestment);
   }

}