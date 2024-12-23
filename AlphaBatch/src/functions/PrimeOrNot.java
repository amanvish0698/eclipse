package functions;
import java.util.*;


public class PrimeOrNot {
	
	public static boolean primeOrNot(int n) {
		
		if(n==2) {
			return true;
		}
		
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean optimizedPrime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	public static void main(String args[]) {
		
		System.out.println(primeOrNot(5));
		System.out.println(optimizedPrime(5));
		
	}
	
	
}
