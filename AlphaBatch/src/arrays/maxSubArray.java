package arrays;

public class maxSubArray {
		
	
	public static void subArray(int arr[]) {
		int maximum=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++) {
			int maxsum=Integer.MIN_VALUE;
			
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int m=i;m<=j;m++) {
					sum=sum+arr[m];
				}
				
				
				
				
				
				
				
				System.out.print("(");
				for(int k=i;k<=j;k++) {
					//int sum=0;
					System.out.print(arr[k]);
					System.out.print(",");
					
				}
				System.out.print(")");
				System.out.print("("+sum+")");
				if(sum>maxsum) {
					maxsum=sum;
				}
				
				
			}
			System.out.println();
			System.out.print(maxsum);
			if(maxsum>maximum) {
				maximum=maxsum;
			}
			
			System.out.println();
		}
		System.out.println("maximum subArray is : "+maximum);
		
	}
	
	
	public static void maximumSubArray(int arr[]) {
		int n=arr.length;
		int cursum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					
					sum=sum+arr[k];
					
					
				}
				if(sum>cursum) {
					cursum=sum;
				}
				
				
			}
			
			
			
		} 
		System.out.print("Maximum Subarray is : "+cursum);
		
	}
	
	
	
	public static void prefixMaxSubArray(int arr[]) {
		int n=arr.length;
		int cursum=0;
		int maxsum=Integer.MIN_VALUE;
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];
		
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		for(int i=0;i<n;i++) {
			int start=i;
			for(int j=i;j<n;j++) {
				int end=j;
				cursum= start == 0 ? prefix[end] :  prefix[end]-prefix[start-1];
				
				if(maxsum<cursum) {
					maxsum=cursum;
				}
				
			}
		}
		System.out.println(maxsum);
	}
	
	
	
	public static void main(String args[]) {
		int arr[]= {1,-2,6,-1,3};
//		subArray(arr);
//		System.out.println();
//		System.out.println();
//		maximumSubArray(arr);
		prefixMaxSubArray(arr); 
		
	}
	
	
	
	
	
	

}
