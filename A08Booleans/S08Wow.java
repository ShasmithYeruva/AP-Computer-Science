
public class S08Wow {
	//Initializing the variables
	private String name;
	private double rating;
	// This is a constructor
	public S08Wow(String name, double rating) {
		this.name = name;
		this.rating = rating;
	}
	//gets the name of the hero
	public String getName() {
		return name;
	}
	//gets the rating of the hero
	public double getRating() {
		return rating;
	}
	//Takes the rating of the hero and then 
	//returns how the public views the hero
	public String heroView() {
		String x = null;
		if (getRating() >= 11) {
			x = "a godlike hero who broke the scale";
		}
		else if (getRating() >= 10) {
			x = "an amazing hero";
		}
		else if (getRating() >= 7 ) {
			x = "a good hero";
		}
		else if (getRating() >= 4) {
			x = "an average hero";
		}
		else if (getRating() <= 3) {
			x = "a bad hero";
		}
		return x;
	}
	//This prints out a statement explaining the hero's 
	//name, rating, and their view in the public's eyes
	public String toString() {
		return getName() + " is rated as a " + getRating() + 
				" out of 10 which means"
				+ " they are seen as " + heroView() + ".";
	}
}
