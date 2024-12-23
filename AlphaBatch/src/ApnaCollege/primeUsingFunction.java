package ApnaCollege;
import java.util.*;
public class primeUsingFunction {
	
	public static boolean primeOrNot(int n) {
		
		if(n==2) {
			return true;
		}
		//boolean isprime=true;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
			return false;
			}
			
			
			
		}
		return true;
		
		
		
	}
	
	public static boolean prime(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
			return false;}
		}
		return true;
	}
	
	
	
	public static void printPrime(int n) {
//		for(int i=2;i<=n;i++) {
//			if(i%2==0) {
//				System.out.println();
//			}else{
//				System.out.println(i);
//			}
//		}
		
		
		for(int i=2;i<=n;i++) {
			if(prime(i)) {
				System.out.print(i+" "); 	
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(primeOrNot(  2));
//		System.out.println(prime(5));
//		
//		System.out.println(Math.sqrt(5 ));
//		
		
		printPrime(100);

	}

}
