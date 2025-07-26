import java.util.*;
public class BinarySearch {
	public static void main(String[] args){
		int[] arr = {49,33,25,16,9,2,-1,-3};
		int target= 25;
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr,int target){
		int start =0;
		int end= arr.length-1;
        	boolean order = arr[start]<arr[end];
		while(start<=end){
			int mid = start + (end-start) / 2;
            		if(order){
                		if(target < arr[mid]){
                    			end = mid-1;
                
               			}
                		else if(target > arr[mid]){
                    			start = mid+1;
                		}else{
                    			return mid;
                		}
			}
            		else{
                 		if(target > arr[mid]){
                    			end = mid-1;
                
                		}
                		else if(target < arr[mid]){
                    			start = mid+1;
                		}else{
                    			return mid;
                		}
            		}
		}

		return -1;
	}

}