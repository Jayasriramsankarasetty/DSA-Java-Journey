public class Leetcode1390Medium {
	public static void main (String[] args)
	{
		// your code goes here
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumFourDivisors(nums));
	}
    public static int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        int totalsum = 0;
        for(int i=0;i<n;i++){
            count=2;
            sum = 1 + nums[i];
            for(int j=2;j<nums[i]/2;j++){
                if(nums[i]%j==0){
                    count++;
                    sum= sum + j;
                }
            }
            if(count==4){
                totalsum += sum;
            }
        }
        return totalsum;
    }
}