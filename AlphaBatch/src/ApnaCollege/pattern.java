package ApnaCollege;
import java.util.*;


public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=5;j++) {
//				
//				if(i==2) {
//					System.out.print("*   *");
//					break;
//				}
//				else if(i==3) {
//					System.out.print("*   *");
//					break;  
//				}
//				else {
//					System.out.print("*");
//				}
//				
//				
//			}
//			System.out.println();
//		}
//		
//		
		
		
//----------invertet stars---------------
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4-i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//-----------Print Half pyramid----------------
		
		
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//		
			
//---------print character pattern-------------------		
		
//		int n=6;
//		char ch='A';
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				
//				System.out.print (ch);
//				ch++;
//				
//			}
//			System.out.println();
//		}
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//	for(int i=1;i<=10;i++) {
//		System.out.println(16*i);
//	}
//		
//		
//		
		int n=4;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		System.out.println("\n\n");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
				
			}
			System.out.println();
			
			
		}
		
		
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			
//			
//			
//		}System.out.println();
//		
//		
//	}
		
	int num=5;
for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		
	}
	
	for(int j=1;j<=num*2-i*2;j++) {
		System.out.print(" ");
	}
	
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		
	}
	System.out.println();
	
	
}
for(int i=num;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		
	}
	
	for(int j=1;j<=num*2-i*2;j++) {
		System.out.print(" ");
	}
	
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		
	}
	System.out.println();
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
