package com.learning.chaitanya.conditionalloops;

import java.util.Scanner;

import com.learning.chaitanya.utils.Mathematics;

public class DiceWithWhileLoop {
	
	public void testDice()
	{
		
		
		
		System.out.println("do you want to roll the dice");
		Scanner scan=new Scanner(System.in);
		String d=scan.next();
		while(d.equals("y"))
		{
			Mathematics math=new Mathematics();
			int m= math.getNumber(5, 10);
			System.out.println("Your number is: " +m);
			 
			
			System.out.println("do you want to roll the dice");
			d=scan.next();
			
			
			
		}
		
		System.out.println("Completed While loop");
		
		
		
		
	}

}
