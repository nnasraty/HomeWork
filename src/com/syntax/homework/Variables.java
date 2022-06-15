package com.syntax.homework;

public class Variables {

	public static void main(String[] args) {
		/* 1. Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say. " The____of 2 numbers____and____is equal_____"
		 
		 * 2. Write a program to find the square of the number 3.9. Your program should say "The square of the ...
		 * 	  is_____"
		 * 3. Write a program to print the area and perimeter of a rectagle with width=5 and height=8. 
		 *    Your program should say: "The primeter of a rectangle with width____and height___is equal
		 *    to____and the area is___"
		 */
		
			double num1 = 45.8;
			double num2 = 25.324;
			char num3 = '"';
			double add = num1+num2;
			double sub = num1-num2;
			double multi= (num1*num2);
			double divide = (num1/num2);
			
			System.out.println(num3+"The addition of 2 numbers "+num1+ " and "+num2+" is equal to "+add+num3);
			System.out.println(num3+"The addition of 2 numbers "+num1+ " and "+num2+" is equal to "+sub+num3);
			System.out.println(num3+"The addition of 2 numbers "+num1+ " and "+num2+" is equal to "+multi+num3);
			System.out.println(num3+"The addition of 2 numbers "+num1+ " and "+num2+" is equal to "+divide+num3);
			//2.
			double a = 3.9;
			double square = (3.9*3.9);
			System.out.println(num3+"The square of the "+a+ " is "+square+num3);
			
			//3.
			int w = 5;
			int h = 8;
			int perimeter = 2*(w*h);
			int area = (w*h);
			System.out.println(num3+"The perimeter of a rectangle with width "+w+ " and height "+h+" is equal to "+perimeter+
					" and the area is "+area+num3);
			
			
			
			
			
				   
				   
		
	}

}
