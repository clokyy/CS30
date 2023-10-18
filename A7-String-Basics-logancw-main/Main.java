//                              A7 String Basics
//                              Logan Weisgerber
//                                 9/14/2023


class Main {
  public static void main(String[] args) {
    String message1 = "I am very happy!";
    String target1 = "very ";

    String message2 = "That was great - lol.";
    String target2 = "lol";   
    System.out.println(message1.replace(target1, "")); // Uses the .replace function and target to find what word to replace, then replaces it with following characters in the second arguments 
    System.out.println(message2.replace(target2, "laugh out loud"));
  }
}