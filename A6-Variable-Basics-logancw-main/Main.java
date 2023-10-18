//                                    A6 Variable Basics
//                                     Logan Weisgerber
//                                        9/12/2023

// A program to check how many chicken wings you can buy with a certain amount of money. 

class Main {
  public static void main(String[] args) {
    // System.out.println("Te\nSt"); 
    // System.out.println("Te\bSt"); 

   double avail_money = 4.75; // Defines how much money we have to start with 
   double chicken_wing_price = 0.75; // Defines how much each chicken wing is 
   double chicken_wings = avail_money / chicken_wing_price; // We divide the two variables together 
   System.out.print("You were able to purchase " +  Math.round(chicken_wings) + " chicken wings!!!"); // With Math.round() it will find the closest integer to round up to.
  }
}