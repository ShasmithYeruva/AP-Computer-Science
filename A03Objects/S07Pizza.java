
public class S07Pizza {
	// Add the instance variables here
	private String type;
	private String toppings;
	private int size;
	// Put the constructor here
	public S07Pizza(String type, String toppings, int size)
	{
		this.type = type;
		this.toppings = toppings;
		this.size = size;
	}
	// You don't need to do anything with this method
	// used to print the object except to uncomment the code.
	public String toString()
	{
		return size + " inch " + type + " pizza with " + toppings;
	}

}
