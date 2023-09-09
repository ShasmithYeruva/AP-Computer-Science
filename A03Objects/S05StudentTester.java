/* TODO 05
This program starts with the Student class from earlier. Add a new instance 
variable (or field) that represents the number of clubs in which the student 
is a member.

Choose an appropriate datatype, and don’t forget to update the constructor! 
The toString method has already been updated for you.

Your output should be:

Alan Turing is in grade 9 is in 1 club(s).
Ada Lovelace is in grade 11 and is in 5 club(s).
 */
public class S05StudentTester {

	public static void main(String[] args) {
		S05Student alan = new S05Student("Alan", "Turing", 9, 1);
		S05Student ada = new S05Student("Ada", "Lovelace", 11, 5);

		System.out.println(alan);
		System.out.println(ada);
	}

}
