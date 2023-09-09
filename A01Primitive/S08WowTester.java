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
8) Use of variables int, double, String, and char to form a computation in
addition to output.
9) Formatted output that includes int, double, string, and char one line
output for each type with an embedded string message.
10) A tabular output showing an x axis and y axis of fields and data. 
11) Proper use of both print and println.
12) An overall single theme for all your code.

Part 1:
Contains your variables.

Part 2:
Contains some level of computation for each data type.

Part 3:
Contains your output table with a title, field names, followed by lined up
data.

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
		String lastInitial = " S";
		//
		int id = 1734;
		char rating = 'c';
		double balance = 1672.89;
		//This adds the lastinitial to the name
		String name = "Sam" + lastInitial;

		// Printing out the variables just initialized
		System.out.println("Name     ID     Bank Rating     Bank Balance");
		System.out.println("---------------------------------------------");
		System.out.print(name + "    ");
		System.out.print(id+ "       ");
		System.out.print(rating + "             ");
		System.out.println("$" + balance);

		// This changes the last initial
		lastInitial = " B";

		//This resets the name to "sam"
		name = name.substring(0,3);

		//This adds the new lastInitial to the name
		name += lastInitial;

		//This changes the ID
		id += 500;

		//This changes the char
		rating = (char) (rating - 2);

		//This changes the bank balance
		balance += 8231.32;

		//This prints out the changed variables
		System.out.print(name + "    ");
		System.out.print(id+ "       ");
		System.out.print(rating + "             ");
		System.out.println("$" + balance);

		// This changes the last initial
		lastInitial = "" + " K";

		//This resets the name to "sam"
		name = name.substring(0,3);

		//This adds the new lastInitial to the name
		name += lastInitial;

		//This changes the ID
		id -= 327;

		//This changes the char
		rating = (char) (rating + 1);

		//This changes the bank balance
		balance -= 2092.23;

		//This prints out the changed variables
		System.out.print(name + "    ");
		System.out.print(id+ "       ");
		System.out.print(rating + "             ");
		System.out.println("$" + balance);
	}

}
