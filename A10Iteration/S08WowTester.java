/* TODO: 08
S08WowTester Class

This assignment challenge criteria for the WowTester.
1) An overall description on what you are attempting to accomplish
2) A description of each method stating its functional purpose.
3) The output should be message based, not just raw numbers.
4) Methods and variables are formatted with the proper lower camel case.
5) Classes are formatted with upper camel case. 
6) Code is properly indented <Ctrl><a> followed by <Ctrl><i>
7) Comments and code should not exceed 80 columns. 

Specific to this assignment:
8) Compute PI using the Gregory-Leibniz Series formula 
https://crypto.stanford.edu/pbc/notes/pi/glseries.html
9) The number of iterations shall be stored as an input variable
that is read from the S08WowTesterInput.txt file.
10) Include at least 4 test cases in your input. The final test case
is a number over 4000.

Practice exercise that is not graded:
Use the Nilakantha Series to compute PI to a specified points of precision
http://www.maeckes.nl/Formule%20voor%20pi%20(Nilakantha)%20GB.html
use Math.PI as a baseline comparison.

====================================
The WowTester code is designed as a freelance learning assignment required for 
all students to experience the joy of testing.

WowTester code cannot not be embedded inside an assignment class.  

If the WOW code requires input prompts, the input prompts must come from 
either the randomizer class utility or use a text file input.

The test code must be placed in the S08WowTester.java file.  If you decide 
to add unique files as part of this exercise, include those files in the 
archive by adding a zc.addEntry("<filename.ext>"); line to the Tester.java 
main method for each new file.
 */

/* This code uses formulas in order to calculate the 
 * value of Pi biased on the amount of iterations inputed
 */ 

public class S08WowTester {
	// This code computes PI by using the Gregory-Leibniz Series formula
	// and then prints out the output
	public void computePI(int compute){
		double pi = 1;
		for(int i = 3; i < compute + 3; i += 4) {
			pi -= 1.0/i;
			pi += 1.0/(i + 2.0);
			;
		}
		System.out.println("After " + compute + " iteratations "
				+ "PI is calculated as " + pi * 4 + "\n" +
				"====================================="
				+ "==============================");
	}
	public static void main(String[] args) {
		// This code tests the computePi method to 
		// check if the code works as intended
		S08WowTester x = new S08WowTester();
		System.out.println("PI is acutally equal to " + Math.PI + "\n" +
				"====================================="
				+ "==============================");
		x.computePI(2);
		x.computePI(8);
		x.computePI(100000);
		x.computePI(99999999);

	}

}
