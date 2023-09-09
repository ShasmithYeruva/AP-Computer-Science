
public class S06Food {
	private String name;
	private int calories;
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}

	public S06Food (String foodName, int calories) {
		name = foodName;
		this.calories = calories;
	}
	public String toString() {
		return name + " has " + calories + "calories";
	}
}
