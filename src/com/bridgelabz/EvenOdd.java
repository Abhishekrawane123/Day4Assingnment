package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		 int Number = s.nextInt();
         
         
         if (Number % 2 == 0)
         {
             System.out.println("Entered Number is an Even Number");
         }
         else
         {
        	 System.out.println("Entered Number is an Odd Number");
         }

	}

}
