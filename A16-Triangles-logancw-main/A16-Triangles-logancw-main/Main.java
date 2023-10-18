//                      A16 Triangles
//                    Logan Weisgerber
//                       9/26/2023




import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int a,b,c; // Defines ints 
    
    System.out.print("Please enter the width of your Triangle: ");
    a = kb.nextInt();

    System.out.print("Please enter the length of your Triangle: ");
    b = kb.nextInt();

    System.out.print("Please enter the height of your Triangle: ");
    c = kb.nextInt();

    
    
    Calculations cc = new Calculations(); // Grabs Calculations file
    cc.setSides(a,b,c); // does calculations 
    cc.perimeterCheck(a,b,c);
    cc.calcArea();
    

    cc.print();
  }
}