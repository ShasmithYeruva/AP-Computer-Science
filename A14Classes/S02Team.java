
public class S02Team {
	// Static Variables
	// ...
	static int totalTeams;

	static int minTeams = 6;


	// Public Methods
	public S02Team() 
	{
		// Some code here...
		totalTeams ++;
	}

	// Static Methods 
	public static boolean tournamentReady()
	{
		boolean x = false;
		if (totalTeams >= minTeams) {
			x = true;
		}
		return x;
	}

}