/* TODO: 03
In this exercise, you will write a class that represents how you spend your 
time.

The class should have four double instance variables

school
sleep
friends
hobbies
These variables will track the number of hours you spend doing each of these 
activities in a single day.

The class should have mutators and accessors for each instance variable.

It should also have a method called printTotal that should print the total 
number of hours per week you spend doing all of these activities.

Note you will have to calculate the weekly hours by using the daily hours 
stored in the instance variables. It should also print the total number of 
hours in the week that you are busy.

Here is an example of the output of printTotal if sleep = 8, school = 8, 
friends = 2.5, and hobbies = 2.

Expected Output:
You're busy 143.5 hours a week!
 */

public class S03RoutineTester {

	public static void main(String[] args) {
		S03Routine myWeek = new S03Routine();

		myWeek.setSchool(8);
		myWeek.setHobbies(2);
		myWeek.setFriends(2.5);
		myWeek.setSleep(8);

		// Prints the totals for the WHOLE WEEK
		myWeek.printTotal();


	}

}
