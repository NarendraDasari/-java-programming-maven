package com.learning.chaitanya.arrays;

import java.util.Scanner;

import com.learning.chaitanya.models.*;

public class ArraysTest {
	public void testSimpleArrays(int size)
	{
	//System.out.println("Executing simple arrays program");	
		
		String[] students=new String[size];
//		students[0]="chaitanya";
//		students[1]="nanduri";
//		students[2]="narendra";
//		students[3]="dasari";
		
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Enter " + i + "th value:");
			students[i]=scan.next();
		}
				
		
		for(int i=0;i<students.length;i++)
		{
		
	System.out.println("Welcome" + "," + students[i]);
		}
		
		}
	
	
	public void testSimpleArrays(Person[] personlist)
	{

		for(int i=0;i<personlist.length;i++)
		{
			System.out.println("Person details");
			Person x=personlist[i];
			System.out.println("Firstname:" + x.firstName);
			System.out.println("Lastname:" + x.lastName);
			System.out.println("DOB:" + x.dob);
			System.out.println("Age:" + x.age);
		}
	
	}
	
	
	public void printVehicals(Vehical[] vechicalList)
	{
		for(int i=0;i<vechicalList.length;i++)
		{
			System.out.println("Vehical details");
			Vehical v=vechicalList[i];
			System.out.println("make:" + v.make);
			System.out.println("model:" + v.model);
			System.out.println("color:" + v.color);
			
			
		}
	}

}
