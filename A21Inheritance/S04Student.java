public class S04Student extends S04Person {
	private int grade;
	private double gpa;

	public S04Student (String name, String birthday, int grade, double gpa) 
	{
		super(name, birthday);
		this.grade = grade;
		this.gpa = gpa;
	}

	public int getGrade()
	{
		return grade;
	}

	public double getGpa()
	{
		return gpa;
	}

	/**
	 * To Override, we need to have the same method signature. Since we
	 * are Overriding the object class, we need to use an Object
	 * as the formal parameter. Then we need to cast that object to
	 * a Student to have access to the methods we need.
	 */
	/* TODO: 04B
	 * Does the tester code work the same if one used S04Student as the 
	 * parameter type instead of Object with the method below?
	 * Yes because you eventually need the S04Student object however 
	 * it will not be compatible with other types.
	 */
	/* TODO: 04C 
	 * Why not just use S04Student as the parameter type instead of 
	 * Object that way a cast is not required?
	 *   Since there are two subclasses in order for the person class be
	 *    compatible with the equals method you need to override the
	 *     object method or else it would not be able to compare properly.
	 * */

	public boolean equals(Object other) 
	{
		S04Student otherStudent = (S04Student) other;
		return super.getName().equals(otherStudent.getName()) 
				&& super.getBirthday().equals(otherStudent.getBirthday())
				&& this.grade == otherStudent.getGrade();
	}

}
