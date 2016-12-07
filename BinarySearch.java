package algorithm.search;

public class BinarySearch {
	public int search(int[] data, int low, int high, int k){
		int mid = (low+high)/2;
		
		while(low <= high){
			if(k==data[mid])
				return mid;
			else if(k<data[mid]){ 
				high = mid-1;
			} else if(k>data[mid])
				low = mid+1;
		}
		return -1;
	}
}
