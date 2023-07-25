package DSA;
import java.util.Scanner;

class Palindrome{
    String reversed = "";
    String word;
    Palindrome(String word){
        this.word = word.toLowerCase();
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
    }


    boolean isPalindrome(){
        if(word.equals(reversed)){
            return true;
        }else {
            return  false;
        }
    }

}



public class DSAMain {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        Palindrome palindrome = new Palindrome(I.next());
        String result = palindrome.isPalindrome() ? "Given String is Palindrome" : "Given String is not a Palindorme";
        System.out.println(result);
    }
}
