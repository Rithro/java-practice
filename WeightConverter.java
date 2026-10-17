import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    
   Scanner input = new Scanner(System.in);
   
   // kg = lbs / 2.20462
   // lbs = kg * 2.20462

    System.out.println("Weight Conversion Program (Choose option 1 or 2)\n");
    System.out.println("1: Convert lbs to kg");
    System.out.println("2: Convert kg to lbs\n");

    System.out.println("Choose an option: ");
    int option = input.nextInt();

    if (option == 1) 
    {
      System.out.println("Enter the weight in lbs: ");
      double lbs = input.nextDouble();

      double kg;
      kg = (lbs / 2.20462);
      System.out.printf("The new weight in kg is: %.2f", kg);
    } 
    else if (option == 2)
    {
      System.out.println("Enter the weight in kg: ");
      double kg = input.nextDouble();

      double lbs;
      lbs = kg * 2.20462;      
      System.out.printf("The new weight in lbs is: %.2f", lbs);      
    }
    else 
    {
      System.out.println("Invalid option selected. Please run the program again and select 1 or 2.");
    }


  
  input.close();

    }
}
