public class S05Food {
	private String food = "";
	private int calories = 0;
	public S05Food(String food, int calories){
		this.food = food;
		this.calories = calories;
	}
	public String getFood() {
		return food;
	}
	public int getCalories() {
		return calories;
	}
	public void setFood(String x) {
		food = x;
	}
	public void setCalories(int x) {
		calories = x;
	}
	public String toString() {
		return getFood() + " have "+ getCalories() + " calories.\n"
				+ "How many would you like?";
	}
	public int total(int x) {
		return getCalories() * x;
	}
}
