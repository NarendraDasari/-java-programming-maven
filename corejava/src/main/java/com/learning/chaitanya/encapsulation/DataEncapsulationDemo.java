package com.learning.chaitanya.encapsulation;

import java.util.Scanner;

import com.learning.chaitanya.models.Person;

public class DataEncapsulationDemo {
public void testDataEncapsulation()
{
	
	Person per=new Person();
	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("Enter person firstname");
	per.firstName=scan.next();
	System.out.println("Enter person lastname");
	per.lastName=scan.next();
	System.out.println("Enter person DOB");
	per.dob=scan.next();
	System.out.println("Enter person age:");
	per.age=scan.nextInt();
	System.out.println("person firstname is" +per.firstName);
	System.out.println("person lastname is:" +per.lastName);
	System.out.println("person dob:" +per.dob);
	System.out.println("person age" +per.age);
	
	
	
     
	
	
	
}

}
