package DSA.SlidingWindow;

class MaxSumOfSubArray {

    private int k = 0;
    private int[] nums = new int[0];

    public MaxSumOfSubArray(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }

    public int getMaxSumUsingBruteForceMethod() {

        if (k == 0 || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxSum = Integer.MIN_VALUE;

        return 0;
    }

}

class Main {
    public static void main(String[] args) {
        MaxSumOfSubArray maxSumOfSubArray = new MaxSumOfSubArray(4, new int[] { 1, 2, 3 });
        int result = maxSumOfSubArray.getMaxSumUsingBruteForceMethod();
        System.out.println(result);
    }
}