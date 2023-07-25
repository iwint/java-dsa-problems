import java.util.*;

public class FIndFirstAndLastOccurances{
  public static void main(String a[]){
    int[] arr = {1,4,5,5,5,6,7,8,8};
    int target = 8;
    int[] positions = findPositions(arr,target);
    System.out.print(Arrays.toString(positions)); 
  }
  
   static int[] findPositions(int[] nums , int target){
      int[] positions = {-1,-1};
      positions[0]=findIndexOfTarget(nums,target,true);
      positions[1]=findIndexOfTarget(nums,target,false);
      return positions;
   }

   static int findIndexOfTarget(int[] nums ,int target ,boolean isToFindStart ){
              
   int start = 0;
   int end = nums.length -1;
   int answer = -1;
   
   while(start <= end){

    int mid = (start) + (end - start)/2;

    if(target > nums[mid]){
      start = mid+1;
    }else if(target < nums[mid]){
      end = mid - 1;
    }else{
      answer = mid;
      if(isToFindStart){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }   
   }

   return answer;

   }

  

}