package ApnaCollege;
import java.util.*;
public class areaOfCircle {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		float pie=3.14f;
		
		System.out.print("enter your radius: ");
		float r=sc.nextFloat();
		float area=pie*(r*r);
		System.out.println(area);
		
	}
}
