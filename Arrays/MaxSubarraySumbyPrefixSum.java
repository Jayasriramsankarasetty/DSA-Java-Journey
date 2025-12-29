class Main {
    public static void main(String[] args) {
        int[] arr =  {1,4,2,-3,4};
        System.out.println("Max:"+MaxSubArray(arr));
    }
    public static int MaxSubArray(int[] arr){
        int curSum=0;
        int maxSum = 0;
        int[] prefix = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                curSum = (start == 0) ? prefix[end] : prefix[end]-prefix[start-1];
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
            
        }
        return maxSum;
    }
}