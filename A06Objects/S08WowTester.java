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
The BAM format is used in aviation computations to perform math equations
with angles and ensure that the angle always remains within a specified 
range.  For this case, the angle will range from 0 to less than 360.0.

For more information on the BAM format, refer to the following document.
https://drive.google.com/file/d/1xgY0Z-BcvTCxIWUXyAjPFcmlVvvcDyxf/view?usp=view

 *** NOTE: The difference with the above paper and this assignment is that *** 
 *** int is 32 bit storage instead of 16 bit storage.                      ***  

Write an BAMAngle class with the following methods using the 
8) A constructor that will accept an angle in degrees (double) and internally 
store the value in BAM format (int) as a private attribute.

9) A method with the following signature 
public void addAngle(BAMAngle deltaAngle)
that will add a delta BAMAngle to the internally stored angle.

10) A method with the following signature 
public void subtractAngle(BAMAngle deltaAngle) 
that will subtract a delta BAMAngle to the internally stored angle.

11) A method with the following signature
public double getDegrees() 
that will return the internally stored BAM angle in degrees.

12) Test for an overflow condition. Initialize two angles one with 350.0
degrees and the second with 20.0 degrees and add them together.  Print the 
returns of the getDegrees method.

13) Test for an underflow condition. Subtract the 350.0 degrees from the 
20 degree angle.  Print the returns of the getDegrees method.

14) An access method is not required and should NOT be implemented to get 
or set the private BAM format int attribute.

If you did the assignment properly, the output should always be greater than
or equal to 0 and less than 360.0 without implementing any if statements.


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



	/*
	 *This class will be able to convert from doubles to BAM in 
	 * order to reduce the storage size of the file
	 */

	public static void main(String[] args) {
		// Creating the objects
		S08BAMAngle a = new S08BAMAngle(90);
		S08BAMAngle b = new S08BAMAngle(45);
		S08BAMAngle c = new S08BAMAngle(359);
		// Printing out the objects as degrees
		System.out.println(a.getDegrees());
		System.out.println(b.getDegrees());
		System.out.println(c.getDegrees());
		// Adding the angle to another angle
		a.addAngles(b);
		b.addAngles(c);
		// Printing out the angle after adding angles
		System.out.println(a.getDegrees());
		System.out.println(b.getDegrees());
		System.out.println(c.getDegrees());
		// Subtracting the angle from another angle
		c.subtractAngles(a);
		b.subtractAngles(c);
		// Printing out the angle after subtracting angles
		System.out.println(a.getDegrees());
		System.out.println(b.getDegrees());
		System.out.println(c.getDegrees());
	}
}
