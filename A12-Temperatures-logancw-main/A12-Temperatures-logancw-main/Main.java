//                      A12 Temperature
//                    Logan Weisgerber
//                       9/23/2023



import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); // Imports Scanner 
    Converter c = new Converter(); // Grabs converter file
    System.out.print("Enter your Celcius Degree: ");

    int firstParam = kb.nextInt(); // sets the int to the first int user enters using Scanner 
    c.fahrenheitConversion(firstParam);
  }
}