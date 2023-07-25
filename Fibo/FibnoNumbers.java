package Fibo;


import java.util.Scanner;

public class FibnoNumbers {

    static int a = 0;
    static int b = 1;

    static int getNthNumber(int n){
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return a;
    }


    static int reverseNumber(int n){
        int rev = 0;

        while (n>0){
            rev = rev*10;
            rev += (n%10);
            n = n/10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner I = new Scanner(System.in);
        int n = I.nextInt();
        System.out.println(reverseNumber(n));



    }
}