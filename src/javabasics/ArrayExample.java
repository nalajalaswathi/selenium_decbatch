package javabasics;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
	
		/*
		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		
		System.out.println(a[1]);
		
			*/
		
		//=========================
		//int[] b = {10,20,30,40,50};
		
		//System.out.println(b[3]);			
	
		/*
		
		int[] a = new int[5];
		
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for array:");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}	
		
		for(int val: a)
		{
			System.out.println(val);
		}
		

		System.out.println("Displaying array values: ");
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	*/
		
		String[] cities = {"hyd","chennai","Pune","Delhi"};
		
		//First for loop
		for(String c : cities)
		{
			System.out.println(c);
		}		
		
		//Second for loop
		for(int i=0; i<cities.length; i++)
		{
			System.out.println(cities[i]);
		}
		
				
	}

}
