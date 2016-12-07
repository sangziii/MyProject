package algorithm.Sort.bubbleSort;

public class BubbleSort {
	public void bubbleSort(int[] data){
		int temp;
		int size = data.length;
		
		for(int i=0; i<size-1; i++){
			for(int k=0; k<(size-1)-i; k++){
				if(data[k] > data[k+1]){
					temp = data[k];
					data[k] = data[k+1];
					data[k+1] = temp;
				}
			}
		}
	}
	
	
}
