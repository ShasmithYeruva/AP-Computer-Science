import java.util.ArrayList;
public class S06Student
{
	private String name;
	private int grade;
	//Implement classList here:
	private static ArrayList<S06Student> classList = new  ArrayList<S06Student>();
	public S06Student(String name, int grade)
	{
		this.name = name;
		this.grade = grade;
		classList.add(this);
	}

	public String getName()
	{
		return this.name;
	}

	public int getGrade()
	{
		return this.grade;
	}

	//Add the static methods here:
	/*Don't change the code in this method except to uncomment code!
    This method will print out all the Student names in the classList Array
	 */
	public static String printClassList()
	{
		String names = "";

		for(S06Student name: classList)
		{
			names+= name.getName() + " ";
		}
		return "Student Class List: " + names;
	}

	public static String getLastStudent() {
		int x = getClassSize();
		return classList.get(x - 1).getName();
	}

	public static S06Student getStudent(int i) {
		return classList.get(i);
	}

	public static void addStudent(int i, S06Student s06Student) {
		classList.add(i, s06Student);
		int lastIndex = classList.size() - 1;
		classList.remove(lastIndex);

	}

	public static int getClassSize() {
		return classList.size();
	}
	public String toString() {
		return name;
	}
}