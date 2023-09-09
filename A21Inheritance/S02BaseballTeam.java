public class S02BaseballTeam extends S02Team {
	private String league;

	public S02BaseballTeam(String name, String location,
			int wins, int losses, String league) {
		super(name, location, wins, losses);
		constructor01++;
		this.league = league;
	}

	public String getLeague() {
		method01++;
		return league;
	}

	public static int constructor01 = 0;
	public static int method01 = 0;

}