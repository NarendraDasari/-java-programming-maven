package com.learning.chaitanya.arrays;

import com.learning.chaitanya.models.Person;
import com.learning.chaitanya.models.Vehical;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysTest array=new ArraysTest();
		//array.testSimpleArrays(5);
		
		
		
		
		Person p1 = new Person();
		p1.firstName = "p1-firstname";
		p1.lastName = "p1-lastname";
		p1.dob = "2024";
		p1.age = 2;
		
		Person p2 = new Person();
		p2.firstName = "p2-firstname";
		p2.lastName = "p2-lastName";
		p2.dob = "2021";
		p2.age = 56;
		
		Person p3=new Person();
		p3.firstName="p3-xxxxx";
		p3.lastName="p3-yyyyy";
		p3.dob="2000";
		p3.age=3;

		
		
		Person[] pList = new Person[3];
		pList[0] = p1;
		pList[1] = p2;
		pList[2] =p3;
//		
//		System.out.println(p1);
//		System.out.println(p1.getClass());
//		System.out.println(p1.toString());
		
		array.testSimpleArrays(pList);

		
		Vehical v1=new Vehical();
		v1.make="honda";
		v1.model="2000";
		v1.color="red";
		
		Vehical v2=new Vehical();
		v2.make="tayota";
		v2.model="2022";
		v2.color="blue";
		
		Vehical[] veh=new Vehical[2];
		veh[0]=v1;
		veh[1]=v2;
		
		
		array.printVehicals(veh);
		

	}

}
