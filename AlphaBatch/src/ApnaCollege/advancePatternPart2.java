package ApnaCollege;
import java.util.*;
public class advancePatternPart2 {
	
	public static void hollowpattern(int row,int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1||j==1||i==row||j==col) {
					System.out.print("*");
				}else {
					System.out.print (" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void halfpyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public static void numHalfPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
	
	public static void floydsTriangle(int n) {
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
	
	public static void zeroOneTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		 
	hollowpattern(10,10);
	System.out.println();
	halfpyramid(4);
	System.out.println();
	numHalfPyramid(5);
	System.out.println();
	floydsTriangle(5);
	System.out.println(); 
	zeroOneTriangle(5);
	}

}
