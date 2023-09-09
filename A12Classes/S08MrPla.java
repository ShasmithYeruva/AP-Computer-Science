
public class S08MrPla {
	// initializing the variables
	private String name;
	private boolean isHero;
	private int age;
	private double power;
	private S08WowVehicle vehicle;


	// A constructor with a string, boolean, integer, a 
	// double, and a S08WowVehicle
	public S08MrPla(String name,boolean isHero,int age, 
			double power, S08WowVehicle vehicle)
	{
		this.name = name;
		this.isHero = isHero;
		this.age = age;
		this.power = power;
		this.vehicle = vehicle;
	}

	// This is the toString and it prints the instances in full messages
	public String toString()
	{
		String x;
		if (isHero == false)
			x = "an anti-hero";
		else {
			x = "a hero";
		}
		return name + " is " + x + ", is " + age + " years old,"
		+ " and has a power level of " + power + ". \n" + vehicle;

	}
}
