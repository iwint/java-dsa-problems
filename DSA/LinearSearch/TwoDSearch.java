
public class TwoDSearch{
  public static void main (String[] a){
    int[][] arr = {
      {1,2,3,5},
      {24,52,12},
      {0,44}
    };
    int target = 52;
    System.out.print(Search(arr , target));
  }

static boolean Search ( int arr[][] ,int target )
{
  for(int[] nums : arr ){
    for(int num : nums){
      if(num == target){
        return true;     
      }
    }
  }

  return false;
}


}