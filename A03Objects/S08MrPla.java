
public class S08MrPla {
	// initializing the variables
	private String name;
	private boolean isHero;
	private int age;
	private double power;



	// A constructor with a string, boolean, integer, and a double
	public S08MrPla(String name,boolean isHero,int age, double power)
	{
		this.name = name;
		this.isHero = isHero;
		this.age = age;
		this.power = power;
	}
	// This is the toString and it prints the instances in full messages
	public String toString()
	{
		return name + " is a hero: " + isHero + " , is " + age + 
				" years old, and has a power level of " + power;

	}
}
