
public class S08Soccer {
	// Initializing the variables
	private String country;
	private double blockGoalPercentage;
	private double scoreGoalPercentage;
	int goalsScored = 0;

	// getter for the country
	public String getCountry() {
		return country;
	}

	// setter for the country
	public void setCountry(String country) {
		this.country = country;
	}

	// getter for the blockGoalPercentage
	public double getBlockGoalPercentage() {
		return blockGoalPercentage;
	}

	// setter for the blockGoalPercentage
	public void setBlockGoalPercentage(double blockGoalPercentage) {
		this.blockGoalPercentage = blockGoalPercentage;
	}

	// getter for the scoreGoalPercentage
	public double getScoreGoalPercentage() {
		return scoreGoalPercentage;
	}

	// setter for the scoreGoalPercentage
	public void setScoreGoalPercentage(double scoreGoalPercentage) {
		this.scoreGoalPercentage = scoreGoalPercentage;
	}

	//	This method returns 1 if the home object wins,
	//	returns -1 if the away team wins,
	//	and returns 0 if it is a tie
	public int playMatch(S08Soccer other) {
		int localShotsOnGoal = (int)((Math.random() * 5) + 1);
		goalsScored = (int) (localShotsOnGoal * other.blockGoalPercentage * scoreGoalPercentage);
		int otherShotsOnGoal = (int)((Math.random() * 5) + 1);
		other.goalsScored = (int) (otherShotsOnGoal * other.blockGoalPercentage * scoreGoalPercentage);
		if(goalsScored > other.goalsScored) {
			return 1;
		}
		else if (other.goalsScored > goalsScored) {
			return -1;
		}
		else {
			return 0;
		}
	}

	//	This method returns 
	//	true if the home object wins the shootout and
	// returns false when the away team wins the shootout
	public boolean shootOut(S08Soccer other) {
		goalsScored = 0;
		other.goalsScored = 0;

		while (goalsScored == other.goalsScored) {
			goalsScored = (int)(Math.random() + .5);
			other.goalsScored = (int)(Math.random() + .5);
		}

		if(goalsScored == 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
