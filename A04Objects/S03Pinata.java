
public class S03Pinata {
	// Instance variables
	private String candy;    // what kind of candy is inside
	private String color;    
	private String shape;

	// Constructor without parameters
	public S03Pinata()
	{
		candy = "hard candy";
		color = "rainbow";
		shape = "donkey";
	}

	// Add an overloaded constructor that allows the user
	// to customize all of the instance variables
	public S03Pinata(String candy, String color, String shape) {
		this.candy = candy;
		this.color = color;
		this.shape = shape;
	}
	// Add an overloaded constructor that allows the user
	// to customize the color and shape
	public S03Pinata(String color, String shape) {
		candy = "hard candy";
		this.color = color;
		this.shape = shape;
	}
	// Add an overloaded constructor that allows the user
	// to customize the candy
	public S03Pinata(String candy) {
		this.candy = candy;
		color = "rainbow";
		shape = "donkey";
	}

	public String toString()
	{
		return color + " " + shape + " pinata filled with " + candy;
	}

}
