class Leetcode3432Easy {
    public static int countPartitions(int[] nums) {
        int n = nums.length;
        int right=0;
        int left =0;
        int count = 0 ;
        for (int i=0;i<n-1;i++){
            right+=nums[i];
            for(int j=i+1;j<n;j++){
                left += nums[j];
            }
            if((right-left)%2==0){
                count++;
            }
            left=0;

        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }
}