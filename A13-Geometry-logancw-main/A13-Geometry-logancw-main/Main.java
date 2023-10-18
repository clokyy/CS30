//                      A13 Geometry
//                    Logan Weisgerber
//                       9/24/2023

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    int firstParam, secondParam;
    CalcRunner pm = new CalcRunner(); // Grabs the runner class

    int selection; // Select what you would like to calculate
    System.out.print("What would you like to do? [1] SA of a Cube, [2] Area of a Circle, [3] Perimeter of a Rectangle: ");
    selection = kb.nextInt();

    if(selection == 3){ // checks what the user submitted. 
      
      System.out.print("What is the length of your rectangle?");
      firstParam = kb.nextInt(); // Grabs the ints for the equations. 
      System.out.print("What is the width of your rectangle?: ");
      secondParam = kb.nextInt();


      pm.PerimCalc(firstParam, secondParam);
    }else if(selection == 2){
      System.out.print("What is the radius of your circle?: ");
      firstParam = kb.nextInt();
      pm.AreaCircle(firstParam); // Runs the function in the CalcRunner class. 
    }else if(selection == 1){
      System.out.print("What is the length of one side of your CONGRUENT cube.: ");
      firstParam = kb.nextInt();
      pm.SA(firstParam);
    }
  }
}