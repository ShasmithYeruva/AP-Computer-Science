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
https://docs.google.com/document/d/1cuLOiI9k12PXZ4EOdblGGwwxc65mX7Er/edit?usp=view

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

	/* This code will go through an array to see which value occurs the most.
	 *  If several values occur the same amount, return the first 
	 *  occurrence found with that amount.
	 */

	public static void main(String[] args) {

		// Creating the arrays
		int arr1[] = {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
		int arr2[] = {10,9,8,7,6,5,4,3,2,1,-99};
		int arr3[] = {10,20,30,40,50,10,10,40,30,20,10};
		int arr4[] = {32767};
		int arr5[] = {255,255};
		int arr6[] = {9,10,-88,100,-555,1000};
		int arr7[] = {10,10,10,11,456,10,10,2,2,2,2,2,2,2};
		int arr8[] = {-111,1,2,3,9,11,20,30};
		int arr9[] = {9,8,7,6,5,4,3,2,0,-2,-989};
		int arr10[] = {12,12,15,18,21,23,1000};
		int arr11[] = {250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1};
		int arr12[] = {9,10,-8,10000,-5000,1000};

		//Printing out the most frequent number in the arrays
		System.out.println(S08RayMostFreq.go(arr1));
		System.out.println(S08RayMostFreq.go(arr2));
		System.out.println(S08RayMostFreq.go(arr3));
		System.out.println(S08RayMostFreq.go(arr4));
		System.out.println(S08RayMostFreq.go(arr5));
		System.out.println(S08RayMostFreq.go(arr6));
		System.out.println(S08RayMostFreq.go(arr7));
		System.out.println(S08RayMostFreq.go(arr8));
		System.out.println(S08RayMostFreq.go(arr9));
		System.out.println(S08RayMostFreq.go(arr10));
		System.out.println(S08RayMostFreq.go(arr11));
		System.out.println(S08RayMostFreq.go(arr12));
	}
}

