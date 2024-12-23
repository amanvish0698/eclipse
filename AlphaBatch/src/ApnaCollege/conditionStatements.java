package ApnaCollege;
//import java.util.Scanner;

import java.util.*;
public class conditionStatements {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		
//------------------------------age printing-----------------------------------
		
//		System.out.print("Enter Your age : ");
//		int age =sc.nextInt();
//		
//		if(age>18) {
//			System.out.println("You can drive car ");
//		}
//		
//		
//		if(age>13 && age<18) {
//			System.out.println("teenager");
//		}
//		
//		
//		else {
//			System.out.println("you are not adult");
//		}
//		
		
		
//------------------------------------Printing Larger Value----------------------------
		
//		int a =110;
//		int b=20;
//		
//		if(a>b) {
//			System.out.println(" larger number is a "+a);
//		}
//		else {
//			System.out.println(b+" b  is the larger number");
//		}

		
//-------------------------------------Even or Odd-----------------------------------------
//		System.out.print("Enter you number :");
//		int num=sc.nextInt();
		
//		if(num%2==0) {
//			System.out.println("Your number "+num+" is even");
//		}else {
//			System.out.println("Your number "+num+" is odd");
//		}
//		
//		
//	-------------------check age using else-if condition---------------------------
		
//		System.out.print("Enter you age :");
//		int age=sc.nextInt();		
		
//		if(age>=18) {
//			System.out.println("you eligible to vote");
//		}
//		else if (age>=13 && age<=17) {
//			System.out.println("You are teenager ");
//		}else if(age>=6 && age<=12) {
//			System.out.println("you are kid");
//		}else {
//			System.out.println("You are not elgible to vote");
//		}
//		
		
		
//---------------------------------calculate percentage------------------------
		
//		System.out.print("Enter your income :");
//		int income=sc.nextInt();
//	
//		
//		
//		if(income<500000) {
//			System.out.println("You are tax free ");
//		}else if(income>500000 && income<1000000) {
//			System.out.print("You have to pay 20% tax ");
//			//double per=20.0/100;
//			double tax=20.0/100*income;
//			System.out.println(tax);
//			
//		}else {
//			System.out.println("You have to pay 30% tax ");
//			double per=30.0/100;
//			double tax=per*income;
//			System.out.println(tax);
//		}
		
//-----------------------------Printing the largest number--------------------------------		
		
//int a=1,b=13,c=6;
//		
//		if(a>b && a>c) {
//			System.out.println("a is greater then b and c");
//		}else if( b>c) {
//			System.out.println(" b is greater then a and c");
//		}else {
//			System.out.println("c is greater then a and b");
//		}
		
//-----------------------------------Ternery Operator---------------------------------------
		
		
		
		
//		
//		int larger=(5>3)?5:3;
//		System.out.println(larger);
//		
//		int num=52;
//		String evenOdd=(num%2==0)? "even":"odd";
//		System.out.println(evenOdd);
//		
//		
//		
		
//---------------------------------pass or fail------------------------------------------------
//		System.out.print("Enter your marks");
//		int marks=sc.nextInt();
//		
//		String pass=(marks>=33)?"pass":"fail";
//		System.out.println(pass);
//		
//		
//--------------------------Switch Condition----------------------------------------------
		
//		System.out.println("press 1 for burger\npress 2 for pizza \npress 3 for shakes");
//		int btn=sc.nextInt();
//		
//		//System.out.println(btn);
//		switch(btn){
//			case 1 : System.out.println("here is your burger ");break;
//			case 2 : System.out.println("Here is your pizza ");break;
//			case 3 : System.out.println("Here is your shakes");break;
//			default : System.out.println("Here is your glass of water ");
//		}
//		
		
//----------------------------------Calculator--------------------------------------------
		
//		System.out.print("enter number a :");
//		int a = sc.nextInt();
//		System.out.print("enter number b :");
//		int b=sc.nextInt();
//		
//		System.out.println("----------------------------------------------------------------------\n  \nWhich operation do you want to perform ");
//		System.out.println("press + for addition \npress - for subtraction\npress * for multiplication\npress / for division \npress % to find remainder");
//		System.out.println();
//		String operator=sc.next();
//		
//		
//		switch(operator) {
//		case "+" :System.out.println("addition of a and b is:"+(a+b));break;
//		case "-" :System.out.println("Subtraction of a and b is"+ (a-b));break;
//		case "*" :System.out.println("Multiplication of a and b is"+(a*b));break;
//		case "/" :System.out.println("Division of a and b is "+(a/b));break;
//		case "%" :System.out.println("remainder of a and b is "+(a%b));
//		}
		
//----------------Leap Year-----------------------------
		
		
		
		//System.out.println("Enter your year");
		
//		System.out.println("Enter your year");
//		int year=sc.nextInt();
//		
//		
//		System.out.print(year);
//		
//		if(year%4==0) {
//			if(year%100!=0) {
//				System.out.println(" Leap Year");
//			}
//			else if(year%400==0) {
//				System.out.println(" leap year");
//			}
//		}else {
//			System.out.println(" not a leap year");
//		}
		
		
		
//		if(year%4==0) {
//			System.out.println("leap year");
//		}else if (year%100!=0) {
//			System.out.println("leap year");
//		}else if (year%400==0) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("not a leap year");
//		}
//		
		
		
		
//---------------------checking divisibiliy------------------
		
		for(int i=0;i<=100;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println(i+" Hello Print");
			}else if(i%5==0) {
				System.out.println(i+" Print");
			}else if(i%3==0) {
				System.out.println(i+" Hello ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
