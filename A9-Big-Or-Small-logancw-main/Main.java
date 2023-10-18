//                             A9 Big or Small
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

    
    
    rc.Check(firstParam, secondParam); // checks whether the first param is greater than the second param by grabbing its values and sending it to RunnerClass
    if(rc.Check(firstParam, secondParam) == 1){ // Checks if the return value is one if so the first param is greater than the second one. 
      System.out.print(firstParam + " is greater than " + secondParam);
    }else{
     System.out.print(firstParam + " is less than " + secondParam);
    }
    
    

  
  }


}