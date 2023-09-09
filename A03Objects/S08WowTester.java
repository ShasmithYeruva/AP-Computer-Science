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
1) Write a class from scratch associated with your favorite action hero.
2) The class constructor should include: 
	A) a String type with their name as
	B) a boolean to indicate if they are a hero or villain
	C) an integer to indicate their age
	D) a double to indicate their power level
3) Use the Wow Tester to create two instances
    A) A Hero Instance
    B) A Anti-Hero Instance
4) Create a toString method to output a message about the hero and 
   anti-hero that incorporates all of the variables
5) Print the hero and anti-hero objects one at a time in the Wow Tester.

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


/* This wow class uses a constructor with a string related to the names of 
 * my hero (Mr.Pla) and the anti-hero(full head Ed), a 
 * boolean related to their status as a anti-hero or a hero, an integer for 
 * their ages, and a double to show each of their power levels
 */
public class S08WowTester {

	public static void main(String[] args) {
		// This is the Hero instance
		S08MrPla hero = new S08MrPla("Mr.Pla", true, 57, 93.87);
		// This is the Anti-Hero instance
		S08MrPla antiHero = new S08MrPla("Full Head Ed", false, 27, 85.12);
		// These lines of code use the toString in order to print out messages
		System.out.println(hero);
		System.out.println(antiHero);	
	}

}
