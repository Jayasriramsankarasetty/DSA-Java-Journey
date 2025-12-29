public class Leetcode3583Medium {
    public static int specialTriplets(int[] nums) {
        int count=0;
        boolean prefreq= false;
        for(int i=1;i<nums.length-1;i++){
            int k = i-1;
            while(k>=0){
                if(nums[k]==nums[i]*2){
                    prefreq = true;
                }
                else{
                    prefreq = false;
                }
                k--;
            }
            int j=i+1;
            while(j<nums.length){
                if(prefreq == true){
                    if(nums[j]==nums[i]*2){
                        count++;
                    }
                }
                else{
                    break;
                }
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Leetcode3583Medium obj = new Leetcode3583Medium();
        int[] nums = {56,56,87,28,55,56,94};
        System.out.println(specialTriplets(nums));
    }
}