package ApnaCollege;

public class FunctionOverloading {

//	public static int sum(int a,int b) {
//		return a+b;
//	}
//	public static int sum(int a,int b,int c) {
//		return a+b+c;
//	}
//	
//	
	
	
	//function over loading using data
	
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static float sum(float a,float b) {
		return a+b;
	}
	public static double sum(double a,double b) {
		return a+b;
	}
	
	
	
	
	
	
	public static void main(String args[]) {
	int a=10;
	int b=10;
	float c=12.2f;
	float d=12.2f;
	System.out.println(sum(c,d));
	System.out.println(sum(a, b));
		
	
	
	
	
	
	
	
	}
	
}                   
