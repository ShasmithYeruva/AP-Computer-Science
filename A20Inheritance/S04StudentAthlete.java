
public class S04StudentAthlete extends S04Student {
	private String sport;
	private String level;

	// Add the constructor here
	public S04StudentAthlete(String name, int id, double gpa, String sport, String level) {
		super(name, id, gpa);
		this.sport = sport;
		this.level = level;
	}

	public String getSport(){
		return sport;
	}

	public String getLevel(){
		return level;
	}


	@Override
	public String toString(){
		return super.toString() + " plays " + sport;
	}

}
