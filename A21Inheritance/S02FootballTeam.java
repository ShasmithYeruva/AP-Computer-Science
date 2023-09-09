public class S02FootballTeam extends S02Team {
	private int ties;


	public S02FootballTeam(String name, String location,
			int wins, int losses, int ties) {
		super(name, location, wins, losses);
		constructor01++;
		this.ties = ties;
	}

	public int getTies() {
		method01++;
		return ties;
	}

	public String toString(){
		method02++;
		return super.getWins() + " - " + super.getLosses() + " - " + ties;
	}
	public static int constructor01 = 0;
	public static int method01 = 0;
	public static int method02 = 0;

}
