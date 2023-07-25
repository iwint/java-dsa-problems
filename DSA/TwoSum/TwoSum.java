package DSA.TwoSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    static String getIndex(int a[], int target){
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {  // [0]

            for (int j = i+1; j < a.length ; j++) {

                if(a[i]+a[j] == target){
                    arr.add(i);
                    arr.add(j);
                }
            }

        }


        return arr.toString();
    }


    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int[] arr = {2,11,15,7};
        int target = 9;
        System.out.println(getIndex(arr,target));
    }
}


/* */
/*/**/ */
