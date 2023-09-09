
public class S08Wow {
	// Initializing the variables
	private String name; // name of the student
	private double pagesRead; // number pages read in the textbook


	public S08Wow() {
	}

	// Sets the student's name
	public void setStudent(String name) {
		this.name = name;
	}

	// Sets pagesRead to increasedPagesRead
	// As long as it's more than 0
	public void setPagesRead(double pages) {
		if (pages > 1) {
			pagesRead = pages;
		}
	}

	// Returns the amount of pages read by the student
	public double getPagesRead() {
		return pagesRead;
	}

	// Returns a string representation of if the pages read
	// by the student is enough for the day
	public String toString() {
		String x;
		if (getPagesRead() < 10) {
			x = name + " needs to read at least " + (15 - getPagesRead()) 
					+ " more pages in the textbook today";
		}
		else if (15 > getPagesRead() && getPagesRead() >= 10) {
			x = name + " is almost done! However they still need to read " + 
					(15 - getPagesRead()) + " more pages in the "
					+ "textbook today";
		}
		else {
			x = name + " has read enough pages in the texbook today"
					+ " as they have read " + getPagesRead() + " pages";
		}
		return x;
	}
}
