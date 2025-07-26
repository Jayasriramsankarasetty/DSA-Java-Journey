class Leetcode34Medium {
    public int[] searchRange(int[] nums, int target) {
        int ansi=binaryS(nums,target);
        if(ansi==-1){
            return new int[]{-1,-1};
        }
        int f=ansi;
        int l=ansi;
        while(f>0 && nums[f]==nums[f-1]) f--;
        while(l<nums.length-1 && nums[l]==nums[l+1]) l++;
        return new int[] {f,l};

    }
    static int binaryS(int[] nums,int target){
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}