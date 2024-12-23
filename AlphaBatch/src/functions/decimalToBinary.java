 package functions;
import java.util.*;
public class decimalToBinary {
	
	public static int  decimalToBin(int n) {
		int number=n;
		int power=0;
		int bin=0;
		while (number>0) {
			int rem=number%2;
			bin=bin+rem*(int)Math.pow(10,power);
			power++;
			number=number/2;
		}
		System.out.println(bin);
		return bin;
	}
	
	
	public static void binaryToDecimal(int n) {
		int num=n;
		int pow=0;
		int dec=0;
		while (num>0) {
			int lastdigit=num%10;
			dec=dec+lastdigit*(int)Math.pow(2,pow);
			pow++;
			num=num/10;
		}
		System.out.println(dec);
	}
	
	
	
	
	public static void main (String args[]) {
		
		binaryToDecimal(decimalToBin(7));
		
		//System.out.println(decimalToBin(5));
	}

}
