package arrays;

public class pairsOfArray {
	
	
	public static void pairsOfArray(int n[]) {
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				System.out.print("("+n[i]+","+n[j]+")");
			}
			System.out.println();
		}
	}
	
	public static void main (String args[]) {
		int n[]= {2,4,6,8,9};
		
		
		
		pairsOfArray(n);
	}

}
