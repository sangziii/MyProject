package algorithm.Sort.insertionSort;

public class InsertSort {
	public void Sort(int[] data){
		int size = data.length;
		
		for(int i=1; i<size; i++){
			int key = data[i];
			int k = i-1;
			while(k>=0 && data[k] > key){
				data[k+1] = data[k];
				k--;
			}
			data[k+1] = key;
		}
	}
}
