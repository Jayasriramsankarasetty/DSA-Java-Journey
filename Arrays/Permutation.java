public class Permutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
//1920. Build Array from Permutation
//leetcode easy
