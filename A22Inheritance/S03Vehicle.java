public class S03Vehicle {
	private String name;
	private boolean engine;
	private int wheels;

	public S03Vehicle(String name, boolean engine, int wheels)
	{
		constructor01++;
		this.name = name;
		this.engine = engine;
		this.wheels = wheels;
	}

	public String getName()
	{
		method01++;
		return name;
	}

	public boolean hasEngine()
	{
		method02++;
		return engine;
	}

	public int getWheels()
	{
		method03++;
		return wheels;
	}


	public static int constructor01 = 0;
	public static int method01 = 0;
	public static int method02 = 0;
	public static int method03 = 0;
}
