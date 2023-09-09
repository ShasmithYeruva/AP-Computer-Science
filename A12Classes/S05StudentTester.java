/* TODO: 05
We are going to use the S05Student class and complete it by writing 
a two constructors (overloading the constructor).

The first constructor should take first name, last name, grade, and 
school, then set all the instance variables accordingly.

The second constructor should take first name, last name, and grade. 
Set all 4 instance variables, but for school, set it generically to 
high school, middle school, or elementary as follows:

Grades 9-12 - high school
Grades 6-8 - middle school
All others - elementary school
You should also update the toString method to include “and goes to” 
and the school level that the Student goes to.
 */
public class S05StudentTester {

	public static void main(String[] args) {
		S05Student alan = new S05Student("Alan", "Turing", 11, "Liberty High School");
		S05Student ada = new S05Student("Ada", "Lovelace", 5);

		System.out.println(alan);
		System.out.println(ada);
	}

}
