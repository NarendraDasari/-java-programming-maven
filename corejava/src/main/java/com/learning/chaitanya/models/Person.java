package com.learning.chaitanya.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
		 SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		 try {
			 String formattedDob  = dob.replaceAll("/", "-");
			Date startDate = sdf.parse(formattedDob);
			
			Instant instant=startDate.toInstant();
			ZonedDateTime z=instant.atZone(ZoneId.systemDefault());
			LocalDate start_date=z.toLocalDate();
			
			start_date.getYear();
			System.out.println("year:"+ start_date.getYear());
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// DateFormat.
		 
		 Date d=new Date();
		 
		// LocalDate startDate = LocalDate.parse(dob);

		// System.out.println("year:" +d.getYear());
		 System.out.println(d);
		 System.out.println(sdf.format(d));
		 
		 LocalDate local=LocalDate.now();
		  int year=local.getYear();
		 
		int month= local.getMonthValue();
		 
		 int day=local.getDayOfMonth();
		 
		System.out.println(LocalDate.now());
		
		//LocalDate lDate = LocalDate.
		return 25;
	}
	
}
