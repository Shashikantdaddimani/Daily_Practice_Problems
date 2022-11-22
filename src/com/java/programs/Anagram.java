package com.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	//Driver class
		public static void main(String[] args) {
			 // Create an object of Scanner class
			Scanner sc =new Scanner(System.in);
			
			// Take input from users
			System.out.println("Enter First Word");
		        String str1=sc.next();
			System.out.println("Enter second word");
		        String str2=sc.next();
		  
		        //Converting both the string to lower case.  
		        str1 = str1.toLowerCase();  
		        str2 = str2.toLowerCase();  
		  
		        //Checking the length of both strings  
		        if (str1.length() != str2.length()) {  
		            System.out.println("Both the strings are not anagram");  
		        }  
		        else {  
		            //Converting both the arrays to character array  
		            char[] string1 = str1.toCharArray();  
		            char[] string2 = str2.toCharArray();  
		  
		            //Sorting the arrays using in-built function sort ()  
		            Arrays.sort(string1);  
		            Arrays.sort(string2);  
		  
		            //Comparing both the arrays using in-built function equals ()  
		            if(Arrays.equals(string1, string2) == true) {  
		                System.out.println("Both the strings are anagram");  
		            }  
		            else {  
		                System.out.println("Both the strings are not anagram");  
		            }  
		        }  
		    }  
}
