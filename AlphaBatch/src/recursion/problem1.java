package recursion;

public class problem1 {
	
	
	public static void printnum(int n) {
//		for(int i=n;i>=1;i--) {
//			System.out.println(i);
//		}
		
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n+" ");
		printnum(n-1);
	}
	
	public static void printinc(int n) {
		
		if(n==1) {
			System.out.println(n);
			return;
		}
		
		printinc(n-1);
		System.out.println(n);
	
		
	}
	
	
	public static void main(String args[]) {
		//printnum(10);
		printinc(5);
	}

}
