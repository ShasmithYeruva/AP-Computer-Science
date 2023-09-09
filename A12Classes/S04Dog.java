
public class S04Dog {
	private String name;
	private String breed;
	private boolean hasShots;

	// Add your constructors here
	public S04Dog (String name, String breed, boolean hasShots) {
		this.name = name;
		this.breed = breed;
		this.hasShots = hasShots;
	}
	public S04Dog (String name, String breed) {
		this.name = name;
		this.breed = breed;
		hasShots = false;
	}

	public String toString(){
		String output = "Name: " + name;
		output += ", Breed: " + breed;

		if(hasShots)
		{
			output += ", Up to date on shots!";
		}
		else
		{
			output += ", Missing shots";
		}

		return output;
	}
}
