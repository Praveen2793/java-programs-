package com.javaprograms;

public class swapping {

	
	public static void main(String[] args) {
		int a=10, b=20;
		
		int t=0;
		
		System.out.println("Before Swaping A & B Values "+a+" "+b);
		
		//swaping using variable
//		t=a;
//		a=b;
//		b=t;
		
		//swaping using Arthmict operator 
		
//		a=a+b; ///10+20=30
//		b=a-b; ///30-20=10
//		a=a-b; ///30-10=20
		
		//swaping using mul and division
		
		/*a=a*b; //10*200=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20*/
		
		///swaping using bit wise operator XOR (^)
		
//		a= a ^ b;
//		b= a ^ b;
//		a= a ^ b;
				
		//Single statement 
		
		b=(a+b)-(a=b); //30-20=10
		
		System.out.println("After Swaping A & B Values "+ a +" "+ b);
		
	}
	
}
