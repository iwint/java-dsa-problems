package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TWODArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        HashSet<Character> set  = new HashSet<>();

        Scanner I = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = I.nextInt();
            }
        }
        //METHOD 1
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b +" ");
            }
            System.out.println();
        }

        //METHOD 2
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
