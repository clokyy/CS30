

public class CalcRunner{
  public static void PerimCalc(int firstParam, int secondParam){
      int length;
      int width; // ints grabbed from the main class. 
      int equation; 

      length = firstParam * 2;
      width = secondParam * 2;
      equation = length + width; // adds length + height 

      System.out.println(firstParam + "*2 + " + width + "*2  = " + equation); // outputs 
      System.out.println("The perimeter of your rectangle is " + equation);
  }

  public static void AreaCircle(int firstParam){
    int radius = firstParam; 
    double Equation = Math.PI * radius * 2; // uses Math.Pi

    System.out.print("The area of your circle is " + Equation + " Original Equation: " + radius + "*2" + "*π");
  }

  public static void SA(int firstParam){
    int length = firstParam;
    int equation = 6 * length * length; // To do surgace area.
    System.out.print("The SA of the CONGRUENT cube is " + equation);
  }
}