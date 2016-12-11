package algorithm.Ex;

public class DoubleForProb {
	public static boolean getPrime(int num){
		for(int i=2; i<num; i++){
			if(num % i==0)
				return false;
		}
		return true;
	}
}
