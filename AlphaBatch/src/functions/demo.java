package functions;
import java.util.*;
public class demo {
	
	public static void demo() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello world");
			} 
	}
	
	
	
	public static int addition(int a, int b) {
		
		
		return a+b;
	}
	
	public static void swap() {
		int a =10;
		int b=20;
		int temp=0;
		System.out.println("int a = "+a+"int b = "+b+" and temp ="+temp);
		temp=a;//10
		a=b;//20
		b=temp;//10
		
		System.out.println("int a = "+a+"int b = "+b+" and temp ="+temp);
	}
	
	public static int multiplication(int a,int b) {
		return a*b;
	}
	
	public static int factorial(int fact) {
		int factorial=1;
		for(int i=fact;i>=1;i--) {
			factorial=factorial*i;
		}
		
		return factorial;
	}
	
	
	
	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter your first number : ");
//		int a=sc.nextInt();
//		System.out.print("Enter your second number : ");
//		int b=sc.nextInt();
//		System.out.println("product of a and b is "+multiplication(a, b));
//		System.out.println("sum of a and b is : "+addition(a,b));
		
	System.out.println(factorial(7));	
		
		//swap();
	}
	
	

}
 