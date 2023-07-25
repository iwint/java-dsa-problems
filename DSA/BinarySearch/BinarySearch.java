
public class BinarySearch{
  
  

  public static void main(String a[]){

    int[] arr = {8,9,7,5,4,2,1};
    int target = 2;
    int index = OrderAgnosticSearch(arr,target);
    System.out.print(index == -1 ? "NOT EXIST" : index);
  }


  static int Search(int[] arr , int target){
      int start = 0;
      int end = arr.length-1;

      while(start <= end){
        int mid = (start)+(end-start)/2;
        if(target < arr[mid]){
          end = mid-1;
        }else if(target > arr[mid]){
          start = mid+1;
        }else{
          return mid;
        }
      }

      return -1;
    
  }


  static int OrderAgnosticSearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    boolean isAscending = arr[start] < arr[end];

    while(start <= end){

      int mid = (start) + (end - start) / 2 ;

      if(target == arr[mid]){
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

    return -1;

  }
}