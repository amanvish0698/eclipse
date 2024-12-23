package searchAlgo;

public class largestNum {
	
	public static int[] largest(int num[]) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(largest<num[i]) {
				largest=num[i];
			}
			
			if(smallest> num[i]) {
				smallest=num[i];
			}
		}
			//System.out.println("smallest number is "+smallest);
		
		
		
		return new int[]{largest,smallest};
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,2,6,3,5,8};
		//System.out.println("Largest number is "+largest(num));
		int[] result =largest(num);
		System.out.println("Largest num is "+result[0]+"\nSmallest num is "+result[1]);
		
	}

}
 