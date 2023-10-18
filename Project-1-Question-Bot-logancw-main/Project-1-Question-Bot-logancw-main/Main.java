//                     Proj 1 Question Bot
//                    Logan Weisgerber
//                       10/11/2023

import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); // Grabs scanner
    System.out.println("Welcome to Question Bot! Press [1] to continue!"); // Welcome screen
    int selection = kb.nextInt(); // Selection integer
    if(selection == 1){

      Questions q = new Questions();
      
      int mathResponse; // Mathresponse for math questions
      String response;  // String response for string reponse questions
 
      System.out.println("What is 2 + 2?"); // Asks question
      mathResponse = kb.nextInt(); // gets user input
      q.mathCheck1(mathResponse); // checks the response
      q.Mathprint(); // prints whether it is correct or not.

      System.out.println("What is the capital of Saskatcthewan?");
      response = kb.next();
      q.stringCheck(response);
      q.Stringprint();

      System.out.println("What is 5 * 3?");
      mathResponse = kb.nextInt();
      q.mathCheck2(mathResponse);
      q.MathPrint2();

      System.out.println("What is the capital of Canada?");
      response = kb.next();
      q.stringCheck2(response);
      q.Stringprint2();
      
    }else{
      System.out.println("Goodbye! See you soon!:(");
    }
  }
}