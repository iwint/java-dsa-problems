public class CeilingOfNumber{
   public static void main(String a[]){
    int[] arr = {1,3,4,6,8};
    int target = 2;
    int ceil = Ceil(arr,target);
    int floor = Floor(arr,target);
    System.out.print(
      "Ceil : " + arr[ceil] + "\n" + "Floor : " + arr[floor] 
    );
   }

   static int Ceil(int[] arr , int target){
    int start = 0;
    int end = arr.length-1;
    boolean isAscending = arr[start] < arr[end];

    while(start <= end){
      int mid = (start) + (end - start) / 2 ;
      if(arr[mid] == target ){
        return mid;
      }
      if(isAscending){
         if(target < arr[mid]){
            end = mid-1;
         }else {
            start = mid + 1;
         }
      }else{
        if(target > arr[mid]){
            end = mid-1;
        }else{
            start = mid + 1;
        }
      }
    }
    return start;
   }

   static int Floor(int[] arr , int target){
    int start = 0;
    int end = arr.length-1;
    boolean isAscending = arr[start] < arr[end];

    while(start <= end){

      int mid = (start) + (end - start) / 2 ;

      if(arr[mid] == target ){
        return mid;
      }

      if(isAscending){
         if(target < arr[mid]){
            end = mid-1;
         }else {
            start = mid + 1;
         }
      }else{
        if(target > arr[mid]){
            end = mid-1;
        }else{
            start = mid + 1;
        }
      }

    }

    return end;
   }


}