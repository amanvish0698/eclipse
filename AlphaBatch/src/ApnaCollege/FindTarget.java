package ApnaCollege;

public class FindTarget {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,1};
		int target = 9;
		int index1 = -1;
		int index2 = -1;

		for (int i = 0; i < numbers.length; i++) {
			for(int j=0;j<numbers.length;j++) {
				
				 if (numbers[i]+numbers[j] == target) {
				        index1 = i;
				        index2 = j;
				        break;
				    }
				
				
				
			}
			
			
			
			
		   
		}

		System.out.println("Index of " + target + " is: " + index1+","+index2);
		

		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
