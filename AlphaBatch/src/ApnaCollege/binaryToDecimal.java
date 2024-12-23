package ApnaCollege;
import java.util.*;


public class binaryToDecimal {
	
	
	
	public static void binToDec(int n) {
		int  pow=0;
		int dec=0;
		int num=n;
		int decimal=0;
		while(num>0) {
			int lsd=num%10;
			System.out.println("lsd  "+lsd);
			int pows=(int)Math.pow(2, pow);
			decimal=decimal+lsd*pows;
			pow++;
			System.out.println("num "+num);
			num=num/10;
			
			
			
			
			
		}
		
		System.out.println(decimal);
		
		
		
		
		
		
		
		
		
	}
	
public static void DecToBin(int n) {
	int rem=0;
	int binary=0;
	int dec=n;
	int pow=0;
	
	while(dec>0) {
		rem=dec%2;
		binary=binary+rem*((int)Math.pow(10,pow));
		pow++;
		dec=dec/2;
	}
	System.out.println(n+" ka Binary hogaaa : "+binary);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String srgs[]) {
		
			DecToBin(11);
			System.out.println( );
		
	}
}
