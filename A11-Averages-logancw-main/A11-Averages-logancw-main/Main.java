//                      A11 Average
//                    Logan Weisgerber
//                       9/22/2023
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter your first integer: ");
    double firstParam = kb.nextDouble(); // Gives the param to the AveragerRunner class to be averaged.

    System.out.print("Enter your second integer: ");
    double secondParam = kb.nextDouble();

    AverageRunner ar = new AverageRunner();
    ar.averageSum(firstParam, secondParam); // Sends parameters to the AverageRunner class.
  }
}