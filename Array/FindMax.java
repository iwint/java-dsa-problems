import java.util.*;

public class FindMax{
  public static void main(String a[]){
    Scanner I = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    System.out.println("Max : " + findMax(arr));
  }

  static int findMax(int arr[]){
     int max=0;
     for(int num : arr){
        if(max < num){
          max = num;
        }
     }
     return max;
  }
} 