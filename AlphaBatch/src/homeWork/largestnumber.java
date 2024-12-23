package homeWork;
import java.util.*;
public class largestnumber {
	
	public static int largest(int n[]) {
		int len=n.length;
		int larg=1;
		for(int i=0;i<len;i++) {
			if(larg<n[i]) {
				larg=n[i];
			}
			
		}
		return larg;
	}
	
	

	public static void main(String args[]) {
		int n[]= {1,2,3,2,6,7,10,9};
		
		int largestNumber=largest(n);
		System.out.println(largestNumber);
		
		
	}
	
	
}
