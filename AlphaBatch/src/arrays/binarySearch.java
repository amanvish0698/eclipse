package arrays;

public class binarySearch {
	
	
	
	
	
	
	public static void binarySearch(int n[],int k) {
		int start=0;int end=n.length-1;
		//System.out.println();
		while(start<=end) {
			int mid=(start+end)/2;
			if(n[mid]==k) {
				System.out.println("found at index : "+mid);
			}
			
			 if(n[mid]<k) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
	}
	
	public static void main(String args[]) {
		int n[]= {2,4,6,8,10,12,14,16};
		int k=10;
		
		binarySearch(n, k);
	}

}
