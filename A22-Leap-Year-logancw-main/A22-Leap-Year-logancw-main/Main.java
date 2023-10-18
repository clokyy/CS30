//                      A22 Leap Year
//                    Logan Weisgerber
//                       10/5/2023


import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
   Scanner kb = new Scanner(System.in); // grabs scanner 

    int a;

    System.out.println("Enter your first Integer: ");
    a = kb.nextInt(); // sets int values to Scanner values

    LeapYear lp = new LeapYear(); // Grabs LeapYear Class
    lp.checkLeap(a);
    lp.print();
  }
}