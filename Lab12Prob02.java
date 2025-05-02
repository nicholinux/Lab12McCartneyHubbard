/*
 * Name: Jacob McCartney, Nicholas Hubbard
 * Date: 5/2/25
 * Class: CSCI 1102
 * File: Lab12Prob02.java
 */

public class Lab12Prob02 {
	
	public static void main(String[] args) {
		System.out.println(reverseString("Hello nick"));
	}
	public static String reverseString(String str) {
		
		// Base case: string is only 1 character
		if (str.length()  == 1) {
			return str;
		} else {
			return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		}
	}
}
