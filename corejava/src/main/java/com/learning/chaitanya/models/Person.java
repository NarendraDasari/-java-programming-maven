package com.learning.chaitanya.models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Person {
	
	public String firstName;
	public String lastName;
	public String dob;
	//private int age;
	
	
	
	public int getAge()
	{
		// we need to read the DOB property in this function.
		// convert DOB into date type.
		// get todays date.
		// if we can compare todays date with the converted date type we will 
		// - get the difference between this two dates.
		 SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		 Date d=new Date();
		 System.out.println(sdf.format(d));
		 
		 LocalDate local=LocalDate.now();
		 local.getYear();
		 
		 local.getMonthValue();
		 
		 local.getDayOfMonth();
		 
		 System.out.println(LocalDate.now());
		return 25;
	}
	
}
