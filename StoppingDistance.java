import java.util.Scanner;

public class Main{
  public static void main (String[] args) {

  Scanner input = new Scanner(System.in);

  double frictionDry = 0.7;
  double frictionWet = 0.4;
  double frictionIce = 0.1;

  System.out.println("What is the speed you are travelling at (in km/h)? ");
  double speed = input.nextDouble();

  System.out.println("Enter your reaction time (in seconds): ");
  double reactionTime = input.nextDouble();

  System.out.println("What where the road conditions (i.e. Dry, Wet, or Ice)? ");
  String roadCondition = input.next();

  double firstPartOfEquation = ((speed / 3.6) * reactionTime);
  double stoppingDistance = 0;

  if (roadCondition.equalsIgnoreCase("Dry")) {
   stoppingDistance =  (firstPartOfEquation) + (Math.pow(speed, 2) / (254 * frictionDry));
  } 
  else if (roadCondition.equalsIgnoreCase("Wet")) {
   stoppingDistance =  (firstPartOfEquation) + (Math.pow(speed, 2) / (254 * frictionWet));
  }
  else if (roadCondition.equalsIgnoreCase("Ice")) {
   stoppingDistance =  (firstPartOfEquation) + (Math.pow(speed, 2) / (254 * frictionIce));
  }
  
  
  System.out.printf("For a car going at %.2f km/h, " +   
  " with the driver having a reaction time of %.2f s " +
  " and the condition outside is %s, " + 
  " then the stopping distance would be %.2f m ", speed, reactionTime, roadCondition, stoppingDistance );

  input.close();

} 

  }
