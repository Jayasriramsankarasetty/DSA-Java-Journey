import java.util.*;
public class CeilingElement {
	public static void main(String[] args){
		int[] arr = {2,3,5,9,14,16,18,20,23,32,45,50};
		int target= 22;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr,int target){
		int start =0;
		int end= arr.length-1;
        	boolean order = arr[start]<arr[end];
		while(start<=end){
			int mid = start + (end-start) / 2;
                		if(target < arr[mid]){
                    			end = mid-1;
                
               			}
                		else if(target > arr[mid]){
                    			start = mid+1;
                		}else{
                    			return arr[mid];
                		}		
		}
		return arr[end];
	}

}