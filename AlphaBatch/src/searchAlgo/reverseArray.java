package searchAlgo;

public class reverseArray {
	
	public static void reverse(int array[]) {
		int first=0; int last=array.length-1  ;
		while(first<last) {
			int temp=array[last];
			array[last]=array[first];
			array[first]=temp;
			first++;
			last--;
		}
	}
	
	
	
	public static void main(String args[]) {
		int array[]= {2,4,6,8,10};
		reverse(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
