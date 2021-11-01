package com.bridgelabz;


		import java.io.*;
		class Swap
		{
		public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		System.out.println("enter first number..");
		i=Integer.parseInt(br.readLine());
		System.out.println("enter second number..");
		j=Integer.parseInt(br.readLine());
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("after swapping first number is "+ i +" and second number is "+ j );
		}

	}


