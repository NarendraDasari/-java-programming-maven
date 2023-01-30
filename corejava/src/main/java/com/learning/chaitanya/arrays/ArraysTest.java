package com.learning.chaitanya.arrays;

import java.util.Scanner;

public class ArraysTest {
	public void testSimpleArrays()
	{
	//System.out.println("Executing simple arrays program");	
		
		String[] students=new String[4];
//		students[0]="chaitanya";
//		students[1]="nanduri";
//		students[2]="narendra";
//		students[3]="dasari";
		
		System.out.println("Enter first value:");
		Scanner scan=new Scanner(System.in);
		students[0]=scan.next();
		System.out.println("Enter Second value:");
		students[1]=scan.next();
		System.out.println("Enter 3rd value:");
		students[2]=scan.next();
		System.out.println("Enter 4th value:");
		students[3]=scan.next();
		
		
				
		
		for(int i=0;i<students.length;i++)
		{
		
	System.out.println("Welcome" + "," + students[i]);
		}
		
		
		// Welcome, chaita
		//
		
	}

}
