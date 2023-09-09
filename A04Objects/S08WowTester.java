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
https://docs.google.com/document/d/1R_4Ni7tqegmLe4fYzQL1kr7McmmbvIOqCR_zVYzNOUQ/edit?usp=view

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
	/* This code takes the name, address,latitude and longitude of two different
	 * by using a constructor and then takes the objects and 
	 * compares the distance between the two of them.
	 */
	public static void main(String[] args) {
		// Object One
		S08GeoLocation building = new S08GeoLocation(33.123961, -96.798735);
		// Printing out the longitude and latitude of object one
		System.out.println(building);
		S08Place buildingPlace = new S08Place("Frisco ISD Admin Building", 
				"5515 Ohio Dr, Frisco, TX 75035", building);
		// Printing the name and address of object one
		System.out.println(buildingPlace);
		//Object Two
		S08Place school = new S08Place("Memorial high school", 
				"12300 Frisco st., Frisco, TX 75035", 33.1799, -96.8297);
		// Printing out object two
		System.out.println(school);
		// Printing out the distance between the two objects
		System.out.println(buildingPlace.distanceTo(school));
	}
}
