import java.util.Scanner;

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
1) Start with the Wow Tester code that you generated from the A01Primitive 
assignment.
2) Use TesterHelper to create an instance of a Scanner. For the input 
file, use S08WowTester.txt.
3) Now take all of the hard coded variables from the previous assignment and
write scanner code to initialize the variables.
4) Manually write the input data into the S08WowTester.txt file to perform
a final test of your program. Your output from the A01Primitive assignment
should output the same information.


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

	/*
	 * This wow class initializes all variables, changes them, and 
	 * finally prints them out. It shows the name of the bank acount holder, the
	 *  ID of the bank account, the rating of the bank acount, and
	 *  the balance of the bank account.
	 */

	public static void main(String[] args) {
		// Initializing the variables
		Scanner input;
		input = TesterHelper.inputFile("S08WowTester.txt");
		String lastInitial = input.next();
		//
		int id = input.nextInt();
		char rating = input.next().charAt(0);
		double balance = input.nextDouble();
		//This adds the lastinitial to the name
		String name = input.next() + " " + lastInitial;

		// Printing out the variables just initialized
		System.out.println("Name     ID     Bank Rating     Bank Balance");
		System.out.println("---------------------------------------------");
		System.out.print(name + "    ");
		System.out.print(id+ "       ");
		System.out.print(rating + "             ");
		System.out.println("$" + balance);

		// This changes the last initial
		lastInitial = input.next();

		//This resets the name to "sam"
		name = name.substring(0,3);

		//This adds the new lastInitial to the name
		name += " " + lastInitial;

		//This changes the ID
		id += input.nextInt();

		//This changes the char
		rating = (char) (rating - input.nextInt());

		//This changes the bank balance
		balance += input.nextDouble();

		//This prints out the changed variables
		System.out.print(name + "    ");
		System.out.print(id+ "       ");
		System.out.print(rating + "             ");
		System.out.println("$" + balance);

		// This changes the last initial
		lastInitial = "" + input.next();

		//This resets the name to "sam"
		name = name.substring(0,3);

		//This adds the new lastInitial to the name
		name += " " + lastInitial;

		//This changes the ID
		id -= input.nextInt();

		//This changes the char
		rating = (char) (rating + input.nextInt());

		//This changes the bank balance
		balance -= input.nextDouble();

		//This prints out the changed variables
		System.out.print(name + "    ");
		System.out.print(id+ "       ");
		System.out.print(rating + "             ");
		System.out.println("$" + balance);
	}

}
