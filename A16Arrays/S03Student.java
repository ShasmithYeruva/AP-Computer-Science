/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and grade.
 */
public class S03Student
{
	// Attributes
	private String firstName;
	private String lastName;
	private int gradeLevel;

	// Constructor
	public S03Student(String fName, String lName, int grade)
	{
		firstName = fName;
		lastName = lName;
		gradeLevel = grade;
	}

	public String getFirstName()
	{
		// replace return value
		return firstName;   
	}

	// new getter
	public String getLastName()
	{
		// replace return value
		return lastName;   
	}

	// new getter 
	public int getGradeLevel()
	{
		// replace return value
		return gradeLevel;
	}


	public String toString()
	{
		return "Student " + lastName + ", " + firstName;
	}

}