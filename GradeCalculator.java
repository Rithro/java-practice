import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.println("Enter your mark as a whole number: ");
  int mark = input.nextInt();

    if (mark >= 0 && mark <= 29) {
        System.out.println(" CONGRATULATIONS! You got a H8 you dumbass! ");
    } 

    if (mark >= 30 && mark <= 39) {
        System.out.println("Ok u got a H7, i mean its alright? ");
    }

        if (mark >= 40 && mark <= 49) {
        System.out.println("Ok u got a H6, i mean its alright? ");
    }

        if (mark >= 50 && mark <= 59) {
        System.out.println("Ok u got a H5, i mean its alright? ");
    }

    if (mark >= 60 && mark <= 69) {
        System.out.println("Ok u got a H4, i mean its alright? ");
    }

        if (mark >= 70 && mark <= 79) {
        System.out.println("Ok u got a H3, i mean its alright? ");
    }

        if (mark >= 80 && mark <= 89) {
        System.out.println("Ok u got a H2, i mean its alright? ");
    }

        if (mark >= 90 && mark <= 100) {
        System.out.println("Ok u got a H1, i mean its alright? ");
    }

  input.close();
    }
}
