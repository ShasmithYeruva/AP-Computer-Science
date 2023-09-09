public class S07Rater
{
	private String name; // name of company
	private double rating; // number rating (1 - 5)


	public S07Rater() {
	}

	// Set the company name
	public void setCompany(String company) {
		// Insert code here..
		name = company;
	}

	// Set rating to newRating
	// As long as it's no more than 5
	public void setRating(double newRating) {
		// Insert code here...
		if (newRating <= 5) {
			rating = newRating;
		}
	}

	// Returns the rating of the company
	public double getRating() {
		return rating;
	}

	// Returns a string representation of the company
	// based on their ratings
	public String toString() {
		// Insert code here and replace the current return statement.
		String x;
		if (getRating() < 2) {
			x = "Not Recommended Company " + name;
		}
		else if (getRating() > 3.5) {
			x = "Gold Star Company " + name;
		}
		else {
			x = "Well Rated Company " + name;
		}
		return x;
	}
}
