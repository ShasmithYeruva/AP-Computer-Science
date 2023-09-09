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
8) Using the exercises in this assignment as an example, write your own
   program to formulate a real life scenario that takes an input and 
   outputs different messages based on a range check.
9) The program shall have at least 4 range conditions.
10) The program shall use S08WowTesterInput.txt as your input.
11) The program shall implement at least 6 test cases.
12) All range conditions shall be exercised at least one time.
13) The minimum and maxium range conditions shall be executed at 
    least two times.
14) The program shall utilize the "if" and "else if" statements.
15) The program shall not utilize compound conditional statements. A 
    compound conditional statement is one using an and "&&" or an or "||" 
    clause. This also excludes the use of bitwise operators.
16) The program shall not utilize nested if statements. A nested if 
    statement is an if statement within an if statement.

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
public class S08WowTester {
	/* This code takes the name and rating of a hero and 
	 * then outputs how the public sees the hero 
	 * depending on the rating that was inputed.
	 */
	public static void run(TScanner input) {
		//Asking for the name of the hero and taking the input
		System.out.print("what is the name of the hero? ");
		String name = input.nextLine();
		//Asking the rating of the hero and the taking the input
		System.out.print("What is you rating of this hero from 1 to 10? ");
		double rating = input.nextDouble();
		//Making a new hero object
		S08Wow hero = new S08Wow(name, rating);
		//printing out the object
		System.out.println(hero);
		//Goes to the next line to take the next input
		if(input.hasNextLine()) {
			input.nextLine();
		}
	}
	public static void main(String[] args) {
		//Takes the input from the WowTesterInput txt file
		TScanner input = new TScanner("S08WowTesterInput.txt");
		//runs the code 5 times
		int NUMBER_OF_TEST_CASES = 5;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input);
		}
	}
}
