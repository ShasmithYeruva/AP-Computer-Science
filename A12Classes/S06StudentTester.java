/* TODO: 06
We are going to use the Student class that we completed in the last exercise 
and add a new SchoolClub class. Start by copying over your Student class from 
the last exercise.

After that, add the constructor for the SchoolClub class. For this class, your 
constructor should take a Student object for the leader and a String club name 
(in that order). You should also initialize the number of members at zero in 
the constructor.

Test your code with the StudentTester class. This is the same as the last 
exercise, so you will need to add a statement to create a club and then print 
it out.

 */


public class S06StudentTester {

	public static void main(String[] args) {

		S05Student alan = new S05Student("Alan", "Turing", 11, "Liberty High School");
		S05Student ada = new S05Student("Ada", "Lovelace", 5);

		System.out.println(alan);
		System.out.println(ada);

	}

}
