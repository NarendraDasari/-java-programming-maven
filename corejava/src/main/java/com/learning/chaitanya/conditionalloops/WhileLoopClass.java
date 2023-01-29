package com.learning.chaitanya.conditionalloops;
import com.learning.chaitanya.models.*;

import java.util.Scanner;

public class WhileLoopClass {
	
	
	public void testWhileloop() {
		System.out.println("Executing test while loop function.");
		
		
		
		
		System.out.println("Do you want to enter person details");
		Scanner scan=new Scanner(System.in);
		String z=scan.next();
		
		while(z.equals("y"))
		{
			System.out.println("Enter ur firstname:");
			String fname=scan.next();
			
			System.out.println("Enter ur lastname:");
			String lname=scan.next();
			
			System.out.println("Enter ur date of birth");
			String dob=scan.next();
			
			System.out.println("Enter ur age:");
			int age=scan.nextInt();
			
			Person per=new Person();
			per.firstName = fname;
			per.lastName=lname;
			per.dob=dob;
			per.age=age;
			SavePerson(per);
			
			System.out.println("Do u want to continue");
			z=scan.next();
			
			
			
					
		
		}
			
		
		
		}
	
	public void SavePerson(Person p)
	{
		
		System.out.println("FirstName" +p.firstName);
		System.out.println("LastName" +p.lastName);
		System.out.println("DOB" +p.dob);
		System.out.println("Age"+p.age);
		System.out.println(p.firstName + ", You are successfully enrolled.");
	}
	

}
