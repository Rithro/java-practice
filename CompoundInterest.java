import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

      Scanner input = new Scanner(System.in);

    System.out.println("Enter the principal amount of your deposit: ");
    double principalAmount = input.nextDouble();

    System.out.println("Enter the annual interest rate (as a decimal e.g. 0.05): ");
    double interest = input.nextDouble();

    System.out.println("Enter the number of times compounded per year: ");
    int compoundedTimes = input.nextInt();

    System.out.println("Enter the number of years you will be leaving this money to compound: ");
    int years = input.nextInt();

    char currency = '£';

    double yearsAndCompoundedTimes = (years * compoundedTimes);
    double finalAmount = principalAmount * Math.pow((1 + (interest / compoundedTimes)), yearsAndCompoundedTimes);

    System.out.printf("The final amount after %d years is %c%.2f%n", years, currency, finalAmount);


    input.close();

    }
}


