import java.util.Scanner;

public class CompoundInterestCalculator {

    public static double calculateCompoundInterest(double principal, double monthlyContribution, double annualRate, int years, int compoundingFrequency) {

        double ratePerPeriod = annualRate / 100 / compoundingFrequency;
        int totalPeriods = years * compoundingFrequency;


        double compoundPrincipal = principal * Math.pow(1 + ratePerPeriod, totalPeriods);

        double compoundContributions = monthlyContribution * (Math.pow(1 + ratePerPeriod, totalPeriods) - 1) / ratePerPeriod;

        return compoundPrincipal + compoundContributions;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial payment: ");
        double initialInvestment = sc.nextDouble();

        System.out.println("Enter monthly investment: ");
        double monthlyContribution = sc.nextDouble();

        System.out.println("Enter annual rate: ");
        double annualRate = sc.nextDouble();

        System.out.println("Enter years: ");
        int years = sc.nextInt();

        System.out.println("Enter compounding frequency: ");
        int compoundingFrequency = sc.nextInt();

        double finalAmount = calculateCompoundInterest(initialInvestment, monthlyContribution, annualRate, years, compoundingFrequency);

        System.out.printf("Final Amount after %d years: $%.2f\n", years, finalAmount);
    }
}