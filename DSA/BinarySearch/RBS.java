package DSA.BinarySearch;

public class RBS {
    public static void main(String[] args) {
      int[] arr = {4,5,6,7,0,1,2,3};

        System.out.println(findNum(arr,6));

    }

    static int findNum(int[] nums,int target){
        int pivot = findPivot(nums);
        if(pivot==-1){
            return -1;
        }

        if(target == nums[pivot]){
            return pivot;
        }

        if(target < nums[0]){
            return Search(nums,target,pivot+1,nums.length-1);
        }else{
            return Search(nums,target,0,pivot-1);
        }
    }
    static  int Search(int[] nums, int target , int start , int end){

        while (start <=end){
            int mid = start + (end -start)/2;

            if(target > nums[mid]){
                start = mid+1;
            } else if (target<nums[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int nums[]){
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            //CASE -1
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            //CASE -2
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            //CASE -3
            if(nums[start]>nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }



        }

        return -1;

    }



}
