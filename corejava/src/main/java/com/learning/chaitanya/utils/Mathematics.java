package com.learning.chaitanya.utils;

import java.util.Random;

public class Mathematics {
	
	
	//this function generates a random number between starting number and ending number.
	public int getNumber(int start,int end)
	{
		Random random = new Random();
		int number =random.nextInt(end);
		int add=number + 1;
		
		return add;
	}

}
