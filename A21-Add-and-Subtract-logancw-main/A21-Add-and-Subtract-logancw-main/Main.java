//                      A21 Triangles
//                    Logan Weisgerber
//                       10/5/2023

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); // grabs scanner 

    int a,b;

    System.out.println("Enter your first Integer: ");
    a = kb.nextInt(); // sets int values to Scanner values
    System.out.println("Enter your second Integer: ");
    b = kb.nextInt();

    AddSubb as = new AddSubb(); //Grabs AddSubb class 
    as.checkParam(a, b); // checks the params
  }
}