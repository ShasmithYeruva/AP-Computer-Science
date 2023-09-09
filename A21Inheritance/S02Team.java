
public class S02Team {
	private String name;
	private String location;
	private int wins;
	private int losses;

	public S02Team(String name, String location, int wins, int losses) {
		constructor01++;
		this.name = name;
		this.location = location;
		this.wins = wins;
		this.losses = losses;
	}

	public String getName() {
		method01++;
		return name;
	}

	public String getLocation() {
		method02++;
		return location;
	}

	public int getWins() {
		method03++;
		return wins;
	}

	public int getLosses() {
		method04++;
		return losses;
	}

	public String toString(){
		method05++;
		return wins + " - " + losses;
	}

	public static int constructor01 = 0;
	public static int method01 = 0;
	public static int method02 = 0;
	public static int method03 = 0;
	public static int method04 = 0;
	public static int method05 = 0;

}
