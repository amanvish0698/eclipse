package homeWork;

public class functionsQuestions {
	
	
	
	public static int reverse(int r) {
		int n=r;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		//System.out.println(rev);
		return rev;
		
		
	}
	
	
	public static void palindrome(int a,int b) {
		if(a==b) {
			System.out.println(a+" this number is pelindrome because "+b);
		}else {
			System.out.println(a+" this number is not  pelindrome because "+b);
		}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		//average(5, 5, 5);
		
		//System.out.println(evenOrOdd(5));
		int a=121;
		int b=0 ;
		b=reverse(a);
		palindrome(a, b);
		
		
		int sum=0;
		int n=123;
		while(n>0) {
			int lsd=n%10;
			sum=sum+lsd;
			n=n/10;
		}
		System.out.println(sum);
		
		
		
		
		
		
	}
}
