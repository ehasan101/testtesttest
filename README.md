

## TASK:
Write a Java program that takes a string as input and checks whether it is a palindrome or not.
A palindrome is a word, phrase, or sequence of characters that reads the same backward as forward \
Also Test your program with different input strings to ensure it works correctly.



## INPUT SAMPLE:
"level" is a palindrome. \
"java" is not a palindrome.



## SOLUTION:

``` Java
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
    



    
```
## TEST PORGRAM WITH DIFFERENT INPUT:
![1](https://drive.google.com/uc?export=view&id=1h5eGkCfvGZodbJ5xX4gFxC9hQk0absnW)
![2](https://drive.google.com/uc?export=view&id=1YBLvdKDB5Dx4APw5UG0GfyrCC_gD6WTc)
![3](https://drive.google.com/uc?export=view&id=15tVHL29fW5it4yqn8UNkRZD8keQqjCbM)


---
### **#Happy_Coding**
---





