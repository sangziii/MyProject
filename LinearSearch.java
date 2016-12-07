package algorithm.search;

public class LinearSearch {
	public int search(int[] data, int k){
		int size = data.length;
		
		for(int i=0; i<size; i++){
			if(data[i] == k)
				return i;
		}
		return -1;
	}
}
