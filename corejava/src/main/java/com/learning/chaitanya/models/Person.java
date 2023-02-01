package com.learning.chaitanya.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Person {
	
	public String firstName;
	public String lastName;
	public String dob;
	private int age;
	
	
	
	public int getAge()
	{
		// we need to read the DOB property in this function.
		// convert DOB into date type.
		// get todays date.
		// if we can compare todays date with the converted date type we will 
		// - get the difference between this two dates.
		 SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		
		 try {
		 Date startDate = sdf.parse(dob);
			Instant instant=startDate.toInstant();
			ZonedDateTime z=instant.atZone(ZoneId.systemDefault());
			LocalDate start_date=z.toLocalDate();
			LocalDate end_date=LocalDate.now();
			 
			 Period diff
	            = Period
	                  .between(start_date,
	                           end_date);
			
			 age = diff.getYears();
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return age;
	}
	
}
