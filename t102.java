package prac1;

import java.io.*;
import java.util.Scanner;

class t102 {
	
    public static void main (String[] args) {
    	
    	System.out.print("Enter Your Strings: ");
        Scanner in = new Scanner(System.in); 
        String input = in.nextLine();   //input data from user & store on 'input' variable
        String output = ""; //'output' variable initialize it with 0
        
        for (int i = input.length()-1; i >= 0; i--) {
        	 output = output + input.charAt(i); //reverse the string & stored new data in 'output' variable 
         }
         
        if (input.toLowerCase().equals(output.toLowerCase())) {//compare the reversed string
        	System.out.println(input+" is a palindrome");
           } 
        else {
        	System.out.println(input+" is not a palindrome!");
        	}    
/*
1. for loop ➔  To get the characters of the input in the reverse order.
2. input.length()-1 ➔ Because characters in the string are indexed from 0.
3. input.charAt(i) ➔  Returns character value to the index of the string and store it in 'output'.
4. toLowerCase() ➔  converts input, output to lowercase because java is case sensitive.
5. equals() ➔  checks if two strings are equal. 
*/
        
         in.close(); //close Scanner
    }
}
    


