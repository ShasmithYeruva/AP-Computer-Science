
public class S06HealthyFood extends S06Food {
	private String group;
	private String color;
	public String getGroup() {
		return group;
	}
	public String getColor() {
		return color;
	}

	public S06HealthyFood(String foodName, int calories, 
			String foodGroup, String foodColor) {
		super(foodName, calories);
		group = foodGroup;
		color = foodColor;
	}
}
