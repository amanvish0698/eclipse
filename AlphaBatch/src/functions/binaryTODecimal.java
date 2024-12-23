package functions;
import java.util.*;


public class binaryTODecimal {
	public static void main(String args[]) {
		int n=101;
		double power=0;
		int dec=0;
		
		
		while(n>0) {
			int ld=n%10;
			dec=dec+(ld*(int)Math.pow(2,power));
			power++;
			n=n/10;
			
		}
		System.out.println(dec);
		
	}
	 

}
