package algorithm.recursion;

public class Factorial {
	public int fact(int n){
		if(n <= 1)
			return n;
		else {
			return n * fact(n-1);
		}
	}
}
