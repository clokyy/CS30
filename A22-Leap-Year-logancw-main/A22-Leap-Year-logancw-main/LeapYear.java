class LeapYear {

  int check; // global variable that is used in the print function. 
  boolean checkLeap = false;
  public boolean checkLeap(int a){
   check = a; 
   int mod_check = a % 4; // does the modulus calculation
   // System.out.println(mod_check);
   if(mod_check == 0){ // checks if the modulus remainder is 0, if it is that means 4 is divisible making it a leap year. 
     return checkLeap = true; // sets bool true
   }else{
     return checkLeap = false; // sets false if its not a leap year
   }
  }

  public void print(){
    if(checkLeap == true){
      System.out.println(check + " is a leap year");
    }else{
      System.out.println(check + " is not a leap year.");
    }
  }
}