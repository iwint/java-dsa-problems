package Palindrome;

import java.util.Scanner;

public class palindrome {
  public static boolean checkPalindrome(String Str) {
    String rev = "";
    boolean Ans = false;

    for (int i = Str.length() - 1; i >= 0; i--) {
      rev = rev + Str.charAt(i);
    }
    System.out.println(rev);

    if (Str.equals(rev)) {
      Ans = true;
    }
    return Ans;

  }

  public static void main(String args[]) {

    Scanner getString = new Scanner(System.in);
    System.out.print("Enter a string :");
    String Str = getString.next();
    Str = Str.toLowerCase();
    boolean A = checkPalindrome(Str);
    System.out.println(A);
    getString.close();

  }

static void convertToCapital(){
    
}



}



