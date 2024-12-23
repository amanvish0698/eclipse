package searchAlgo;

public class linearSearch {
	
	public static void linearSearch(int num[],int k) {
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==k) {
				System.out.println(num[i]+" , "+i);
			}else {
				System.out.println("key not found");
				break;
			}
		}
		
		
	}
	public static void stringSearch(String menu[],String dish) {
		for(int i=0;i<menu.length;i++) {
			if(menu[i]==dish) {
				System.out.println("dish found at : "+menu[i]+" --> "+i);
				break;
			}else {
				System.out.println("Not found your dish");
				
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,8,10,12,14,16};
		String menu[]= {"samosa","chole","Bhature","puri","sabji","raita","dal","roti"};
		int k=18;
		String dish="Bhature";
		stringSearch(menu,dish);
//		for(int i=0;i<menu.length;i++) {
//			System.out.println(menu[i]+" -"+dish);	
//		}
		
		//linearSearch(num, k);

	}

}
