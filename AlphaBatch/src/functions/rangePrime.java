package functions;
import java.util.*;

public class rangePrime {
	public static boolean prime(int n) {
		if(n==2) {
			return true;
		}else if(n==1){
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeInRange(int n) {
	
	for(int i=1;i<=n;i++) {
		if(prime(i)==true) {
			System.out.println("prime number : "+i);
		}
	}
		
		
	}
	
	public static void main(String args[]) {
		//System.out.println(prime(2));
		primeInRange(100);
	}
	
	
	
}
