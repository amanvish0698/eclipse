package ApnaCollege;

public class palindrome {
	
		
	public static void isPalindrome(int r) {
		int n=r;//1
		int rev=0;//3
		while(n>0) {
			int rem=n%10;//2
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(r==rev) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=121;
		isPalindrome(x);
//		System.out.println(x%10);
//		System.out.println(0*10);
	}

}
