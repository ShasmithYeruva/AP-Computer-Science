
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
8) Write a program to determine if a sentence is a palindrome.
9) Test with three examples
====================================
The WowTester code is designed as a freelance learning assignment required for 
all students to experience the joy of testing.

WowTester code cannot not be embedded inside an assignment class.  

If the WOW code requires input prompts, the input prompts must come from 
either the randomizer class utility or use a text file input.

The test code must be placed in the S08WowTester.java file.  If you decide 
or are required to add unique files as part of this exercise, include those 
files in the  archive by adding a zc.addEntry("<filename.ext>"); line to the 
Tester.java main method for each new file.

 */
public class S08WowTester {

	public static void main(String[] args) {
		/*
		 * This program determines if a sentence or word is a palindrome by
		 *  finding the length of the string and then reversing them.
		 */
		//creating the objects
		S08Wow one = new S08Wow("Radar");
		S08Wow two = new S08Wow("Bob");
		S08Wow three = new S08Wow("Super");

		//printing out the objects
		System.out.println(one.isPaladrome());
		System.out.println(two.isPaladrome());
		System.out.println(three.isPaladrome());
	}
}
