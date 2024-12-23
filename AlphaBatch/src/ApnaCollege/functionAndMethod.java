package ApnaCollege;
import java.util.*;







     
public class functionAndMethod {
	
	
	
//	
//	public static void helloworld() {
//		System.out.println("Hello World");
//	}
//	
//	
//	public static int calculate(int a,int b) {
//		 int sum = a+b;
//		System.out.println(sum);
//		return 2;
//	}
//
//	
//	public static int calculatesum(int num1,int num2) {
//		int sum=num1+num2;
//		return sum;
//		
//	}
//	
	//--------swap of two values----------
	
	public static void exchange(int num1, int num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+"  ,"+num2);
	}
	
	
	
	
	//------ Multiply a to b----
	
	public static int multiple(int a,int b) {
		return a*b;
	}
	
	
	//---find the factorial of n------------
	
	
	public static int factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=i*fact;
		}
		return fact;
	}
	
	public static int bionomial(int n,int r) {
		int Bionomial=factorial(n)/(factorial(r)*factorial(n-r));
		//System.out.println(Bionomial);
		return Bionomial;
	}
	
	
	
	public static void main(String[] args) {
		
		
		//
		
		
		
		
		
		
		
		
		
		//--Binomial coefficient -----
		
//		int n=5;
//		int r=2;
//		
//		System.out.println(bionomial(6, 2));
		
		
		
		
		
		
		
		
		
		
		
		//--find the factorial of n-------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter your number : ");
//		int n=sc.nextInt();
		
		//factorial(n);
		
		
		//--------swap of two values----------
//		int a=10;
//		int b=20;
//		
//		
//		int multiply=multiple(a, b);
//		System.out.println("multiple of a and b is :"+multiply);
//		//exchange(a, b);
//		
//		
		
		
		
		
		
		// TODO Auto-generated method stub
//		helloworld();
//		
//		
//	
//		calculate(10, 5);
//		
//		
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a and b :  ");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int sum=calculatesum(a,b);
//		
//		System.out.println(" sum of a and b is : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
