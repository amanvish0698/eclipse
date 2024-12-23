package searchAlgo;

public class subArray {
	public static void subArray(int arr[]) {
		int total=0;
		for(int i=0;i<=arr.length;i++) {
			int maxsub=0;
			
			for(int j=i+1;j<=arr.length;j++) {
				int sum=0;
				
				
				
				for(int k=i;k<j;k++) {
				
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
					
				}
				total++;
				
				System.out.print(" sum "+sum);
				if(maxsub<sum) {
					maxsub=sum;
				}
				sum=0;
				System.out.println();
			}
			System.out.println("\nmax sub array is "+maxsub);
			maxsub=0;
			System.out.println();
		}
		System.out.println("Total sub arrays = "+total);
	}
	
	public static void main(String args[]) {
		int arr[]= {2,4,6,8,10};
		
		subArray(arr);
	}
}
