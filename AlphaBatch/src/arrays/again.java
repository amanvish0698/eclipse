package arrays;

public class again {

	public static void main(String [] args) {
	
		int marks[]= {12,14,15,15,15};
		update(marks);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]+" " );
			
		}
		
		
		
	}
	public static void update(int marks[]){
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=marks[i]+1;
			
		}
		
		
		
	}
	
	

}
