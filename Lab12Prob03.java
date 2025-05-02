/*
 * Name: Jacob McCartney, Nicholas Hubbard
 * Date: 5/2/25
 * Class: CSCI 1102
 * File: Lab12Prob03.java
 */

public class Lab12Prob03 {

	public static void main(String[] args) {
		System.out.println(reverseString("hello nicholas"));
	}
	
	public static String reverseString(String str) {
		return reverseString(str, str.length() - 1);
	}
	
	public static String reverseString(String str, int pointer) {
		
		// Base case: pointer = 0
		if (pointer == 0) {
			return "" + str.charAt(0);
		} else {
			return str.charAt(pointer) + reverseString(str, pointer - 1);
		}
	}
}