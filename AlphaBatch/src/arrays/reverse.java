package arrays;

public class reverse {
	
		public static void reverseArray(int arr[]) {
			int size=arr.length;
			int start=0;int end=size-1;//4
			
			while(start<end) {
				int temp=arr[end];//2
				arr[end]=arr[start];
				arr[start]=temp;
				
				
				start++;
				end--;
				
			}
			
			
			
			
			
			System.out.println(size);
			System.out.println(start+" , "+end);
					
		}
	
	
	
	
	
	
			
			public static void main(String args[]) {
				int arr[]= {2,4,6,8,10};
				reverseArray(arr);
				
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]);
					if(i<4) {
						System.out.print(",");
					}
				}
				 
			}
}
