package arrays;
import java.util.*;

public class minAndMax {
	public static void minAndMax(int values[]) {
		int min_value=values[0];
		int max_value=values[0];
		
		for(int i=1;i<values.length;i++) {
			
			if(values[i]<min_value) {
				min_value=values[i];
			} 
			else if(values[i]>max_value) {
				max_value=values[i];
			}
		}
		System.out.println(min_value+"  "+max_value);
	}
	
	
	
	
	
	
	public static void largestNumber(int values[]) {
		
		int minval=Integer.MAX_VALUE;//1
		int maxval=Integer.MIN_VALUE;//1
		for(int i=0;i<values.length;i++) {
			
			if(values[i]<minval) {
				minval=values[i];
			}else if(values[i]>maxval) {
				maxval=values[i];
			}
			
			
		}
		System.out.println(minval+" , "+maxval);
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		int values[]= {1,2,3,4,5,6,7,8,9,10};
		minAndMax(values);
		largestNumber(values);
	}
}
