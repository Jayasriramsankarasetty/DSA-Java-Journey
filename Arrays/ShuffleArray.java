class  ShuffleArray{
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i=0;i<n;i++){
            ans[2*i] = nums[i];
            ans[2*i+1]= nums[n+i];
        }
        return ans;
    }
}
//1470. ShuffleArray
//Leetcode-easy