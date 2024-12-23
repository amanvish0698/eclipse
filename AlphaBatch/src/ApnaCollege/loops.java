package ApnaCollege;
import java.util.*;


public class loops {
	
	public static void main(String []args) {
		
//_______________________________while loop______________________________________//
		
		
		
		Scanner sc=new Scanner(System.in);
		
//		System.out.print("what do you want to print");
//		String print=sc.next();
//	
//		System.out.print("for how many times do you want to print: ");
//		
//		
//		
//		
//		
//		
//		int num=sc.nextInt();
//		int i =0;
//		while( i<num) {
//			System.out.print(print);
//			i++;
//		}
//		
//		System.out.println("printed " +print+" for "  +i+" times");
//		
//-----------counter printig 1 to 10-------------------
		
//		System.out.println("how many numbers do you want to print?");
//		int num=sc.nextInt();
//		int i =1;
//		while(i<=num) {
//			System.out.print(i+" ");
//			i++;
//		}
//		System.out.println("\nprinted numbers from 1 to "+(i-1));
		
//-----------sum of natural numbers ------------------------
		
		
//		System.out.println("how many numbers do you want to print?");
//		int num=sc.nextInt();
//		int i=1;
//		int sum=0;
//		while(i<=num) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum of number is "+sum);
//		
//		
//______________________________For loops_____________________________________
//		
//		
//		//int i=1;
//		for(int i=0;i<=10;i++) {
//			System.out.println("aman "+i);
//		}
		
//------------Squre pattern-------------------------------
//for(int j=1;j<=4;j++) {
//	for(int i=1;i<=6;i++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
//		
		
//int line=1;
//while(line<=4){
//	
//	int line2=1;
//	while(line2<=4) {
//		System.out.print("*");
//		line2++;
//		
//	}
//	System.out.println();
//	line++;
//}
//		
//		
		
		
		
		
//-------print reverse if a number -----------
		
	//int	n=10899;

	
	//	System.out.println(n);
//		
//		for(int i=1;i<=5;i++) {
//			int remainder=n%10;//9
//			int div=n/10;//1089
//			n=div;
//			System.out.print(remainder);
//		}
//		
//		
		
		
//		
//		while(n>0) {
//			int rem=n%10;
//			System.out.print(rem);
//			n=n/10;
//			
//		}System.out.println();
//		
		
		
		
		
//		int rev=0;
//		
//		while(n>0) {
//			int rem=n%10;
//			
//			
//			rev=(rev*10)+rem;
//			n=n/10;
//		}
//		System.out.println(rev);
//		
//		
		
//________________________Do while loop_______________________
	
//	int counter=0;
//	do{
//		System.out.println("hello world");
//		counter++;
//		
//	}while(counter<=10);
//		
//		
		
	
//--------Break statement---------------------
	

//	do {
//		System.out.print("give a number : ");
//		int num=sc.nextInt();
//		if(num%10==0) {
//			break;
//		}
//		System.out.println(num);
//	}while(true);
	
	
	
	
//	System.out.println(num+" is multiple of 10");
	
	
//---------continue statement---------------	
//	int no=0;
//	do {
//		if(no==3) {
//			continue;
//		}
//		System.out.println(no);
//		no++;
//		
//	}while(no<=10);

	
	
//	
//	
//	
//	for(int i=1;i<=5;i++) {
//		if(i==3) {
//			continue;
//		}
//		System.out.println(i);
//	}
//	
	
	
	
//do {
//	
//	System.out.print("enter number: ");
//	int num=sc.nextInt();
//	if(num%10==0) {
//		continue;
//	}
//	System.out.println(num);
//	
//}while(true);
//	
	
//	
//do {
//	System.out.println("Enter your numbber : ");
//	int num=sc.nextInt();
//	if(num%2==0) {
//		System.out.println("prime");
//	}else {
//		break;
//	}
//	
//	
//	
//}while(true);
//
//System.out.println("you entered not prime number");
//	
//	
//	
//		System.out.println("Enter number");
//		int n=sc.nextInt();
//		boolean isprime=true;
//		for(int i=2;i<=Math.sqrt(n);i++) {
//			if(n%i==0) {
//				isprime=false;
//			}
//		}
//		if(isprime==true) {
//			System.out.println("Entered num is prime");
//		}else {
//			System.out.println("not prime");
//		}
//	
//	
//		
//		int even=0;
//		int odd=0;
//		
//		int n=10;
//		
//		for(int i=0;i<=n;i++) {
//			if(i%2==0) {
//				even+=i;
//			}else {
//				odd+=i;
//				
//			}
//			
//			
//			
//			
//		}System.out.println(even+" ,"+odd);
//		
		
		
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				System.out.println("even"+i);
//			}
//			else {
//				System.out.println("odd"+i);
//			}
//		}
//		
		
		
		System.out.println("enter your num : ");
		int num=sc.nextInt();
		
		for(int i=num-1;i>=1;i--) {
			num=num*i;
		}
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
