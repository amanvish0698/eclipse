package arrays;

public class linearSearchAgain {
	
	
	public static int linearSearch(int arr[],int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
			return i;
				
			}
			
			
		}
		
		return -1;
		
		
		
	}
	
	public static String khanaKhojo(String menu[],String khojo) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i]==khojo) {
				String index=String.valueOf(i);
				return index;
			}
		}
		
		
		
		
		return "nahi mila";
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	int arr[]= {2,4,6,10,12,14,16,27};	
	int key=100;
	
	
	
	String menu[]= {"chole","bhature","chapati","samosa","jalebi"};
	String khojo= "samosa";
	
	String khana=khanaKhojo(menu, khojo);
	
	
	if(khana=="nahi mila") {
		System.out.println("nahi mila");
	}else {
		System.out.println("khana mil gaya "+khana);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	int ans=linearSearch(arr, key);
	
	if(ans== -1) {
		System.out.println("not found");
	}else {
		System.out.println("foun at index : "+ans);
	}

		
	}

}
