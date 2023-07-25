package DSA.BestTimeToBuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class BTB {

    static int getMaxProfit(int a[]){

        ArrayList<Integer> min = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if(a[i] < a[j]){
                    min.add(a[j]-a[i]);
                }

            }
        };


        System.out.println(min);

        return 0;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
    }
}
