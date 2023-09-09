
public class S08CarModel {
	private String name;
	private int speed;

	public S08CarModel(String theName, int theSpeed)
	{
		this.name = theName;
		this.speed = theSpeed;
	}

	public String getName() 
	{ 
		return this.name;
	}

	public int getSpeed() 
	{ 
		return this.speed; 
	}

	public String toString()
	{
		return this.name + " with a top speed of " + this.speed;
	}

}
