package com.bridgelabz;

public class LargestOfThree
{

	
		static void largest(int x, int y, int z) {
		    int max = x;

		    if (x >= y && x >= z)
		      max = x;
		    if (y >= x && y >= z)
		      max = y;
		    if (z >= x && z >= y)
		      max = z;

		    System.out.println("largest number among three is : "+ max);
		                      
		  }  

		public  static void main(String[] args)
		{
		    largest(100, 50, 25);
		    largest(50, 50, 25);

	}

}

