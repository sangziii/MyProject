package structure.arrayList;

public class ArrayList {
	private int size = 0;
	private Object[] elementsData = new Object[100];
	
	public boolean addLast(Object input){
		elementsData[size++] = input;
		return true;
	}
	
	public boolean add(int index, Object input){
		for(int i=index; i<=size; i++)
			elementsData[i+1] = elementsData[i];
		elementsData[index] = input;
		size++;
		return true;
	}
	
	public boolean addFirst(Object input){
		return add(0, input);
	}
	
	@Override
	public String toString(){
		String str ="[ ";
		for(int i=0; i<size-1; i++)
			str += elementsData[i] + ", ";		
		return str += elementsData[size-1] + " ]";
	}
	
	public Object remove(int index){
		Object temp = elementsData[index];
		
		for(int i=index; i<size-1; i++){
			elementsData[i] = elementsData[i+1];
		}
		elementsData[size-1] = null;
		size--;		
		return temp;
	}
	
	public Object removeFirst(){
		return remove(0);
	}
	
	public Object removeLast(){
		return remove(size-1);	
	}
	
	public Object get(int index){
		return elementsData[index];
	}
	
	public int size(){
		return size;
	}
}
