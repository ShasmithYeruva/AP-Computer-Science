public class S04Teen {
	private String firstName;
	private String lastName;
	private int grade;

	// Constructor to make a teen with a first name, last name, 
	// and grade in school. 

	// This defines the state of the teen.
	public S04Teen(String theFirstName, String theLastName, int theGrade)
	{
		firstName = theFirstName;
		lastName = theLastName;
		grade = theGrade;
	}

	// toString method to print out the state of teen object
	public String toString()
	{
		return firstName + " " + lastName + " is in grade " + grade + 
				" and wants to send this text.";
	}

	// Create this method so that it changes the text message 
	// by replacing '.' and '!' with "!!".
	public String teenTalk(String text)
	{
		// Add code here
		if(text.indexOf('!') != -1){
			text = text.replace("!","!!");
		}
		if (text.indexOf('.') != -1) {
			text = text.replace(".","!!");
		}
		return text; 
	}

}
