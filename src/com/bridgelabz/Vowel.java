package com.bridgelabz;

import java.util.Scanner;

public class Vowel 
{
 public static void main(String args[])
 {
	 Scanner s = new Scanner(System.in);
	 String n = s.next();
	 char ch = n.charAt(0);
	 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
     {

         System.out.println(ch + " is Vowel.");

     }
     else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
     {
         System.out.println(ch + " is Consonant.");            
     }

}
}
