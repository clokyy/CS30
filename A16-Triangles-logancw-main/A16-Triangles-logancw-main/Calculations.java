import java.lang.Math.*;

class Calculations{
  private int sideA, sideB, sideC; 
  public double perimeter;
  public double area; 


  public void setSides(int a, int b, int c){
    sideA = a; // Sets the ints defined in main to the ints defined in this class. 
    sideB = b;
    sideC = c;
  }

  public double perimeterCheck(int a, int b, int c){
    perimeter = a + b + c; 
    
    return perimeter; 
  }

  public double calcArea(){
    double s;
    s = perimeter / 2.0; 
    double area1 = s - sideA; // Subtracts to get the area. 
    double area2 = s - sideB; 
    double area3 = s - sideC; 
  
    area = Math.sqrt(s * area1 * area2 * area3);
    // double areaRounded = area * 100;

    return area; 
  }

  public void print(){ // prints the area rounded to one / no decimal lpace 
    System.out.println(perimeter);
    double roundedArea = area * 100;
    System.out.println(Math.round(roundedArea / 100));
  }
}