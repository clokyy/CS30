//                             A8 Input Basics
//                             Logan Weisgerber
//                                9/15/2023


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); // Grabs the scanner java library 
    int FirstInt, SecondInt; // Defines the int variables
    System.out.print("Enter an Integer: ");
    FirstInt = keyboard.nextInt(); // GIves int variables and assignment

    System.out.print("Enter another Integer: ");
    SecondInt = keyboard.nextInt();

    int Equation; 
    Equation = FirstInt + SecondInt; // Gives an equation which will out put as a integer

    System.out.println("The answer to your equation is " + Equation);

    // Doubles 
    // Code is the same as integer but instead using doubles ex 1.1, 1.0
    double FirstDouble, SecondDouble; 
    System.out.print("Enter a double (ex 1.0, 2.0): ");
    FirstDouble = keyboard.nextDouble();

    System.out.print("Enter another double: ");
    SecondDouble = keyboard.nextDouble();

    double DoubleEquation; 
    DoubleEquation = FirstDouble + SecondDouble; 

    System.out.print("The answer to your equation is: " + DoubleEquation);
    

  }
}