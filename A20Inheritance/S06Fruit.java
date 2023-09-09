
public class S06Fruit extends S06HealthyFood {
	private boolean inSeason;
	private String vitamins;
	public boolean isInSeason() {
		return inSeason;
	}
	public String getVitamins() {
		return vitamins;
	}
	public S06Fruit(String foodName, int calories, String foodColor, 
			boolean isInSeason, String majorVitamins) {
		super(foodName, calories, "Fruit", foodColor);
		inSeason = isInSeason;
		vitamins = majorVitamins;
	}
}
