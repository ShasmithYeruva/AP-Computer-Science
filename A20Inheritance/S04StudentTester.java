/* TODO: 04
In this exercise, we are going to look at creating a Superclass / Subclass 
relationship for Students.

Our superclass will be the Student class and contain the following instance 
variables:

String name - Student�s first and last name
int id - Student�s ID number
double gpa - Student�s GPA
Our subclass will be StudentAthlete and contain the following instance 
variables:

String sport - Name of sport student plays
String level - The level at which the student plays (varsity, junior 
varsity, etc)

For this exercise, you will focus on the constructors for both classes. 
Remember that your subclass constructor needs to call the superclass 
constructor, so make sure you have the parameters to do that.

Note: For the autograder, your constructor needs to list the parameters 
in the order they are listed above.

The classes will have getters and a toString, but no setters. You can use 
these to test, but do not need to alter them.

Once completed, create two students as noted in the StudentTester class.

 */
public class S04StudentTester {
	public static void main(String[] args) {	       
		/**
		 * Create a student with id # 123987, GPA: 2.56
		 */
		S04Student one = new S04Student("Sam young", 123987, 2.56);

		/**
		 * Create a student athlete with id # 987456, GPA: 3.47,
		 * who plays lacrosse for the varsity team 
		 */
		S04StudentAthlete two = new S04StudentAthlete("John Deere", 987456,
				3.47, "lacrosse", "varsity");
		// Print out both objects
		System.out.println(one);
		System.out.println(two);
	}

}
