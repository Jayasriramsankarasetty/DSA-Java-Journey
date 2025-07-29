class Leetcode2411Medium {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] lastSeen = new int[32];
        for (int i = 0; i < 32; i++) {
            lastSeen[i] = -1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int b = 0; b < 32; b++) {
                if (((nums[i] >> b) & 1) == 1) {
                    lastSeen[b] = i;
                }
            }

            int maxReach = i;
            for (int b = 0; b < 32; b++) {
                if (lastSeen[b] != -1) {
                    maxReach = Math.max(maxReach, lastSeen[b]);
                }
            }

            ans[i] = maxReach - i + 1;
        }

        return ans;
    }
}
