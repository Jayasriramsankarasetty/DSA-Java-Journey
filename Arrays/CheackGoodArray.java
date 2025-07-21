class CheackGoodArray {
    public boolean isGoodArray(int[] nums) {
        int currentGCD = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentGCD = gcd(currentGCD, nums[i]);
        }
        return currentGCD == 1;
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
//1250. Cheack If It Is a Good Array
//Leetcode-Hard