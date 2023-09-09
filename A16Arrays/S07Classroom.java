
public class S07Classroom {
	S07Student[] students;
	int numStudentsAdded;

	public S07Classroom(int numStudents)
	{
		students = new S07Student[numStudents];
		numStudentsAdded = 0;
	}

	// Implement this method!
	// Returns the Student with the highest examImprovement score
	public S07Student getMostImprovedStudent()
	{
		S07Student x = null;
		int y = 0;
		// your code goes here and replace return statement!
		for (S07Student i: students) {
			if (i.getExamImprovement() > y) {
				y = i.getExamImprovement();
				x = i;
			}
		}
		return x;
	}

	public void addStudent(S07Student s)
	{
		students[numStudentsAdded] = s;
		numStudentsAdded++;
	}

	public void printStudents()
	{
		for(int i = 0; i < numStudentsAdded; i++)
		{
			System.out.println(students[i]);
		}
	}
}