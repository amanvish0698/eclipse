package homeWork;
import java.util.*;

public class reverse {
	
	
	public static void main(String args[]) {
		
		 int n;
		 int reverse=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter you number ");
		n=sc.nextInt();
		
		while(n>0){
		int lastdigit=n%10;
		reverse=(reverse*10)+lastdigit;
		n=n/10;
		}
		System.out.println("reversed number "+reverse);
		
	}

}
