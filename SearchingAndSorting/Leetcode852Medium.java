class Leetcode852Medium {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
		int end= arr.length-1;
		while(start<end){
			int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start=mid+1;
            }
		}
        return start;
    }
}
        // int max = 0;
        // int index=0;
        // for(int i=0;i<(arr.length/2)+2;i++){
        //     if(arr[i]<max){
        //         return i-1;
        //     }
        //     else{
        //         max = arr[i];
        //     }
        // }
        // return -1;