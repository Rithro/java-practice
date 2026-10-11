import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //HYPOTENUSE c² = a² + b² 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first side of you triangle: ");
        double a = input.nextDouble();

        System.out.println("Enter the second side of your triangle: ");
        double b = input.nextDouble();

        double aSquared = Math.pow(a, 2);
        double bSquared = Math.pow(b, 2);

        double sumOfAb = (aSquared + bSquared);

        double hypotenuse = Math.sqrt(sumOfAb);

        System.out.println("The hypotenuse of your trinagle is: " + hypotenuse + "cm");


        input.close();

    }
}
