package algorithm.Sort.selectionSort;

public class SelectionSort {
	public void Sort(int[] data){
		int size = data.length;
		int temp, min;
		
		for(int i=0; i<size-1; i++){
			min = i;
			for(int k=i+1; k<size; k++){
				if(data[min] > data[k]){
					min = k;
				}
			}
			if(min != i){
				temp = data[min];
				data[min] = data[i];
				data[i] = temp;
			}
		}
	}
}
