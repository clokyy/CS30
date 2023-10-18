
class Questions {

  //This document i wont entirely comment, basically its the same function repeated for every question, the only difference is the math questions requires ints and the string ones don't otherwise every function is the same. 
  
  int score = 4;
  boolean mathCheck1 = false;
  public boolean mathCheck1(int a){
    if(a != 4){
      return mathCheck1 = false;
    }else{
      return mathCheck1 = true;
    }
  }


  boolean mathCheck2 = false;
  public boolean mathCheck2(int a){
    if(a != 15){
      return mathCheck2 = false;
    }else{
      return mathCheck2 = true;
    }
  }


  
  boolean stringCheck = false;
  public boolean stringCheck(String response){
    if(response.equals("regina") || response.equals("Regina")){
      return stringCheck = true;
    }else{
      return stringCheck = false;
    }
  }

  boolean stringCheck2 = false;
  public boolean stringCheck2(String response){
    if(response.equals("ottawa") || response.equals("Ottawa")){
      return stringCheck2 = true;
    }else{
      return stringCheck2 = false;
    }
  }

  public void Mathprint(){
    if(mathCheck1 == true){
      System.out.println("Correct");
      mathCheck1 = true; 
    }else{
      System.out.println("Wrong!");
      score--;
    }
  }

  public void MathPrint2(){
    if(mathCheck2 == true){
      System.out.println("Correct");
      mathCheck2 = false; 
    }else{
      System.out.println("Wrong!");
      score--;
    }
  }

  public void Stringprint(){
     if(stringCheck == true){
      System.out.println("Correct");
    
    }else{
      System.out.println("Wrong!");
      score--; 
    }
  }
  
  public void Stringprint2(){
     if(stringCheck2 == true){
      System.out.println("Correct");
    
    }else{
      System.out.println("Wrong!");
      score--; 
    }


    System.out.println("You\'ve made it to the end! Your score is " + score + "/4");
    
  }
  
}