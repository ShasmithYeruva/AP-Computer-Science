/* TODO: 04A
 * Try running this program to see what it does.
 * */
public class S04StudentTester {

	public static void main(String[] args) {
		S04Student student1 = new S04Student("Isabella", "4/15/2004", 8, 4.0);
		S04Student student2 = new S04Student("Destiny", "7/7/2004", 8, 3.9);
		S04Student student3 = new S04Student("Isabella", "4/15/2004", 8, 4.0);

		System.out.println("Student 1 = Student 2? " + student1.equals(student2));
		System.out.println("Student 1 = Student 3? " + student1.equals(student3));
	}

}
