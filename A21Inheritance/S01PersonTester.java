/* TODO: 01A 
 * Try removing the commenting of the code below to see what it does.
 * */
/* TODO: 01B
 * Why is that printGrade causes a compilation error when it is 
 * clearly defined as part of the S01Student class?
 * When we run this code as is, we get an error.
 * Since lovelace is a declared as a Person type
 * and printGrade only exists in the Student class
 * the program doesn't compile.
 */
public class S01PersonTester {
	public static void main(String[] args) {

		S01Person jobs = new S01Person("Steve");
		S01Student lovelace = new S01Student("Ada", 12);
		jobs.printName();
		lovelace.printGrade();

	}

}
