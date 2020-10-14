import java.util.Scanner;

/**
 *
 * @author andrew kamal
 */
// prints balck then when acording to the number
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // setting up the sacnner

    System.out.println("please enter a number");// user input
    int num = input.nextInt();           // stores user input
    int counter = num;          // decalre varbile to help print black and white 

    int i; // decalre varbile 
    for (i = 0; i < num; i++) { //
      if (counter % 2 == 1) // dived by to to see if it odd
      {
        System.out.print("black,");
      } else {
        System.out.print("white,"); // if its not then print white
      }
      counter--; // subatrcing one evrtime until it runs out till 0 and then the loop stops
    }

  }
}
