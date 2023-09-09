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
Remember that Hero assignment from assignment 3.  This time we are going to
enhance our heros with a land vehicle accessory.

1) Write a class from scratch associated with a land vehicle owned by the 
   hero and anti-hero.  The vehicle should have the following attributes
   A) a String with the name of vehicle
   B) a double associated with the top speed of the vehicle.
   C) an integer indicating number of wheels
   D) a boolean indicating if the vehicle is gas or electric.

2) The land vehicles are constructed prior to the hero and villain and 
   assigned to the hero and villain during their class construction.

3) From the hero class, you should be able to print the 
   vehicle name, vehicle top speed, number of wheels, 
   or if the vehicle is gas or electric from a toString() method.

4) Write a class from scratch associated with your favorite action hero.

5) The class constructor should include: 
	A) a String type with their name as
	B) a boolean to indicate if they are a hero or villain
	C) an integer to indicate their age
	D) a double to indicate their power level
	E) a land vehicle type. (*** new from the previous assignment ***)

6) Use the WowTester to create four instances
    A) A Hero land vehicle (*** new from the previous assignment ***)
    B) A Hero Instance
    C) A Anti-Hero land vehicle (*** new from the previous assignment ***)
    D) A Anti-Hero Instance

7) Create a toString method to output a message about the hero and 
   anti-hero that incorporates all of the attributes.

8) Print the hero and anti-hero objects one at a time in the Wow Tester.

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

	/* This wow class uses a constructor with a string related to the names of 
	 * my hero (Mr.Pla) and the anti-hero(full head Ed), a 
	 * boolean related to their status as a anti-hero or a hero, an integer for 
	 * their ages, a double to show each of their power levels, and a S08WowVehicle
	 * that makes a vehicle for the hero/anti-Hero. After this it prints it out.
	 */

	public static void main(String[] args) {
		// This is the Hero's vehicle instance
		S08WowVehicle heroVehicle = new S08WowVehicle("Plamobile", 175, 6, true);
		// This is the Hero instance
		S08MrPla hero = new S08MrPla("Mr.Pla", true, 57, 93.87, heroVehicle);
		// This is the Anti-Hero's vehicle instance
		S08WowVehicle antiVehicle = new S08WowVehicle ("Tesla", 215, 4, false);
		// This is the Anti-Hero instance
		S08MrPla antiHero = new S08MrPla("Full Head Ed", false, 27, 85.12, antiVehicle);
		// These lines of code use the toString in order to print out messages
		System.out.println(hero);
		System.out.println(antiHero);	
	}

}
