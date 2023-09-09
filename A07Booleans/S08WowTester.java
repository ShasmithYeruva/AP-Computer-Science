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
8) Write your own example with 3 double inputs similar to the test cases
in this exercise.

9) Develop a computation with those three inputs.
10) Provide a comparison output to an expected threshold range
expected min <= value <= expected max
.
11) Your code should have at least 5 test cases. 
(1) A boundary condition just below success range
(2) A boundary condition at the beginning of the success range
(3) A boundary condition in the middle of success range
(4) A boundary condition at the end of the success range
(5) A boundary condition just after success range.

12) Use S08WowTesterInput.txt as your input.

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
	 * This Wow class takes the name and amount of pages read in the 
	 * textbook in order to find out if the 
	 * student has read enough pages in the textbook for the day or not
	 * If the student has not read enough pages in the textbook in the day
	 * then it shows how many they need to read for the day
	 */

	public static void run(TScanner input, S08Wow Wow) {
		// Finding out the name of the student with a scanner
		System.out.println("What is the student's name?");
		String name = input.nextLine();
		// Finding out the amount of pages read in the textbook today
		// with a scanner
		System.out.println("How many pages of the texbook have they read? ");
		double pages = input.nextDouble();
		if(input.hasNextLine()) {
			input.nextLine();
		}
		// Creating an object
		S08Wow student = new S08Wow();
		// Setting the name of the student
		student.setStudent(name);
		// Setting the amount of pages read in the textbook
		student.setPagesRead(pages);
		// Printing out the student object
		System.out.println(student);
	}

	public static void main(String[] args) {

		TScanner input = new TScanner("S08WowTesterInput.txt");
		S08Wow wow = new S08Wow();

		/* TODO: 07B Modify the number of test cases to match your input */
		int NUMBER_OF_TEST_CASES = 8;
		for (int i = 0; i < NUMBER_OF_TEST_CASES; i++) {
			run(input,wow);
		}
	}
}
