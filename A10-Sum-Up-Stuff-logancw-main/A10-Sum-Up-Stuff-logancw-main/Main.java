//                             A10 Sum Up Stuff
//                             Logan Weisgerber
//                                9/20/2023



import java.util.Scanner;

class Main {
 
  
  public static void main(String[] args) {
    int firstParam, secondParam; // define our ints
    
    RunnerClass rc = new RunnerClass(); // grab the functions from the runner classs
    Scanner keyboard = new Scanner(System.in); // Scanner 
    System.out.print("Enter your first int: ");
    firstParam = keyboard.nextInt();
    System.out.print("Enter your second int: ");
    secondParam = keyboard.nextInt();

    
    
    rc.sum(firstParam, secondParam);

    
    

  
  }


}