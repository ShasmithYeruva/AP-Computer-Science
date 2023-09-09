
public class S06Exercise {
	private String name;
	private String programmingLanguage;
	private int points;
	private int difficulty; // scale of 1 - 5

	// Default constructor.
	public S06Exercise() 
	{
		name = "Hello World";
		programmingLanguage = "Java";
		points = 10;
		difficulty = 3;
	}

	// Edit code in this constructor.
	public S06Exercise(
			String name, String programmingLanguage, 
			int points, int difficulty) 
	{
		this.name = name;
		this.programmingLanguage = programmingLanguage;
		this.points =  points;
		this.difficulty = difficulty;
	}

	public String getName() {
		return name;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public int getPoints() {
		return points;
	}

	public int getDifficulty() {
		return difficulty;
	}

}
