public class CheckSortedArr {
	public static void main(String[] args){
	
		 int[] arr = {1,2,5,10,12};
		System.out.println(sortedArr(arr,0));

	}
	
	static boolean sortedArr(int[] arr, int i){
			if(i == arr.length-1){
				return true;
			}
			if(arr[i]>arr[i+1]){
				return false;
			}
			return sortedArr(arr,i+1);
	}
}