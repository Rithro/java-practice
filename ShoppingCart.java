import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("What item would you like to buy? ");
    String item = input.next();

    System.out.println("What is the price for each? ");
    double price = input.nextDouble();

    System.out.println("How many would you like? ");
    int quantity = input.nextInt();

    double total = (price * quantity);

    System.out.println("You have bought " + quantity + " " + item + "/s");
    System.out.println("Your total is £" + total);
    

    
        input.close();

    }
}
