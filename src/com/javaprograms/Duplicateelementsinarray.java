package com.javaprograms;

import java.util.HashSet;

public class Duplicateelementsinarray {

	public static void main(String[] args) {
		
		// noraml array Method 
		
		/*String arr[]= {"java","C","C++","Python","Java","JAVA"};
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found a Duplicate Value in Array : "+arr[i]);
					flag=true;
				}
			}
		}

		if(flag==false)
		{
			System.out.println("No Duplicates found in Array");
		}*/
		
		// using hash set to find duplicates
		
		String arr[]= {"java","C","C++","Python","Java","JAVA"};
		
		HashSet <String> lang=new HashSet<>();
		
//		System.out.println(lang.add("java"));
//		System.out.println(lang.add("python"));
//		System.out.println(lang.add("java"));
		
		boolean flag=false;
		
		for(String l:arr)
		{
			if(lang.add(l)==false)
			{
				System.out.println("Found Duplicate Values : "+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("No Dupliactes Found in values");
		}
		
	}

}
