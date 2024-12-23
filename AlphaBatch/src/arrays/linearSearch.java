package arrays;

public class linearSearch {
	
	
	public static void linearsearch(int number[],int key) {
		
		for(int i=0;i<number.length;i++) {
			if(number[i]==key) {
				System.out.println("key found at: "+i);
			} 
		}
		
		
		
		
	}
	
	
	
	public static void kyaKhaoGe(String menu[],String order) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i]==order) {
				System.out.println("Your order found at : "+i);
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	public static int largestnumber(int num[]) {
		
		int infinity=Integer.MIN_VALUE;
		int maxVal=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++) {
			if(num[i]>infinity) {
				infinity=num[i];
				
			}
			if(num[i]<maxVal) {
				maxVal=num[i];
			}
			
		}
		
		
		System.out.println("smallest value is: "+maxVal);
		return infinity;
	}
	
	
	public static int binarysearch(int num[],int key) {
		int start=0, end=num.length-1;
		System.out.println(num.length);
		while(start<=end) {
			int mid =(start+end)/2;
			
			//compare
			if(num[mid]==key) {
				return mid;
			}
			if(num[mid]<key ) {
				start =mid+1;
			}else {
				end=mid-1;
			}
			
		
			  
		}
	
		return -1;
	}
	
	
	public static int anotherbinary(int n[],int k) {
		int start=0;
		int end=n.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(n[mid]==k) {
				return mid;
			}
			if(n[mid]<k) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return -1;
	}
	
	
	public static void reverse(int n[]) { //{2,4,6,8,9}; 9 8    4 2
		int len=n.length-1;
		int temp=0;
		int temp1=0;
		for(int i=0;i<len/2     ;i++) {
			temp=n[len-i];//9 8
			
			temp1=n[i];//2 4
			
			n[i]=temp;//8
			
			n[len-i]=temp1;//4
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		int number[]= {5,10,15,20,25};
		int key=10;
		String menu[]= {"smosa","chole","daal","chawal","ghathi","jalebi"};
		String order="daal";
		
		//largest numner
		int num[]= {1,2,6,3,5};
		
		linearsearch(number, key);
		kyaKhaoGe(menu, order);
		System.out.println("largest value is: "+largestnumber(num));
		
		System.out.println("binary search is "+binarysearch(number, key)) ;
		System.out.println((int)1/2);
		
		int nums[]= {2,4,6,8,9};
		reverse(nums);
		for(int i=0;i<num.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
	}

}
