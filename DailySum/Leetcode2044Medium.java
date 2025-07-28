class Leetcode2044Medium {
    public int countMaxOrSubsets(int[] nums) {
        int max_or = 0;
        for(int num : nums){
            max_or |= num;
        }
        int count = 0;
        int n=nums.length;
        for (int i = 1; i < (1 << n); i++) {
            int currentOr = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentOr |= nums[j];
                }
            }
            if (currentOr == max_or) {
                count++;
            }
        }
        return count;
    }
}