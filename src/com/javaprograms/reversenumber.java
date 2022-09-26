package com.javaprograms;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {

		System.out.println("Entre the Number");
		
		Scanner sc=new Scanner(System.in);
		
		int a = sc.nextInt();
		
		/*int rev=0;
		
		while(a!=0)
		{
			rev=rev*10 + a%10;
			a=a/10;
			
					
		}*/
		//System.out.println(rev);
	  // string Buffer class is use to reverse the number
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(a));
		
		StringBuffer rev=sb.reverse();
		
		System.out.println(rev);*/
		
		// using string builder class 
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(a);
		StringBuilder rev=sbl.reverse();
		
		System.out.println(rev);
		
	}

}
