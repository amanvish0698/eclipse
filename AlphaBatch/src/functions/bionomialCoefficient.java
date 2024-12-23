package functions;

public class bionomialCoefficient {
	
	
	public static int factorial(int f) {
		int fact=1;
		
		for(int i=1;i<=f;i++) {
			fact=fact*i;
		}
		
		return fact;
	}
	
	
	public static int bioCoe(int n,int r) {
		int nfact=factorial(n);
		int rfact=factorial(r);
		int nrfact=factorial(n-r);
		
		int product=0;
		product=(nfact/(rfact*nrfact));
		
		
		
		
		return product;
	}
	
	
	public static void main(String args[]) {
		System.out.println(bioCoe(5,2));
	}
	
}
