package searchAlgo;

public class binarySearch {
	public static int binarySearch(int num[],int key) {
		int start=0;
		int end=num.length-1;
		
		while(start<= end) {
			int mid=(start+end)/2;
			
			if(num[mid]==key) {
				return mid;
			}
			if(num[mid]<key) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	
	public static void main(String args[]) {
		int num[]= {2,4,6,8,10,12,14};
		int key=10;
		int result=binarySearch(num, key);
		if(result == -1) {
			System.out.println("Key not found ");
		}else {
			System.out.println("key found at "+result);
		}
		
		//System.out.println(binarySearch(num,key));
	}
}
