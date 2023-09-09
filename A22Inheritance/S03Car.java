public class S03Car extends S03Vehicle {
	private String make;
	private String model;

	public S03Car(String make, String model)
	{
		super("Car", true, 4);
		constructor01++;
		this.make = make;
		this.model = model;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public static int constructor01 = 0;

}
