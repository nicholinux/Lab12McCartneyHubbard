/*
 * Name: Jacob McCartney, Nicholas Hubbard
 * Date: 5/2/25
 * Class: CSCI 1102
 * File: Lab12Prob01.java
 */
public class Lab12Prob01 {

	public static int recursiveAbstract(int num) {
		
		// Base cases: 0, 1, 2
		if (num == 0) {
			return 1;
		} else if (num == 1) {
			return 3;
		} else if (num == 2) {
			return 4;
		} else {
			// General case
			return recursiveAbstract(num - 3) * (recursiveAbstract(num - 2) - recursiveAbstract(num - 1));
		}
	}
}
