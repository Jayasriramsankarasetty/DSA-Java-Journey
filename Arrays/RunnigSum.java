class RunnigSum {
    public int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
//1480. Running Sum of 1d Array
//leetcode-easy