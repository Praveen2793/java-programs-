package com.javaprograms;

public class Reverse_string {

	public static void main(String[] args) {
		
		////First Method//

//		String str="PRAVEEN";
//		String rev="";
//		
//		System.out.println("Before Reverse String value :"+str);
//		
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println("Reverse String Value: "+rev);
		
		/// Second Method reverse String ///
		
		String str="PRAVEEN KUMAR, PRIYA THRASHINI";
				
		System.out.println("Before Reverse String value :"+str);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
