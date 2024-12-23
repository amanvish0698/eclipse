package arrays;

public class reverseArray {
	
		public static int reverse(int n[]) {
			int start=0;int end=n.length-1;
			
			while(start<end) {
				int temp=0;//6
				temp=n[end];//6 5
				n[end]=n[start];//12
				n[start]=temp;//6 5
				start++;
				end--;
			}
			
			
			return 0;
		}
	
	
	
	public static void main(String args[]) {
		int n[]= {1,2,3,4,5,6};
		reverse(n);
		//System.out.println();
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+", ");
		}
		
		
	}
}
