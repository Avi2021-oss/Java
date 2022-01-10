package binarysearch;

public class Modifiedbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 30};
		int target = 15;
		int ans = modibinarysearch(arr, target);
		System.out.println(ans);

	}
	
	static int modibinarysearch(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		
		//find whether the array is sorted in ascending or descending order
		boolean isAsc;
		if(arr[start] < arr[end]) {
			isAsc = true;
		} else {
			isAsc = false;
		}
		
		while(start<=end)
		{
			//find the middle element
			//int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range in java
			
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target ) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid - 1;
				} else if(target > arr[mid]) {
					start = mid + 1;
			}
			
			} else {
				if(target > arr[mid]) {
					end = mid - 1;
				} else if(target < arr[mid]) {
					start = mid + 1;
				}
			}	
		}
		return -1;
	}
}