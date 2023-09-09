
public class S03Bicycle extends S03Vehicle {
	private String color;
	private String type;

	public S03Bicycle(String color, String type)
	{
		super("Bicycle", false, 2);
		constructor01++;
		this.color = color;
		this.type = type;
	}

	public String getColor()
	{
		return color;
	}

	public String getType()
	{
		return type;
	}

	public static int constructor01 = 0;

}
