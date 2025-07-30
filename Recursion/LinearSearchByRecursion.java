public class LinearSearchByRecursion {
	public static void main(String[] args){
	
		 int[] arr = {3,2,1,18,10,34,9};
		System.out.println(search(arr,0,9));
	}
	
	static boolean search(int[] arr, int i,int target){
			if(i == arr.length){
				return false;
			}
			return arr[i]==target || search(arr,i+1,target);
	}
}